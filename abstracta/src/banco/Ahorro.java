package banco;
/**
 * 
 * @author william frasser acevedo
 *
 */
public class Ahorro extends Cuenta{
	private int interes;
	/**
	 * @param numeroCuenta
	 * @param titular
	 * @param interes
	 */
	public Ahorro(int numeroCuenta, Persona titular) {
		super(numeroCuenta, titular);
	}
	/**
	 * 
	 */
	@Override
	public void deposito(int valor) {
		// TODO Auto-generated method stub
		this.saldo += valor;
		this.interes += this.saldo * 3/100;
		
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
			System.out.println("Saldo insuficiente " + this.saldo);
		}
		
	}
	@Override
	public String toString() {
		return super.toString()+" Ahorro [interes=" + interes + "]";
	}
	/**
	 * @return the interes
	 */
	public int getInteres() {
		return interes;
	}
	/**
	 * @param interes the interes to set
	 */
	public void setInteres(int interes) {
		this.interes = interes;
	}
	
	
	
	
}
