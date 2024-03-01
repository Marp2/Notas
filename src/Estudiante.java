import java.util.List;

public class Estudiante extends Persona{

	private int edad;
	private String codMateria;
	private double nota;
	private List<MateriaEstudiantes> materiasConNotas; 
	
	public Estudiante() {
		super();	
	}
	
	public Estudiante(String nombre, String apellido, int identificacion, int edad, String codMateria, double nota) {
		super(nombre, apellido, identificacion);
		this.edad = edad;
		this.nota = nota;
		this.codMateria = codMateria;
		
	}
	

	public List<MateriaEstudiantes> getMateriasConNotas() {
		return materiasConNotas;
	}


	public void setMateriasConNotas(List<MateriaEstudiantes> materiasConNotas) {
		this.materiasConNotas = materiasConNotas;
	}



	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	

	public String getCodMateria() {
		return codMateria;
	}



	public void setCodMateria(String codMateria) {
		this.codMateria = codMateria;
	}
	
	



	public double getNota() {
		return nota;
	}


	public void setNota(double nota) {
		this.nota = nota;
	}


	@Override
	public String toString() {
		return "Estudiante \n"
				+ "Nombre= "+ getNombre() +"\n"
				+ "Apellido= "+ getApellido() +"\n"
				+ "Identificacion= "+ getIdentificacion() +"\n"
				+ "Edad= "+ getEdad() +"\n"
				+ "CodMateria= "+ getCodMateria() +"\n"
				+ "nota= "+ getNota() +"\n";
	}


	public boolean estudianteInscritoEnMateria(Materias materia) {
		// TODO Auto-generated method stub
		return false;
	}


}
