
public class Comision extends Empleado{
	private final int SALARIOBASE=300000;
	private int numeroDomicilios;
	private final int VALORDOMICILIO=9500;
	/**
	 * @param id
	 * @param nombre
	 * @param fechaIngreso
	 * @param numeroDomicilios
	 */
	public Comision(int id, String nombre, Fecha fechaIngreso, int numeroDomicilios) {
		super(id, nombre, fechaIngreso);
		this.numeroDomicilios = numeroDomicilios;
	}
	/**
	 * @return the numeroDomicilios
	 */
	public int getNumeroDomicilios() {
		return numeroDomicilios;
	}
	/**
	 * @param numeroDomicilios the numeroDomicilios to set
	 */
	public void setNumeroDomicilios(int numeroDomicilios) {
		this.numeroDomicilios = numeroDomicilios;
	}
	/**
	 * @return the sALARIOBASE
	 */
	public int getSALARIOBASE() {
		return SALARIOBASE;
	}
	/**
	 * @return the vALORDOMICILIO
	 */
	public int getVALORDOMICILIO() {
		return VALORDOMICILIO;
	}
	/**
	 * Función pra calcular el valor pagado a un domiciliario
	 * @return el valor a pagar 
	 */
	public int calcularPago() {
		int salario = numeroDomicilios * VALORDOMICILIO;
		return (salario < SALARIOBASE)?SALARIOBASE:(SALARIOBASE+salario);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" "+aniosAntiguedad()+" "+SALARIOBASE+" "+calcularPago()+"\n";
	}
}
