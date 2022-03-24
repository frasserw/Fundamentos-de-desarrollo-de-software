
public class Producto {
	protected int codigo;
	protected String descripcion;
	protected int precio;
	protected int cantidadActual;
	/**
	 * @param codigo
	 * @param descripcion
	 * @param precio
	 * @param cantidadActual
	 */
	public Producto(int codigo, String descripcion, int precio, int cantidadActual) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio = precio;
		this.cantidadActual = cantidadActual;
	}
	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
	 * @return the precio
	 */
	public int getPrecio() {
		return precio;
	}
	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	/**
	 * @return the cantidadActual
	 */
	public int getCantidadActual() {
		return cantidadActual;
	}
	/**
	 * @param cantidadActual the cantidadActual to set
	 */
	public void setCantidadActual(int cantidadActual) {
		this.cantidadActual = cantidadActual;
	}
	/**
	 * Función para calcular el precio a pagar
	 * @param cantidad
	 * @return
	 */
	public int calcular(int cantidad) {
		return cantidad * precio;
	}
	
	public String toString() {
		return " Codigo " + codigo + " Descripcion " + descripcion + " Precio " + precio
				+ " CantidadActual " + cantidadActual + "\n";
	}
	
}
