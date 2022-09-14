package banco;

import java.util.ArrayList;

/**
 * Aplicaci�n banco donde se realizan todas las operaciones bancarias
 * Se implementa una estructuras dianamica para asignara instancias de la clase cuenta 
 * cuentas de ahorro o cuentas corrientes.
 * @author william FRASSER ACEVEDO
 *
 */
public class AppBanco2 {
	//Declarar un array dinamico de la clase Cuenta
	private ArrayList<Cuenta> listaCuenta;
	
	private int numeroCuenta = 100;
	private final int SOBREGIRO = 1000000;
	private String tipoCuenta = "12";
	private Cuenta cuenta;
	
		
	
	/**
	 *Constructor 
	 */
	public AppBanco2() {
		// TODO Auto-generated constructor stub
		listaCuenta =new ArrayList<Cuenta>();
		
	
	}
	/**
	 * Funci�n para agrgar cuentas de ahorro o corriente a la lista
	 */
	public void agregarCuenta() {
		System.out.println("CREAR CUENTA AHORRO");
		System.out.println("# Cuenta " + numeroCuenta);
		System.out.println("DATOS DEL TITULAR");
		System.out.print("Identificaci�n ");
		int id = LeerDato.datoInt();
		System.out.print("Nombre ");
		String nombre = LeerDato.dato();
		boolean salir = false;
		do {
			System.out.println("Tipo de Cuenta 1. Ahorro 2. Corriente");
			String tipo = LeerDato.dato();
			if(tipoCuenta.contains(tipo)){
				if(tipo.equals("1"))
					//Polimorfismo
					cuenta =new Ahorro(numeroCuenta,new Persona(id,nombre));
				else
					cuenta =new Corriente(numeroCuenta,new Persona(id,nombre),SOBREGIRO);
			    
				salir=true;
			}else {
			    	System.out.println("Entre 1. Ahorro 2. Corriente");
		    	  }
		
		}while(!salir);
		listaCuenta.add(cuenta);
		numeroCuenta += 1;
	}
	/**
	 * Funci�n para realizar operaciones de deposito en una cuenta de ahorro o una cuenta corriente
	 */
	public void deposito() {
		System.out.println("DESPOSITO");
		System.out.println("# Cuenta");
		int numero = LeerDato.datoInt();
		boolean estado=false;
		for (Cuenta cuenta : listaCuenta) {
			
			if (numero == cuenta.getNumeroCuenta()) {
				System.out.println("Titular " + cuenta.getTitular());
				System.out.println("VALOR A DEPOSITAR ");
				int valor = LeerDato.datoInt();
				cuenta.deposito(valor);
				estado=true;
				break;
			 } 
		}
		if(!estado) {
			System.out.println("N�mero de cuenta no existe");
		}
		
		
	}
	/**
	 * Funci�n para realizar operaciones de retiro en una cuenta de ahorro o una cuenta corriente
	 */
	public void retiro() {
		System.out.println("RETIRO");
		System.out.println("# Cuenta");
		int numero = LeerDato.datoInt();
		
		for(int i = 0; i < listaCuenta.size(); i++) {
			
			if(numero == listaCuenta.get(i).getNumeroCuenta()) {
				System.out.println("Titular " + cuenta.getTitular());
				System.out.println("VALOR A RETIRAR ");
				int valor = LeerDato.datoInt();
				cuenta.retiro(valor);
				break;
			}
		}
		
		
		for (Cuenta cuenta : listaCuenta) {
			if (numero == cuenta.getNumeroCuenta()) {
				System.out.println("Titular " + cuenta.getTitular());
				System.out.println("VALOR A RETIRAR ");
				int valor = LeerDato.datoInt();
				cuenta.retiro(valor);
				break;
			 } 
		}
	}
	/**
	 *Funcion para mostatr la lista cuentas 
	 */
	public void muestraCuentas() {
		//programaci�n funcional 
		System.out.println("LISTA DE CUENTAS DE AHORRO");
		listaCuenta.forEach((n)->System.out.print(n+" "));
		
		for (Cuenta cuenta : listaCuenta) {
			System.out.println(cuenta);
		}
		
	}
	/**
	 * Intetfaz de usuario 
	 */
	public void run() {
		boolean salir=true;
		int opc;
		while(salir) {
			opc=0;
			System.out.println("\n");
			System.out.println("** BANCO MUCHA PLATA **");
			System.out.println("** MENU DE OPCIONES **");
			System.out.println("1. Crea Cuenta");
			System.out.println("2. Desposito");
			System.out.println("3. Retiro");
			System.out.println("4. Informe");
			System.out.println("5. Salir");
			System.out.println("Su Opci�n ");
			System.out.println("\n");
			opc = LeerDato.datoInt();
			switch (opc) {
			case 1:agregarCuenta();
				break;
			case 2:deposito();
				break;
			case 3:retiro();
				break;
			case 4:muestraCuentas();
				break;
			case 5:salir=false;
				break;
			default:System.out.println("Error Solo valores entre 1 y 5");
				break;
				
			}
			
		}
	}
	
}
