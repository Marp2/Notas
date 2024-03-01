import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;
/**
 * La clase Procesos maneja las operaciones del sistema.
 */
public class Procesos {
	
//	Listas para almacenar estudiantes, materias y docentes
	private List<Estudiante> listEstudiantes;
	private List<Materias> listMaterias;
	private List<Docentes> listDocentes ;
	
	public Procesos() {
        listEstudiantes = new ArrayList<>();
        listMaterias = new ArrayList<>();
        listDocentes = new ArrayList<>();
    }
	
	
	// Método para iniciar el sistema, solicita una contraseña y muestra el menú principal
	public void iniciar() {

		String contrasena = "mariana123";
		
		String menu = "MENU PRINCIPAL\n\n";
		menu += "1. Administrador\n";
		menu += "2. Estudiante\n";
		menu += "3. Salir\n";
		
		int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
		
		switch (opcion) {
		case 1:
			String contrasena1 = JOptionPane.showInputDialog("Ingrese la Contraseña");
			
			while (!contrasena1.equals(contrasena)) {
	            contrasena1 = JOptionPane.showInputDialog("Ingrese la Contraseña");
			}
			
			menu();
			break;
			
		case 2:
			int identificacionBuscada = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la identificación del estudiante: "));

			 // Buscar el estudiante por su identificación
			Estudiante estudiantes = new Estudiante();
		    boolean encontrado = false;
		    for (Estudiante estudiante : listEstudiantes) {
		        if (estudiante.getIdentificacion() == identificacionBuscada) {
		        	estudiantes.setNombre(estudiante.getNombre());
		        	estudiantes.setApellido(estudiante.getApellido());
		        	estudiantes.setIdentificacion(estudiante.getIdentificacion());
		        	estudiantes.setCodMateria(estudiante.getCodMateria());
		        	estudiantes.setEdad(estudiante.getEdad());
		        	estudiantes.setNota(estudiante.getNota());
		        	System.out.println(estudiantes.toString());
		            encontrado = true;
		            break;
		        }
		    }
		    
		 // Si se encontró el estudiante, mostrar sus materias y notas

			if (encontrado) {
		        StringBuilder mensaje = new StringBuilder("Materias con notas para el estudiante " + estudiantes.getNombre() + " " + estudiantes.getApellido() + ":\n");
		        List<MateriaEstudiantes> materiasConNotas = estudiantes.getMateriasConNotas();
		        for (MateriaEstudiantes materiaEstudiante : materiasConNotas) {
		            mensaje.append("Materia: ").append(materiaEstudiante.getCodMateria()).append(", Nota: ").append(materiaEstudiante.getNota()).append("\n");
		        }
		        JOptionPane.showMessageDialog(null, mensaje.toString());
		    } else {
		        JOptionPane.showMessageDialog(null, "No se encontró ningún estudiante con la identificación ingresada.");
		    }
			
			break;

		default:
			break;
		}
		

	}
	
	// Método que muestra el menú principal y gestiona las opciones seleccionadas por el usuario
	public void menu(){

        String menu = "PANEL ADMINISTRATIVO \n\n";
        menu += "1. Agregar Estudiante\n";
        menu += "2. Agregar Materias\n";
        menu += "3. Agregar Docentes\n";
        menu += "4. Menu Principal\n";
        menu += "5. Salir\n";
        menu += "Seleccione una Opcion: ";

        
        int opcion;
        try {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            menu();
            return;
        }
  
        switch (opcion) {
            case 1:
                agregarEstudiante();
                break;
           
            case 2:
     
            	agregarMaterias();
                break;
                
			case 3:
				agregarDocentes();

			    break;
			    
			case 4:
				
				iniciar();
				break;
				
			   
			case 5:
				JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                System.exit(0);
				
			    break;
        
            default:
            	JOptionPane.showMessageDialog(null, "Opción no válida", "Error", JOptionPane.ERROR_MESSAGE);
                menu();        }

    }
	
	/**
     * Agrega un nuevo estudiante al sistema.
     */
	
	public void agregarEstudiante() {
		boolean agregarOtraMateria = true;
	    
	    do {
		
		// Solicitar información del estudiante al admin
		String nombre = JOptionPane.showInputDialog("Ingrese el Nombre del Estudiante: ");
        String apellido = JOptionPane.showInputDialog("Ingrese el Apellido del Estudiante: ");
        int identificacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Identificacion del Estudiante: "));
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del Estudiante: "));
        String codigoMateria = JOptionPane.showInputDialog("Ingrese el codigo de la materia: ");
        double nota = 	Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota para la materia: "));
		
     // Crear un objeto Estudiante con la información proporcionada
        Estudiante estudiante = new Estudiante(nombre, apellido, identificacion, edad, codigoMateria, nota);

        // Agregar el estudiante a la lista de estudiantes y mostrar el menú nuevamente
        listEstudiantes.add(estudiante);
        
        System.out.println(listEstudiantes.toString());
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea ingresar otra materia?", "Confirmación", JOptionPane.YES_NO_OPTION);
        agregarOtraMateria = (respuesta == JOptionPane.YES_OPTION);
    } while (agregarOtraMateria);
        
        JOptionPane.showMessageDialog(null, "Estudiante agregado correctamente");

        menu();
    }
          
   
	
	// Método para agregar materias
	public void agregarMaterias() {
		
		 int codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo de la Materia: "));
		 String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la Materia: ");
	     int capacidadMaxEstudiantes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Capacidad Maxima de Estudiantes: "));
	     int estadoApertura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Estado de apertura: "));
	     double indicadorHabilitacion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el indicador de Habilitacion: "));
	     
	     Materias materia = new Materias(codigo, nombre, capacidadMaxEstudiantes, estadoApertura, indicadorHabilitacion);
	     if (listMaterias == null) {
	    	 listMaterias = new ArrayList<>();
	        }
	   	listMaterias.add(materia);
	   	JOptionPane.showMessageDialog(null, "Materia agregada correctamente");
	        
        
	   	menu();
	}
	
	// Método para agregar docentes 
	public void agregarDocentes() {
		

		String nombre = JOptionPane.showInputDialog("Ingrese el nombre del Docente: ");
        String apellido = JOptionPane.showInputDialog("Ingrese el Apellido del docente: ");
        int identificacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Identificacion del Docente: "));

        Docentes docente = new Docentes(nombre, apellido, identificacion);
        if (listDocentes == null) {
            listDocentes = new ArrayList<>();
        }
        listDocentes.add(docente);
        JOptionPane.showMessageDialog(null, "Docente agregado correctamente");
        menu();
	}
        
	// Método para asignar un docente a una materia
        public void asignarDocenteMateria() {
        
        String codigoMateria = JOptionPane.showInputDialog("Ingrese el código de la Materia:");
        int codigoDocente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del Docente:"));

     // Buscar la materia y el docente por sus códigos
        Materias materia = buscarMateriaPorCodigo(codigoMateria);
        Docentes docente = buscarDocentePorCodigo(codigoDocente);

     // Asignar el docente a la materia si ambos existen
        if (materia != null && docente != null) {
            materia.setDocenteAsignado(docente);
            JOptionPane.showMessageDialog(null, "Docente asignado correctamente a la materia.");
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo asignar el docente a la materia.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    
    }
		
	
        // Método para buscar una materia por su código
	private Materias buscarMateriaPorCodigo(String codigo) {
        for (Materias materia : listMaterias) {
            if (materia.getCodigo().equals(codigo)) {
                return materia;
            }
        }
        return null;
    }

	// Método para buscar un docente por su código
    private Docentes buscarDocentePorCodigo(int codigo) {
        for (Docentes docente : listDocentes) {
            if (docente.getIdentificacion() == codigo) {
                return docente;
            }
        }
        return null;
    }
    
    // Método para calcular el promedio aritmético de las calificaciones de un estudiante
    public double calcularPromedioEstudiante(Estudiante estudiante) {
        List<MateriaEstudiantes> materiasConNotas = estudiante.getMateriasConNotas();
        double sumaNotas = 0;
        int cantidadMaterias = materiasConNotas.size();
        
        for (MateriaEstudiantes materiaEstudiante : materiasConNotas) {
            sumaNotas += materiaEstudiante.getNota();
        }
        
        return cantidadMaterias > 0 ? sumaNotas / cantidadMaterias : 0;
        
    }

 // Método para calcular y mostrar el estado del estudiante según su promedio semestral
    public void mostrarEstadoEstudiante(Estudiante estudiante) {
        double promedio = calcularPromedioEstudiante(estudiante);
        String mensaje = "Promedio semestral: " + promedio + "\n";

     // Determinar el estado del estudiante según su promedio
        if (promedio >= 2.0 && promedio <= 3.0) {
            mensaje += "Su promedio se encuentra entre 2.0 y 3.0. Estará en período de prueba el próximo semestre.";
        } else if (promedio < 2.0) {
            mensaje += "Su promedio es inferior a 2.0. Su matrícula es condicional.";
        } else {
            mensaje += "Su promedio es superior a 3.0.";
        }

        JOptionPane.showMessageDialog(null, mensaje);
    }

    // Método para calcular el promedio aritmético de las calificaciones de una materia
    public double calcularPromedioMateria(String codigoMateria) {
        double sumaNotas = 0;
        int cantidadEstudiantes = 0;
        
        for (Estudiante estudiante : listEstudiantes) {
            for (MateriaEstudiantes materiaEstudiante : estudiante.getMateriasConNotas()) {
                if (materiaEstudiante.getCodMateria().equals(codigoMateria)) {
                    sumaNotas += materiaEstudiante.getNota();
                    cantidadEstudiantes++;
                    break; 
    // No es necesario seguir iterando una vez que encontramos la materia para el estudiante
                }
            }
        }
      
        return cantidadEstudiantes > 0 ? sumaNotas / cantidadEstudiantes : 0;
    }
    
 // Método para que los estudiantes vean sus calificaciones y promedio de materias cerradas
    public void verCalificacionesEstudiante(Estudiante estudiante) {
        // Obtener la lista de materias cerradas
        List<Materias> materiasCerradas = obtenerMateriasCerradas();

        // Verificar si hay materias cerradas
        if (materiasCerradas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay materias cerradas para mostrar calificaciones.");
            return;
        }

        // Construir mensaje con calificaciones y promedio de materias cerradas
        StringBuilder mensaje = new StringBuilder("Calificaciones en materias cerradas:\n");
        double sumaCalificaciones = 0;
        int cantidadMaterias = 0;

        // Iterar sobre las materias cerradas
        for (Materias materia : materiasCerradas) {
            // Verificar si el estudiante está inscrito en la materia
            if (estudiante.estudianteInscritoEnMateria(materia)) {
                mensaje.append("Materia: ").append(materia.getNombre()).append("\n");
                // Iterar sobre las calificaciones del estudiante en la materia
                for (MateriaEstudiantes materiaEstudiante : materia.getCalificacionesEstudiante(estudiante)) {
                    mensaje.append(" - ").append(materiaEstudiante.getCodMateria()).append(": ").append(materiaEstudiante.getNota()).append("\n");
                    sumaCalificaciones += materiaEstudiante.getNota();
                    cantidadMaterias++;
                }
            }
        }

        // Calcular y mostrar promedio de calificaciones de materias cerradas
        double promedio = cantidadMaterias > 0 ? sumaCalificaciones / cantidadMaterias : 0;
        mensaje.append("\nPromedio de calificaciones en materias cerradas: ").append(promedio);

        // Mostrar mensaje con las calificaciones y promedio
        JOptionPane.showMessageDialog(null, mensaje.toString());
    }

    // Método para obtener la lista de materias cerradas
    private List<Materias> obtenerMateriasCerradas() {
        List<Materias> materiasCerradas = new ArrayList<>();
        for (Materias materia : listMaterias) {
            if (materia.getEstadoApertura() == 0) { // Suponiendo que un estado de 0 indica que la materia está cerrada
                materiasCerradas.add(materia);
            }
        }
        return materiasCerradas;
    }
    
	public List<Estudiante> getListEstudiantes(Estudiante estudiante) {
		return listEstudiantes;
	}

	public void setListEstudiantes(List<Estudiante> listEstudiantes) {
		this.listEstudiantes = listEstudiantes;
	}

	public List<Materias> getListMaterias() {
		return listMaterias;
	}

	public void setListMaterias(List<Materias> listMaterias) {
		this.listMaterias = listMaterias;
	}

	public List<Docentes> getListDocentes() {
		return listDocentes;
	}

	public void setListDocentes(List<Docentes> listDocentes) {
		this.listDocentes = listDocentes;
	}
}
