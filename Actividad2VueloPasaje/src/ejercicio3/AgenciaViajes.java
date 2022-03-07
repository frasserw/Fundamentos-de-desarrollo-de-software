package ejercicio3;

import java.util.Scanner;

public class AgenciaViajes {
	private Vuelo vuelo;
	private Pasajero pasajero;
	private Scanner teclado =new Scanner(System.in);
	
	/**
	 * Método para craer un objeto instancia de la clase vuelo
	 */
	
	public void crearVuelo() {
		System.out.println("AGENCIA DE VIAJES TIQUETES MUY BARATOS.COM");
		System.out.println("CREAR UN VUELO");
		System.out.print("Numero del Vuelo ");
		int numero = teclado.nextInt();
		System.out.print("Ciudad de Salida ");
		String salida = teclado.next();
		System.out.print("Ciudad de Llegada ");
		String llegada = teclado.next();
		System.out.println("DATOS DEL PILOTO");
		System.out.print("Id ");
		int id = teclado.nextInt();
		System.out.println("Nombre ");
		String nombre = teclado.next();
		System.out.println("Horas de vuelo ");
		int horasV = teclado.nextInt();
		System.out.println("Numero de puestos en el vuelo ");
		int puestos = teclado.nextInt();
		//Se crea una instancia d ela clase Vuelo
		vuelo =new Vuelo(numero,salida,llegada,puestos);
		//Se asigna por agregación un objeto (instancia) de la clase Piloto a un objeto de la clase Vuelo
		vuelo.agregarPiloto(new Piloto(id,nombre,horasV));
				
	}	
	/**
	 * Método asigna un objketo (instancia) de la clase Pasajero a un elemento de array de Pasajeros
	 *
	 */
	public void comprarTiquete() {
		System.out.println("AGENCIA DE VIAJES TIQUETES MUY BARATOS.COM");
		System.out.println("COMPRA DE TIQUETE");
		System.out.println("DATOS DE PASAJERO");
		System.out.print("Id");
		int id = teclado.nextInt();
		System.out.print("Nombre ");
		String nombre = teclado.next();
		System.out.print("Genero ");
		String genero = teclado.next();
		System.out.print("Edad ");
		int edad = teclado.nextInt();
		
		for (int i = 0; i < vuelo.getPuestos().length; i++) {
			if(vuelo.getPuestos()[i]==null) {
				pasajero =new Pasajero(id,nombre,genero,edad);
				vuelo.getPuestos()[i] = pasajero;
				break;
			}
		}
		
	}
	/**
	 * 
	 */
	public void consultarPasajero() {
		System.out.println("AGENCIA DE VIAJES TIQUETES MUY BARATOS.COM");
		System.out.println("CONSULTAR UN PASAJERO");
		System.out.println("identificación");
		int id =teclado.nextInt();
		for (int i=0; i < vuelo.getPuestos().length; i++) {
			if(vuelo.getPuestos()[i].getId() == id) {
				System.out.println("El pasajero se encuentra en el vuelo numero " + vuelo.getNumero());
				System.out.println("DATOS DEL PASAJERO");
				System.out.println(vuelo.getPuestos()[i]);
				break;
			}
			}
	}
	/**
	 * 
	 */
	public void MostrarVuelo() {
		System.out.println("AGENCIA DE VIAJES TIQUETES MUY BARATOS.COM");
		System.out.println("DATOS DEL VUELO " + vuelo.getNumero());
		System.out.print("Ciudad de salida " +vuelo.getCiudadSalida());
		System.out.print("Ciudad de salida " +vuelo.getCiudadLlegada());
		System.out.println("Datos del Piloto " + vuelo.getPiloto());
		System.out.println("Lista de Pasajero ");
		//Muestra la lista de pasajeros
		for (int i=0; i < vuelo.getPuestos().length; i++) {
			System.out.println(vuelo.getPuestos()[i]);
		}
	}
	
	/**
	 * 
	 */
	public void run() {
		int opc;
		boolean salir=true;
		while(salir) {
			System.out.println("AGENCIA DE VIAJES TIQUETES MUY BARATOS.COM");
			System.out.println("MENU DE OPCIONES");
			System.out.println("1. Crear Vuelo");
			System.out.println("2. Compra Tiquete");
			System.out.println("3. Consultar Pasajero");
			System.out.println("4. Mostrar Vuelos");
			System.out.println("5. Salir");
			System.out.println("Entrar un numero enter 1 y 5");
			opc = teclado.nextInt();
			switch (opc) {
			case 1:
				crearVuelo(); 
				break;
			case 2:
				comprarTiquete();
				break;
			case 3:
				consultarPasajero();
				break;
			case 4:
				MostrarVuelo();
				break;
			case 5:
				salir=false;
				break;
			default:
				System.out.println("Entre una numero entre 1 y 5");
				break;
			}
		}while(salir);
	}
}
