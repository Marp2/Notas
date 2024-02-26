import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Procesos {
	
	List<Estudiante> listEstudiantes;
	List<Materias> listMaterias;
	List<Docentes> listDocentes ;

	public void iniciar() {

		String contrasena = "mariana123";
		
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese Contraseña: ");
        String contrasena2 = scanner.nextLine(); 
        
        if (contrasena2.equals(contrasena)) {
            menu();
        }
        else{
            System.err.println("Contraseña incorrecta");
        }
	}
	
	public void menu(){

        String menu = "PANEL ADMINISTRATIVO \n\n";
        menu += "1. Agregar Estudiante\n";
        menu += "2. Agregar Materias\n";
        menu += "3. Agregar Docentes\n";
        menu += "4. Salir\n";
        menu += "Seleccione una Opcion: ";

        Scanner scanner = new Scanner(System.in);
        System.out.println(menu);
        int opcion = scanner.nextInt(); 

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
				
			    break;
        
            default:
            	System.out.println("Error");
                break;
        }

    }
	
	public void agregarEstudiante() {
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el Nombre del Estudiante");
        String nombre = scanner.nextLine();
        
        System.out.println("Ingrese el Apellido del Estudiante");
        String apellido = scanner.nextLine();
        
        System.out.println("Ingrese la Identificacion del Estudiante");
        int edad = scanner.nextInt();
        
        System.out.println("Ingrese la edad del Estudiante");
        int identificacion = scanner.nextInt();
		
		Estudiante estudiantes = new Estudiante(nombre, apellido, identificacion, edad);
		listEstudiantes = new ArrayList<>();
		
		listEstudiantes.add(estudiantes);
		System.out.println(listEstudiantes);
		
		menu();
	}
	
	public void agregarMaterias() {
		
	}
	
	public void agregarDocentes() {
		
	}
}
