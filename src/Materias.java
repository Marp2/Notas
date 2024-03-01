
public class Materias {
	
	private String codigo;
	private String nombre;
	private int capacidadMaxEstudiantes;
	private int estadoApertura;
	private double indicadorHabilitacion;
	
	public Materias(String codigo2, String nombre, int capacidadMaxEstudiantes, int estadoApertura,
			double indicadorHabilitacion) {
		super();
		this.codigo = codigo2;
		this.nombre = nombre;
		this.capacidadMaxEstudiantes = capacidadMaxEstudiantes;
		this.estadoApertura = estadoApertura;
		this.indicadorHabilitacion = indicadorHabilitacion;
	}

	public Materias(int codigo2, String nombre2, int capacidadMaxEstudiantes2, int estadoApertura2,
			double indicadorHabilitacion2) {
		
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCapacidadMaxEstudiantes() {
		return capacidadMaxEstudiantes;
	}

	public void setCapacidadMaxEstudiantes(int capacidadMaxEstudiantes) {
		this.capacidadMaxEstudiantes = capacidadMaxEstudiantes;
	}

	public int getEstadoApertura() {
		return estadoApertura;
	}

	public void setEstadoApertura(int estadoApertura) {
		this.estadoApertura = estadoApertura;
	}

	public double getIndicadorHabilitacion() {
		return indicadorHabilitacion;
	}

	public void setIndicadorHabilitacion(double indicadorHabilitacion) {
		this.indicadorHabilitacion = indicadorHabilitacion;
	}

	public void setDocenteAsignado(Docentes docente) {
		
		
	}

	public MateriaEstudiantes[] getCalificacionesEstudiante(Estudiante estudiante) {
		// TODO Auto-generated method stub
		return null;
	}

	
}

	
	

