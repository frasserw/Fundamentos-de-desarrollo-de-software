package tienda;

public class Producto {
	private Tipo tipo;
	private int codigo;
	private String descripcion;
	private int precioVenta;
	private int cantidad;
	private Fecha fecha;
	/**
	 * 
	 * @param tipo
	 * @param codigo
	 * @param precioVenta
	 * @param cantidad
	 * @param fecha
	 */
	public Producto(Tipo tipo, int codigo, String descripcion, int precioVenta, int cantidad, Fecha fecha) {
		super();
		this.tipo = tipo;
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precioVenta = precioVenta;
		this.cantidad = cantidad;
		this.fecha = fecha;
	}
	/**
	 * 
	 * @return
	 */
	public Tipo getTipo() {
		return tipo;
	}
	/**
	 * 
	 * @param tipo
	 */
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	/**
	 * 
	 * @return
	 */
	public int getCodigo() {
		return codigo;
	}
	/**
	 * 
	 * @param codigo
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	/**
	 * 
	 * @return
	 */	
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * 
	 * @param descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * 
	 * @return
	 */
	public int getPrecioVenta() {
		return precioVenta;
	}
	/**
	 * 
	 * @param precioVenta
	 */
	public void setPrecioVenta(int precioVenta) {
		this.precioVenta = precioVenta;
	}
	/**
	 * 
	 * @return
	 */
	public int getCantidad() {
		return cantidad;
	}
	/**
	 * 
	 * @param cantidad
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	/**
	 * 
	 * @return
	 */
	public Fecha getFecha() {
		return fecha;
	}
	/**
	 * 
	 * @param fecha
	 */
	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}
	@Override
	public String toString() {
		return tipo + " " + codigo + " "+ descripcion +" " +precioVenta + " "+
			   cantidad + fecha;
	}
	
}
