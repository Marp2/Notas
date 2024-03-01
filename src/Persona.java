
public class Persona {

	private String nombre;
	private String apellido;
	private int identificacion;
	
	public Persona(String nombre, String apellido, int identificacion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.identificacion = identificacion;
	}

	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}
	
	
}
