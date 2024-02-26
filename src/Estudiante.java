
public class Estudiante extends Persona{

	private int edad;
	
	public Estudiante(String nombre, String apellido, int identificacion, int edad) {
		super(nombre, apellido, identificacion);
		// TODO Auto-generated constructor stub
	}

	

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}



	@Override
	public String toString() {
		return "Estudiante \n "
				+ "Nombre= "+ getNombre() +"\n"
				+ "Apellido= "+ getApellido() +"\n"
				+ "Identificacion= "+ getIdentificacion() +"\n"
				+ "Edad= "+ getEdad() +"\n";
	}


}
