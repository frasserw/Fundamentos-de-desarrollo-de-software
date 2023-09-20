package tienda;

import java.util.ArrayList;
import java.util.Scanner;

import grupoAsignaturaNota.Persona;

public class Tienda {
	private ArrayList<Producto> listaProductos;
	private ArrayList<Venta> listaVentas;
	private Scanner leer =new Scanner(System.in);
	/**
	 * 
	 */
	public Tienda() {
		super();
		listaProductos =new ArrayList<>();
		listaVentas =new ArrayList<>();
	}
	/**
	 * 
	 */
	public void crearProducto() {
		Tipo tProducto1 =new Tipo(1,"Alta Calidad",19);
		Tipo tProducto2 =new Tipo(2,"Media Calidad",17);
		Tipo tProducto3 =new Tipo(3,"Nacional",20);
		
		Persona proveedor =new Persona(1415,"Pachita");
		
		Producto p1 =new Producto(1020,"Camiseta",1020,20,tProducto1,proveedor);
		Producto p2 =new Producto(1030,"Tenis",   1040,30,tProducto2,proveedor);
		Producto p3 =new Producto(1040,"Sudadera",2000,20,tProducto3,proveedor);
		Producto p4 =new Producto(1050,"Ruana",   5000,20,tProducto3,proveedor);
		Producto p5 =new Producto(1060,"Medias",  3000,20,tProducto2,proveedor);
		
		listaProductos.add(p1);
		listaProductos.add(p2);
		listaProductos.add(p3);
		listaProductos.add(p4);
		listaProductos.add(p5);
			
	}
	/**
	 * 
	 */
	public void venta() {
		Venta venta1 =new Venta(300,new Persona(5260,"Albita"));
		boolean salir=true;
		while(salir) {
			System.out.print("Entre codigo del producto");
			int codigo = leer.nextInt();
			
			for (Producto producto : listaProductos) {
				if(producto.getCodigo() == codigo) {
					System.out.println(producto);
					System.out.print("Cantidad acomprar");
					int cantidad = leer.nextInt();
					Detalle detalle =new Detalle(cantidad,producto);
					
					venta1.agregarDetalle(detalle);
					break;
				}
			}
			venta1.mostrar();
			salir=false;
		}
		
		listaVentas.add(venta1);
	}
	
	
	
	
	
	

}
