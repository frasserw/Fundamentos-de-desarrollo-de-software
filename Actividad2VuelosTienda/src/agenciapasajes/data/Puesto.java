package agenciapasajes.data;

public class Puesto {
	private char letra;
	private int numero;
	private Pasajero pasajero;
	/**
	 * @param letra
	 * @param numero
	 * @param pasajero
	 */
	public Puesto(char letra, int numero) {
		this.letra = letra;
		this.numero = numero;
	}
	/**
	 * @return the letra
	 */
	public char getLetra() {
		return letra;
	}
	/**
	 * @param letra the letra to set
	 */
	public void setLetra(char letra) {
		this.letra = letra;
	}
	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	/**
	 * @return the pasajero
	 */
	public Pasajero getPasajero() {
		return pasajero;
	}
	/**
	 * @param pasajero the pasajero to set
	 */
	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}
	@Override
	public String toString() {
		return "Puesto [letra=" + letra + ", numero=" + numero + ", pasajero=" + pasajero + "]";
	}
	
	
}
