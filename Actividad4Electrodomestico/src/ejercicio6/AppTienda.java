package ejercicio6;

import java.io.BufferedReader;
import java.util.Scanner;

public class AppTienda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner leer =new Scanner(System.in);
		TiendaElectrodomesticos tienda = new TiendaElectrodomesticos();
		System.out.println("TIENDA TODO MUY BARATO .COM");
		
		Electrodomestico e;
		System.out.println("Nueva Lavadora");
		e =new Lavadora(1000,"SAMSUMG","2020",2500000,"NEGRO",40);
		tienda.adicionarElectrodomestico(e);
		e =new Lavadora(1001,"WHIRLPOOL","2010",3500000,"BLANCO",30);
		tienda.adicionarElectrodomestico(e);
		e =new Lavadora(1002,"LG","2021",1800000,"ROJA",20);
		tienda.adicionarElectrodomestico(e);
		System.out.println("Nuevo Televisor");
		e =new Televisor(2000,"LG","2020",1800000,10);
		tienda.adicionarElectrodomestico(e);
		e =new Televisor(2010,"PHILIPS","2021",850000,10);
		tienda.adicionarElectrodomestico(e);
		e =new Televisor(2020,"SAMSUNG","2019",950000,20);
		tienda.adicionarElectrodomestico(e);
		System.out.println("Nueva Freidora de Aire");
		e =new FreidoraAire(3000,"OSTER","2021",180000,25);
		tienda.adicionarElectrodomestico(e);
		e =new FreidoraAire(3010,"IMUSA","2020",150000,25);
		tienda.adicionarElectrodomestico(e);
		
		System.out.println("Venta de Electrodomesticos");
		tienda.catalogoElectrodomesticos();
		
		System.out.println("Codigo del producto a Comprar");
		int codigo = LeerDato.datoInt();
		e = tienda.buscarElectro(codigo);
		System.out.println(e);
		System.out.println("Cantidad a comprar");
		int cantidad = LeerDato.datoInt();
		System.out.println("Valor a pagar "+e.calcularPago(cantidad));
		tienda.borrar(e);
		
		System.out.println("Catalogo de Electrodomesticos");
		tienda.catalogoElectrodomesticos();
			




	}
}
