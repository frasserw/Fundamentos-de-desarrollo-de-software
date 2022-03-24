
public class NoPerecedero extends Producto{
	private int tipo;

	/**
	 * @param codigo
	 * @param descripcion
	 * @param precio
	 * @param cantidadActual
	 * @param tipo
	 */
	public NoPerecedero(int codigo, String descripcion, int precio, int cantidadActual, int tipo) {
		super(codigo, descripcion, precio, cantidadActual);
		this.tipo = tipo;
	}

	/**
	 * @return the tipo
	 */
	public int getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	
	
	
}
