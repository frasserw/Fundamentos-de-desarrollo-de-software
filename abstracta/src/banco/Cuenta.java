package banco;
/**
 * 
 * @author william frasser acevedo
 *
 */
public abstract class Cuenta {
	protected int numeroCuenta;
	protected long saldo;
	protected Persona titular;
	/**
	 * @param numeroCuenta
	 * @param titular
	 */
	public Cuenta(int numeroCuenta, Persona titular) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.titular = titular;
	}
	/**
	 *M�todo o funci�n abstracta 
	 * @param valor del deposito
	 */
	public abstract void deposito(int valor);
	/**
	 * M�todo o funci�n abstracta
	 * @param valor del retiro
	 */
	public abstract void retiro(int valor);
	/**
	 * @return the numeroCuenta
	 */
	public int getNumeroCuenta() {
		return numeroCuenta;
	}
	/**
	 * @param numeroCuenta the numeroCuenta to set
	 */
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	/**
	 * @return the saldo
	 */
	public long getSaldo() {
		return saldo;
	}
	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(long saldo) {
		this.saldo = saldo;
	}
	/**
	 * @return the titular
	 */
	public Persona getTitular() {
		return titular;
	}
	/**
	 * @param titular the titular to set
	 */
	public void setTitular(Persona titular) {
		this.titular = titular;
	}
	/**
	 * 
	 */
	@Override
	public String toString() {
		return "Cuenta [numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", titular=" + titular + "]";
	}
	
}









