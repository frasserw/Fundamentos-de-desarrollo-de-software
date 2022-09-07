package agenciapasajes.data;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Vuelo {
	private int numero;
	private String ciudadSalida;
	private String ciudadLlegada;
	private Piloto piloto;
	private Puesto[] listaPuestos;
	/**
	 * @param numero
	 * @param ciudadSalida
	 * @param horaSalida
	 * @param ciudadLlegada
	 * @param horaLlegada
	 * @param piloto
	 * @param numeroPasajeros
	 */
	public Vuelo(int numero, String ciudadS, String ciudadL,Piloto piloto, int nSillas) {
		super();
		int nPuesto=100;
		this.numero = numero;
		this.ciudadSalida = ciudadS;
		this.ciudadLlegada = ciudadL;
		this.piloto = piloto;
		this.listaPuestos =new Puesto[nSillas];
		//Crear las sillas para el vuelo
		for (int i=0; i < listaPuestos.length; i++) {
		     if(listaPuestos[i] == null) {
			     listaPuestos[i] =new Puesto('A',nPuesto);
			     nPuesto++;
		     }
		}
	}
	/**
	 * Función para adicionar pasajeros al arreglos dinamico
	 * @param p instancia de la clase pasajero 
	 * @return true si adicona el pasajero a laista o false si no adicona el pasajero 
	 */
	public String adicionarPasajero(Pasajero pasajero) {
		for (Puesto puesto : listaPuestos) {
			if(puesto.getPasajero()==null) {
				puesto.setPasajero(pasajero);
				return "Pasajero asignado a puesto" + puesto;
			}
				
		}
		return "No hay Puestos para Asignar";
	}
	/**
	 * 	
	 */
	public void mostrarLista() {
		for (Puesto puesto : listaPuestos) {
			System.out.println(puesto);
		}
	}
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Pasajero buscarPasajero(int id) {
		for (Puesto puesto : listaPuestos) {
			if(puesto.getPasajero().getId() == id) {
				return puesto.getPasajero();
			}
		}
		return null;
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
	 * @return the listaPuestos
	 */
	public Puesto[] getListaPuestos() {
		return listaPuestos;
	}
	/**
	 * @param listaPuestos the listaPuestos to set
	 */
	public void setListaPuestos(Puesto[] listaPuestos) {
		this.listaPuestos = listaPuestos;
	}
	@Override
	public String toString() {
		return "Vuelo [numero=" + numero + ", ciudadSalida=" + ciudadSalida + ", ciudadLlegada=" + ciudadLlegada
				+ ", piloto=" + piloto + "]";
	}
	
	
}
