
public class Perecedero extends Producto{
	private int diasCaducar;

	/**
	 * @param codigo
	 * @param descripcion
	 * @param precio
	 * @param cantidadActual
	 * @param diasCaducar
	 */
	public Perecedero(int codigo, String descripcion, int precio, int cantidadActual, int diasCaducar) {
		super(codigo, descripcion, precio, cantidadActual);
		this.diasCaducar = diasCaducar;
	}

	/**
	 * @return the diasCaducar
	 */
	public int getDiasCaducar() {
		return diasCaducar;
	}

	/**
	 * @param diasCaducar the diasCaducar to set
	 */
	public void setDiasCaducar(int diasCaducar) {
		this.diasCaducar = diasCaducar;
	}
	
	public int precioFinal(int valor) {
		if(diasCaducar==1)
			return valor -(valor * 4/100);
		else if(diasCaducar==2)
			return valor -(valor * 3/100);
		else if(diasCaducar==3)
			return valor -(valor/2);
		else return valor;
	} 
	

}
