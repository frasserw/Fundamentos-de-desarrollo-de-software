package agregacion;
/**
 * programa 
 * @author william frasser acevedo
 * @since 2022-2-10
 * @version 01
 *
 */
public class Teatro {
	private String nombre;
	private Pelicula pelicula;
	private Taquilla taquilla;
	/**
	 * Constructor de clase
	 * @param nombre
	 */
	public Teatro(String nombre) {
		super();
		this.nombre = nombre;
	}
	/**
	 * Composición 
	 * @param numero entero que define el nuemro de la taquilla
	 * @param valorFuncion entero que define el valor de la funcion
	 */
	public void crearTaquilla(int valorFuncion) {
		this.taquilla =new Taquilla(valorFuncion);
	}
	/**
	 * Agregación 
	 * @param pelicula
	 */
	public void pelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
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
	 * @return the pelicula
	 */
	public Pelicula getPelicula() {
		return pelicula;
	}
	/**
	 * @param pelicula the pelicula to set
	 */
	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}
	/**
	 * @return the taquilla
	 */
	public Taquilla getTaquilla() {
		return taquilla;
	}
	/**
	 * @param taquilla the taquilla to set
	 */
	public void setTaquilla(Taquilla taquilla) {
		this.taquilla = taquilla;
	}
	/**
	 * 
	 */
	public String toString() {
		return "Teatro [nombre=" + nombre + ", pelicula=" + pelicula + "]";
	}
	
}
