package tienda.logica;

import java.util.Scanner;

import tienda.data.Fecha;
import tienda.data.Producto;
import tienda.data.Tipo;

public class Tienda {
	private Producto[] listaProducto;
	private Scanner leer =new Scanner(System.in);
	private Tipo perecedero;
	private Tipo noPerecedero;
	/**
	 * 
	 */
	public Tienda(int producto) {
		listaProducto =new Producto[producto];
		perecedero =new Tipo("Perecedro",19);		
		noPerecedero =new Tipo("No Perecedro",15);
	}
	/**
	 * 
	 */
	public void crearProducto() {
		System.out.println("DATOS DEL PRODUCTO");
		System.out.print("Codigo ");
		int codigo = leer.nextInt();
		System.out.print("Nombre ");
		String nombre = leer.next();
		System.out.println("1 perecedro 2 no perecedro");
		int tipo = leer.nextInt();
		System.out.println("FECHA DE VENCIMIENTO");
		System.out.print("Anio ");
		int anio = leer.nextInt();
		System.out.print("Mes ");
		int mes = leer.nextInt();
		System.out.println("Dia ");
		int dia = leer.nextInt();
		System.out.print("Precio ");
		long precio = leer.nextLong();
		System.out.print("Cantidad ");
		int cantidad = leer.nextInt();
		Fecha fecha =new Fecha(anio,mes,dia);
		
		
		Tipo t = (tipo == 1?perecedero:noPerecedero);
		
		Producto miProducto =new Producto(codigo,nombre,t,fecha,precio,cantidad);
		
		for (int i=0; i < listaProducto.length;i++) {
			if(listaProducto[i] == null) {
				listaProducto[i] = miProducto;
				return;
			}
		}
	}
	/**
	 * 
	 */
	public void buscar() {
		System.out.println("BUSCAR UN PRODUCTO");
		System.out.println("Codigo del producto");
		int codigo = leer.nextInt();
		
		for (Producto producto : listaProducto) {
			if(producto.getCodigo()==codigo)
				System.out.println(producto);
			   return ;
		}
	}
	/**
	 * 
	 */
	public void mostrarCatalogo() {
		System.out.println("CATALOGO DE PRODUCTOS");
		System.out.println("Tipo Producto  Codigo Descripción    Precio  Cantidda  Fecha Vencimiento");
		for (Producto producto : listaProducto) {
			if(producto != null)
				System.out.println(producto);
			else
				return;
		}
	}
	
	public void run() {
		boolean salir=true;
		int opc;
		while(salir) {
			System.out.println("TIENDA DE PRODUCTOS");
			System.out.println("1. Crear producto");
			System.out.println("2. Mostrar catalogo");
			System.out.println("3. Buscar Producto");
			System.out.println("4. Salir");
			System.out.println("Su opcion 1 - 4");
			opc = leer.nextInt();
			switch (opc) {
				case 1:crearProducto();
					break;
				case 2:mostrarCatalogo();
					break;
				case 3:buscar();
					break;
				case 4:salir=false;
					break;
				default:System.out.println("Error opción no implementada ");
					break;  	
			    	
			}
		}
	}
	
	
	

}
