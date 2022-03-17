package Vuelo;

import java.time.LocalDateTime;
import java.util.Scanner;

public class AppAgencia {
	private static LocalDateTime fecha = LocalDateTime.now();
	private static Agencia miAgencia =new Agencia();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		miAgencia.adicionarVuelo(new Vuelo(100,"Bogota",fecha,"Cali",fecha,new Piloto(10230,"Juanita",300),300));
		miAgencia.adicionarVuelo(new Vuelo(101,"Cali",fecha,"Bogota",fecha,new Piloto(23030,"Pachito",200),25));
		miAgencia.adicionarVuelo(new Vuelo(102,"Bogota",fecha,"Pasto",fecha,new Piloto(11253,"Albita",500),20));
		miAgencia.adicionarVuelo(new Vuelo(103,"Pasto",fecha,"Popayan",fecha,new Piloto(10230,"Pedrito",100),200));
		
		System.out.println(miAgencia.buscarVuelo(102));
		
	}
	
	
}
