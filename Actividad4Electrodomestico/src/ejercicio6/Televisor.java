package ejercicio6;

public class Televisor extends Electrodomestico{
	private int sintonizador;

	/**
	 * @param codigo
	 * @param marca
	 * @param modelo
	 * @param sintonizador
	 */
	public Televisor(int codigo, String marca, String modelo, int precioBase,int sintonizador) {
		super(codigo, marca, modelo,precioBase);
		this.sintonizador = sintonizador;
	}

	/**
	 * @return the sintonizador
	 */
	public int getSintonizador() {
		return sintonizador;
	}

	/**
	 * @param sintonizador the sintonizador to set
	 */
	public void setSintonizador(int sintonizador) {
		this.sintonizador = sintonizador;
	}
	
	/**
	 * 
	 */
	@Override
	public int calcularPago(int dato) {
		// TODO Auto-generated method stub
		if(sintonizador==10)
			return (dato * 20000)+precioBase;
		else if(sintonizador==20)
				return (dato * 40000)+precioBase;
		else
			return (dato * 50000)+precioBase;
		
		
	}
	/**
	 * 
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Televisor "+super.toString() + " Sintomizador " + this.sintonizador;
	}
}
