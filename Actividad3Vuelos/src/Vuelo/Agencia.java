package Vuelo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Agencia {
	private Scanner leerDato =new Scanner(System.in);
	private ArrayList<Vuelo> listaVuelo;
	private LocalDateTime fecha = LocalDateTime.now();
	
	/**
	 * 
	 */
	public Agencia() {
		this.listaVuelo =new ArrayList<>();
		
	}
	/**
	 * 
	 * @param vuelo
	 */
	public void adicionarVuelo(Vuelo vuelo) {
		listaVuelo.add(vuelo);
	}
	/**
	 * 
	 * @param numero
	 * @return
	 */
	public Vuelo buscarVuelo(int numero) {
		for (Vuelo vuelo : listaVuelo) {
			if(vuelo.getNumero()==numero)
				return vuelo;
		}
		return null;
	}
	/**
	 * 
	 */
	public void mustraVuelos() {
		System.out.println(listaVuelo.toString());
	}
 
}
