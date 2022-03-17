package Vuelo;

public class Pasajero extends Persona{
	private int edad;
	private char genero;
	/**
	 * @param id
	 * @param nombre
	 * @param edad
	 * @param genero
	 */
	public Pasajero(int id, String nombre, int edad, char genero) {
		super(id, nombre);
		this.edad = edad;
		this.genero = genero;
	}
	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * @return the genero
	 */
	public char getGenero() {
		return genero;
	}
	/**
	 * @param genero the genero to set
	 */
	public void setGenero(char genero) {
		this.genero = genero;
	}
	@Override
	public String toString() {
		return " Edad " + edad + " Genero=" + genero + "\n";
	}
}
