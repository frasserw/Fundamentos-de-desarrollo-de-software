package agregacion;
/**
 * 
 * @author willi
 *
 */
public class Pelicula {
	private String nombre;
	private String clasificacion;
	/**
	 * @param nombre
	 * @param clasificacion
	 */
	public Pelicula(String nombre, String clasificacion) {
		super();
		this.nombre = nombre;
		this.clasificacion = clasificacion;
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
	/**
	 * @return the clasificacion
	 */
	public String getClasificacion() {
		return clasificacion;
	}
	/**
	 * @param clasificacion the clasificacion to set
	 */
	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}
	public String toString() {
		return "Pelicula [nombre=" + nombre + ", clasificacion=" + clasificacion + "]";
	}
	
}
