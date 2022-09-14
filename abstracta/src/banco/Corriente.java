package banco;

public class Corriente extends Cuenta{
	private int sobregiro;

	/**
	 * @param numeroCuenta
	 * @param titular
	 * @param sobregiro
	 */
	public Corriente(int numeroCuenta, Persona titular, int sobregiro) {
		super(numeroCuenta, titular);
		this.sobregiro = sobregiro;
	}
	/**
	 * 
	 */
	@Override
	public void deposito(int valor) {
		// TODO Auto-generated method stub
		this.saldo += valor;
		
	}
	/**
	 * 
	 */
	@Override
	public void retiro(int valor) {
		// TODO Auto-generated method stub
		if(this.saldo >= valor) {
			this.saldo -= valor;
		}else {
			
			this.saldo -= valor;
			
		}
		
	}
	@Override
	public String toString() {
		return super.toString() + " Corriente [sobregiro=" + sobregiro + "]";
	}
	/**
	 * @return the sobregiro
	 */
	public int getSobregiro() {
		return sobregiro;
	}
	/**
	 * @param sobregiro the sobregiro to set
	 */
	public void setSobregiro(int sobregiro) {
		this.sobregiro = sobregiro;
	}
		
}
