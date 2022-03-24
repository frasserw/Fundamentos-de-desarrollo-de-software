package ejercicio6;

public class Lavadora extends Electrodomestico{
	private String color;
	private int librasCarga;
	/**
	 * @param codigo
	 * @param marca
	 * @param modelo
	 * @param color
	 * @param librasCarga
	 */
	public Lavadora(int codigo, String marca, String modelo, int precioBase,String color, int librasCarga) {
		super(codigo, marca, modelo,precioBase);
		this.color = color;
		this.librasCarga = librasCarga;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the librasCarga
	 */
	public int getLibrasCarga() {
		return librasCarga;
	}
	/**
	 * @param librasCarga the librasCarga to set
	 */
	public void setLibrasCarga(int librasCarga) {
		this.librasCarga = librasCarga;
	}
	/**
	 * 
	 */
	@Override
	public String toString() {
		return "Lavadora "+super.toString()+" Color " + color + " LibrasCarga " + librasCarga;
	}
	/**
	 * 
	 */
	@Override
	public int calcularPago(int dato) {
		// TODO Auto-generated method stub
		return (librasCarga * dato)+precioBase;
		
	}
		
	
}
