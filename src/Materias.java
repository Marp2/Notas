
public class Materias {
	
	private String codigo;
	private String nombre;
	private String capacidadMaxEstudiantes;
	private String estadoApertura;
	private String indicadorHabilitacion;
	
	public Materias(String codigo, String nombre, String capacidadMaxEstudiantes, String estadoApertura,
			String indicadorHabilitacion) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.capacidadMaxEstudiantes = capacidadMaxEstudiantes;
		this.estadoApertura = estadoApertura;
		this.indicadorHabilitacion = indicadorHabilitacion;
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

	public String getCapacidadMaxEstudiantes() {
		return capacidadMaxEstudiantes;
	}

	public void setCapacidadMaxEstudiantes(String capacidadMaxEstudiantes) {
		this.capacidadMaxEstudiantes = capacidadMaxEstudiantes;
	}

	public String getEstadoApertura() {
		return estadoApertura;
	}

	public void setEstadoApertura(String estadoApertura) {
		this.estadoApertura = estadoApertura;
	}

	public String getIndicadorHabilitacion() {
		return indicadorHabilitacion;
	}

	public void setIndicadorHabilitacion(String indicadorHabilitacion) {
		this.indicadorHabilitacion = indicadorHabilitacion;
	}

	
	
}
