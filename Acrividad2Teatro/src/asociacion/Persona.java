package asociacion;

public class Persona {
	private String nombre;

	/**
	 * @param nombre
	 */
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String toString() {
		return "Persona [nombre=" + nombre + "]";
	}
	
}
