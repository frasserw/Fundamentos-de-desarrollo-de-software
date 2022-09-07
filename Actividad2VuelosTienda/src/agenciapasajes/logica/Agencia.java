package agenciapasajes.logica;

import java.util.Scanner;

import agenciapasajes.data.Pasajero;
import agenciapasajes.data.Piloto;
import agenciapasajes.data.Vuelo;

public class Agencia {
	Scanner leer =new Scanner(System.in);
	private Scanner leerDato =new Scanner(System.in);
	private Vuelo[] listaVuelo;
	private Piloto piloto;
	
	/**
	 * 
	 */
	public Agencia(int nVuelos) {
		this.listaVuelo =new Vuelo[nVuelos];
		this.piloto =new Piloto(1200,"Juanita",1000);
		
	}
	/**
	 * 
	 */
	
	public void crearVuelo() {
		System.out.println("DATOS DEL NUEVO VUELO");
		System.out.print("Numero Vuelo");
		int numero = leer.nextInt();
		System.out.print("Cidad de Salida ");
		String salida = leer.next();
		System.out.print("Ciudad Llegada ");
		String llegada = leer.next();
		System.out.print("Numero de Sillas ");
		int nSillas = leer.nextInt();
		
		for (int i=0; i < listaVuelo.length;i++) {
			if(listaVuelo[i] == null) {
				listaVuelo[i] =new Vuelo(numero,salida,llegada,piloto,nSillas);
				System.out.println("Vuelo Creado");
				return;
			}
		}
		
	}
	/**
	 * 
	 */
	public void reserva() {
		System.out.println("RESERVA SILLA EN UN VUELO");
		System.out.print("Numero de Vuelo");
		int numeroVuelo = leer.nextInt();
		
		for (Vuelo vuelo : listaVuelo) {
			if(vuelo.getNumero() == numeroVuelo) {
				System.out.println("DATOS DEL PASAJERO");
				System.out.print("Identificacion ");
				int id = leer.nextInt();
				System.out.print("Nombre ");
				String nombre = leer.next();
				System.out.print("Edad ");
				int edad = leer.nextInt();
				System.out.println("Genero ");
				char genero = leer.next().charAt(0);
				Pasajero pasajero =new Pasajero(id,nombre,edad,genero);
				vuelo.adicionarPasajero(pasajero);
				return ;
				
			}
		}
		
	}
	/**
	 * 
	 */
	public void mostrarVuelo() {
		System.out.println("DATOS DE UN VUELO");
		System.out.print("Numero del Vuelo ");
		int numeroVuelo = leer.nextInt();
		for (Vuelo vuelo : listaVuelo) {
			if(vuelo != null)
				if(vuelo.getNumero()==numeroVuelo) {
					System.out.println(vuelo);
					vuelo.mostrarLista();
			}else {
				return;
			}
		}
		
	}
	/**
	 * 
	 */
	public void consultarPasajero() {
		System.out.println("DATOS DEL PASAJERO");
		System.out.print("Identificacion ");
		int id = leer.nextInt();
		for (Vuelo vuelo : listaVuelo) {
			Pasajero pasajero = vuelo.buscarPasajero(id);
			if(pasajero != null) {
				System.out.println(vuelo);
				System.out.println(pasajero);
			}
		}
		
	}
	
	public void run() {
		boolean salir=true;
		int opc;
		while(salir) {
			System.out.println("TIQUETES MUY BARATOS PUNTO CON");
			System.out.println("1. Crea Vuelo");
			System.out.println("2. Reserva silla en un Vuelo");
			System.out.println("3. Consultar un Vuelo");
			System.out.println("4. Buscar un Pasajero");
			System.out.println("5. Salir");
			System.out.println("Su Opción 1 a 5");
			opc = leer.nextInt();
			switch (opc) {
				case 1: crearVuelo();
					break;
				case 2: reserva();
					break;	
				case 3: mostrarVuelo();
					break;	
				case 4: consultarPasajero();
					break;	
				case 5: salir=false;
					break;
				default:System.out.println("Error opcion no implementada");
				break;
			}
			
		}
	}
	
	
}
