package ejercicio3;

public class Vuelo {
	private int numero;
	private String ciudadSalida;
	private String ciudadLlegada;
	private Piloto piloto;
	private Pasajero[] puestos;
	/**
	 * Crea un arreglos de Pasajeros por composición.
	 * @param numero
	 * @param ciudadSalida
	 * @param ciudadLlegada
	 */
	public Vuelo(int numero, String ciudadSalida, String ciudadLlegada, int nPuestos) {
		super();
		this.numero = numero;
		this.ciudadSalida = ciudadSalida;
		this.ciudadLlegada = ciudadLlegada;
		//Esta es la composición
		this.puestos =new Pasajero[nPuestos];
	}
	/**
	 * Método para asignar el objeto piloto por agregación
	 * @param piloto
	 */
	public void agregarPiloto(Piloto piloto) {
		this.piloto = piloto;
	}
	/**
	 * Método asigna un pasajero a la lista de pasajeros del vuelo
	 * @param pasajero
	 */
	public void asignarPasajero(Pasajero pasajero) {
		for (int i = 0; i < puestos.length; i++) {
			if(puestos[i] == null) {
				puestos[i] = pasajero;
				break;
			}
		}
	}
	/**
	 * Método muestra la lista de pasajeros en el vuelo
	 */
	public void listaPasajeros() {
		for (Pasajero pasajero : puestos) {
			System.out.println(pasajero);
		}
	}
	/**
	 * Método busca un pasajero en la lista de pasajeros del vuelo
	 * @param id
	 * @return un objeto pasaje con estado o sin estado null
	 */
	public Pasajero buscaPasajero(int id) {
		Pasajero p=null;
		for (Pasajero pasajero : puestos) {
			if(pasajero.getId() == id) {
				p = pasajero;
				break;
			}
		}
		return p;
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
	 * @return the ciudadSalida
	 */
	public String getCiudadSalida() {
		return ciudadSalida;
	}
	/**
	 * @param ciudadSalida the ciudadSalida to set
	 */
	public void setCiudadSalida(String ciudadSalida) {
		this.ciudadSalida = ciudadSalida;
	}
	/**
	 * @return the ciudadLlegada
	 */
	public String getCiudadLlegada() {
		return ciudadLlegada;
	}
	/**
	 * @param ciudadLlegada the ciudadLlegada to set
	 */
	public void setCiudadLlegada(String ciudadLlegada) {
		this.ciudadLlegada = ciudadLlegada;
	}
	/**
	 * @return the piloto
	 */
	public Piloto getPiloto() {
		return piloto;
	}
	/**
	 * @param piloto the piloto to set
	 */
	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}
	/**
	 * @return the puestos
	 */
	public Pasajero[] getPuestos() {
		return puestos;
	}
	/**
	 * @param puestos the puestos to set
	 */
	public void setPuestos(Pasajero[] puestos) {
		this.puestos = puestos;
	}

	
}
