package Vuelo;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Vuelo {
	private int numero;
	private String ciudadSalida;
	private LocalDateTime horaSalida;
	private String ciudadLlegada;
	private LocalDateTime horaLlegada;
	private Piloto piloto;
	private int numeroPasajeros;
	private ArrayList<Pasajero> listaPasajeros;
	/**
	 * @param numero
	 * @param ciudadSalida
	 * @param horaSalida
	 * @param ciudadLlegada
	 * @param horaLlegada
	 * @param piloto
	 * @param numeroPasajeros
	 */
	public Vuelo(int numero, String ciudadS, LocalDateTime horaS, String ciudadL,
			LocalDateTime horaL, Piloto piloto, int nP) {
		super();
		this.numero = numero;
		this.ciudadSalida = ciudadS;
		this.horaSalida = horaS;
		this.ciudadLlegada = ciudadL;
		this.horaLlegada = horaL;
		this.piloto = piloto;
		this.numeroPasajeros = nP;
		this.listaPasajeros =new ArrayList<>();
	}
	/**
	 * Función para adicionar pasajeros al arreglos dinamico
	 * @param p instancia de la clase pasajero 
	 * @return true si adicona el pasajero a laista o false si no adicona el pasajero 
	 */
	public boolean adicionarPasajero(Pasajero p) {
		return this.listaPasajeros.add(p);
	}
	/**
	 * Función para buscar un pasajero en la lista 
	 * @param id numero de identificacion a buscar
	 * @return un instancia pasajero con datos si los encotro o null si no existe
	 */
	public Pasajero buscarPasajero(int id) {
		for (Pasajero pasajero : listaPasajeros) {
			if(pasajero.getId() == id)
				return pasajero;
		}
		return null;
	}
	/**
	 * Muestra la lista de pasajeros
	 */
	public void mostrarListaPasajero() {
		System.out.println(listaPasajeros.toString());
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
	@Override
	public String toString() {
		return "Numero" + numero + " Salida " + ciudadSalida + " Hora " + horaSalida
				+ " Llegada " + ciudadLlegada + " Hora " + horaLlegada + " Piloto=" + piloto
				+ " Pasajeros " + numeroPasajeros + "\n";
	}
	
	
	
}
