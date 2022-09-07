package tienda.data;

public class Producto {
	private int codigo;
	private String descripcion;
	private Tipo tipo;
	private Fecha fecha;
	private long precio;
	private int cantidad;
	/**
	 * @param codigo
	 * @param descripcion
	 * @param tipo
	 * @param fecha
	 * @param precio
	 * @param cantidad
	 */
	public Producto(int codigo, String descripcion, Tipo tipo, Fecha fecha, long precio, int cantidad) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.tipo = tipo;
		this.fecha = fecha;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	public Fecha getFecha() {
		return fecha;
	}
	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}
	public long getPrecio() {
		return precio;
	}
	public void setPrecio(long precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public String toString() { 
		return this.tipo.getTipo() + "   " + this.codigo + "       " + this.descripcion + "            " + this.precio+ "   " + "  " + this.cantidad + " " + fecha;
	}
	
	

}
