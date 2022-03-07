package ejercicio3;

public class Pasajero {
	private int id;
	private String nombre;
	private String genero;
	private int edad;
	/**
	 * @param id
	 * @param nombre
	 * @param genero
	 * @param edad
	 */
	public Pasajero(int id, String nombre, String genero, int edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}
	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}
	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Pasajero [id=" + id + ", nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + "]";
	}
}
