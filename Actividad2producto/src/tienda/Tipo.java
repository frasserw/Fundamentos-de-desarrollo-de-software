package tienda;

public class Tipo {
	private int id;
	private double iva;
	/**
	 * 
	 * @param id
	 * @param iva
	 */
	public Tipo(int id, double iva) {
		super();
		this.id = id;
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
	 * @return the iva
	 */
	public double getIva() {
		return iva;
	}
	/**
	 * @param iva the iva to set
	 */
	public void setIva(double iva) {
		this.iva = iva;
	}
	/**
	 * 
	 */
	@Override
	public String toString() {
		(id == 1 ? return "perecedero" : return "no perecedero");
	}
	
	

}
