package cursonotas;

public class Docente {
	private int id;
	private String nombre;
	private String profesion;
	/**
	 * @param id
	 * @param nombre
	 * @param profesion
	 */
	public Docente(int id, String nombre, String profesion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.profesion = profesion;
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
	 * @return the profesion
	 */
	public String getProfesion() {
		return profesion;
	}
	/**
	 * @param profesion the profesion to set
	 */
	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
}
