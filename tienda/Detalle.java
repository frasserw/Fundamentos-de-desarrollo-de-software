package tienda;

public class Detalle {
	private int cantidad;
	private Producto producto;
	/**
	 * @param cantidad
	 * @param producto
	 */
	public Detalle(int cantidad, Producto producto) {
		super();
		this.cantidad = cantidad;
		this.producto = producto;
	}
	/**
	 * @return the cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}
	/**
	 * @return the producto
	 */
	public Producto getProducto() {
		return producto;
	}
	
}
