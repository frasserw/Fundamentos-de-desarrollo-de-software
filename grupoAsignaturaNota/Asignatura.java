package grupoAsignaturaNota;
/**
 * 
 * @author Labing-PC
 *
 */
public class Asignatura {
	private int codigo;
	private String denominación;
	/**
	 * @param codigo
	 * @param denominación
	 */
	public Asignatura(int codigo, String denominación) {
		super();
		this.codigo = codigo;
		this.denominación = denominación;
	}
	/**
	 * 
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
	 * @return the denominación
	 */
	public String getDenominación() {
		return denominación;
	}
	/**
	 * @param denominación the denominación to set
	 */
	public void setDenominación(String denominación) {
		this.denominación = denominación;
	}
	@Override
	public String toString() {
		return " Codigo " + this.codigo + " Denominación " + this.denominación;
	}
	
}
