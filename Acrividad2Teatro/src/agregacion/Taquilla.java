package agregacion;

public class Taquilla {
	private int valorFuncion;
	/**
	 * @param numero
	 * @param valorFuncion
	 */
	public Taquilla(int valorFuncion) {
		this.valorFuncion = valorFuncion;
	}
		
	/**
	 * 
	 */
	public Taquilla() {
		super();
	}
	/**
	 * @return the valorFuncion
	 */
	public int getValorFuncion() {
		return valorFuncion;
	}
	/**
	 * @param valorFuncion the valorFuncion to set
	 */
	public void setValorFuncion(int valorFuncion) {
		this.valorFuncion = valorFuncion;
	}
	
	public String toString() {
		return "Taquilla [ ValorFuncion=" + valorFuncion + "]";
	}
	
	

}
