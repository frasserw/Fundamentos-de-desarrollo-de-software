package banco;

public class CuentaCorriente extends Cuenta{
	private long sobregiro;

	/**
	 * @param numeroCuenta
	 * @param titular
	 * @param sobregiro
	 */
	public CuentaCorriente(int numeroCuenta, Persona titular, long sobregiro) {
		super(numeroCuenta, titular);
		this.sobregiro = sobregiro;
	}

	@Override
	public void deposito(int valor) {
		// TODO Auto-generated method stub
		this.saldo += valor;
		
	}

	@Override
	public void retiro(int valor) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public String toString() {
		return super.toString() + "CuentaCorriente [sobregiro=" + sobregiro + "]";
	}
	
	
	
	

}
