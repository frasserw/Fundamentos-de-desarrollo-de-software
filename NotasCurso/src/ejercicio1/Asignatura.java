package ejercicio1;

public class Asignatura {
	private String codigo;
	private String denominacion;
	/**
	 * @param codigo
	 * @param denominacion
	 */
	public Asignatura(String codigo, String denominacion) {
		super();
		this.codigo = codigo;
		this.denominacion = denominacion;
	}
	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the denominacion
	 */
	public String getDenominacion() {
		return denominacion;
	}
	/**
	 * @param denominacion the denominacion to set
	 */
	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}
	@Override
	public String toString() {
		return "Asignatura [codigo=" + codigo + ", denominacion=" + denominacion + "]";
	}
}
