package tienda;

public class Tipo {
	private int id;
	private String descripcion;
	private int iva;
	/**
	 * @param id
	 * @param descripcion
	 * @param iva
	 */
	public Tipo(int id, String descripcion, int iva) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.iva = iva;
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
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * @return the iva
	 */
	public int getIva() {
		return iva;
	}
	/**
	 * @param iva the iva to set
	 */
	public void setIva(int iva) {
		this.iva = iva;
	}
	
	

}
