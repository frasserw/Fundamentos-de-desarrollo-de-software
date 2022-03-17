package Vuelo;

public class Piloto extends Persona{
	private int horasVuelo;

	/**
	 * @param id
	 * @param nombre
	 * @param horasVuelo
	 */
	public Piloto(int id, String nombre, int horasVuelo) {
		super(id, nombre);
		this.horasVuelo = horasVuelo;
	}

	/**
	 * @return the horasVuelo
	 */
	public int getHorasVuelo() {
		return horasVuelo;
	}

	/**
	 * @param horasVuelo the horasVuelo to set
	 */
	public void setHorasVuelo(int horasVuelo) {
		this.horasVuelo = horasVuelo;
	}

	@Override
	public String toString() {
		return " HorasVuelo " + horasVuelo + "\n";
	}
	
	
}
