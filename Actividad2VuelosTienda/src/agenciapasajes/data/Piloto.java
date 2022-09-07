package agenciapasajes.data;

public class Piloto{
	private int id;
	private String nombre;
	private int horasVuelo;
	/**
	 * @param id
	 * @param nombre
	 * @param horasVuelo
	 */
	public Piloto(int id, String nombre, int horasVuelo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.horasVuelo = horasVuelo;
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
	 * @return the horasVuelo
	 */
	public int getHorasVuelo() {
		return horasVuelo;
	}
	/**
	 * @param horasVuelo the horasVuelo to set
	 */
	public void setHorasVuelo(int horasVuelo) {
		this.horasVuelo = horasVuelo;
	}
	@Override
	public String toString() {
		return "Piloto [id=" + id + ", nombre=" + nombre + ", horasVuelo=" + horasVuelo + "]";
	}

	
}
