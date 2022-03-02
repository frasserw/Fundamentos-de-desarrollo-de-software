package tienda;

import java.util.Scanner;

public class AppTienda {
	private static Scanner leerDato =new Scanner(System.in);
	private static Tienda miTienda;
	private static Producto miProducto;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Crear la tienda");
		System.out.println("Nit ");
		int nit = leerDato.nextInt();
		System.out.println("Nombre ");
		String nombre = leerDato.next();
		System.out.println("Cuantos Productos en la Tienda");
		int nProducto = leerDato.nextInt();
		//Se crea una instancia de la clase Tienda
		miTienda =new Tienda(nit,nombre,nProducto);
		int key;
		boolean salir=true;
		while(salir) {
			key=0;
			System.out.println(miTienda.getNombre());
			System.out.println("1. Nuevo producto");
			System.out.println("2. Buscar producto");
			System.out.println("3. Modificar producto");
			System.out.println("4. Catalogo de productos");
			System.out.println("5. Catalogo de productos por rango");
			System.out.println("6. Salir");
			System.out.print("Entre un numero de 1 a 6 ");
			key = leerDato.nextInt();
			switch (key) {
			case 1:nuevoProducto();
				break;
			case 2:buscarProducto();
				break;
			case 3:modificarProducto();
				break;
			case 4:catalogoProdcuto();
				break;
			case 5:catalogoProdcutoR();
			case 6:salir=false;
				break;
			default:System.out.println("Entre un numero de 1 a 6");
				break;
			}
		}
	}
	
	
	public static void nuevoProducto() {
		System.out.println("Nuevo Producto");
		System.out.print("Tipo 1 perecedero 2 no perecedero ");
		int tipo = leerDato.nextInt();
		System.out.print("Codigo ");
		int codigo = leerDato.nextInt();
		System.out.print("Descripción ");
		String descrip = leerDato.next();
		System.out.print("Precio venta ");
		int precio = leerDato.nextInt();
		System.out.print("Cantidad ");
		int cantidad = leerDato.nextInt();
		System.out.println("FECHA DE VENCIMENTO");
		System.out.print("Año ");
		int anio = leerDato.nextInt();
		System.out.print("Mes ");
		int mes = leerDato.nextInt();
		System.out.print("Dia ");
		int dia =leerDato.nextInt();
		//Se crea un objeto de la clase Producto
		
		Producto miProducto =new Producto(new Tipo(tipo,19),codigo,descrip,precio,cantidad,new Fecha(anio,mes,dia));
		//Se instancia un objeto de la clase Tienda y le llama a la función agregar producto 
		if(miTienda.agregarProducto(miProducto))
			System.out.println("Un nuevo producto fue creado");
		else	
			System.out.println("No se puede crear el producto");
	}

	public static void buscarProducto() {
		System.out.println("BUSCAR UN PRODUCTO");
		System.out.print("Entre el codigo de producto ");
		int codigo = leerDato.nextInt();
		miProducto = miTienda.buscar(codigo);
		if(miProducto != null) 
			System.out.println(miProducto);
		else
			System.out.println("Producto no existe");
	}
	
	public static void modificarProducto() {
		buscarProducto();
		if(miProducto !=null) {
			System.out.println("DATOS A MODIFICAR");
			System.out.println("Descripción ");
			String descrip =leerDato.next();
			miProducto.setDescripcion(descrip);
		}
	}
	/**
	 * Funcón para entrar el dato de tipo de producto
	 * 
	 **/
	public static void catalogoProdcuto() {
		System.out.println("Catalogo de productos por tipo");
		System.out.println("Entre el tipo de producto 1 perecedero 2 no perecedero");
		miTienda.mostrarCatalogo(leerDato.nextInt());
	}
	/**
	 * Función para entrar los datos de los rangos de precio para mostrar el catologo
	 */
	public static void catalogoProdcutoR() {
		System.out.println("Catalogo de productos por rango de precio");
		System.out.println("Entre el precio inicial");
		int precioI = leerDato.nextInt();
		System.out.println("Entre el precio final");
		int precioF = leerDato.nextInt();
		miTienda.mostrarCatalogoR(precioI, precioF);
		
	}
	
	

}
