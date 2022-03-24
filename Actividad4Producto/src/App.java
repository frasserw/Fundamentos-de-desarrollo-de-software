

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tienda miTienda =new Tienda();
		
		Producto p;
		
		p =new Perecedero(2030,"Mango",2000,30,1);
		miTienda.adiconarProducto(p);
		p =new Perecedero(2040,"Piña",10000,20,2);
		miTienda.adiconarProducto(p);
		p =new NoPerecedero(2060,"Aceite",12000,10,10);
		miTienda.adiconarProducto(p);
		p =new NoPerecedero(2133,"Atún",12000,10,20);
		miTienda.adiconarProducto(p);
		System.out.println("Catalogo de Productos Perecederos");
		miTienda.catalogoProducto("Perecedero");
		
		System.out.println("Venta de Productos");
		miTienda.catalogoProducto(null);
		
		System.out.println("Codigo del producto a Comprar");
		int codigo = LeerDato.datoInt();
		p = miTienda.buscarProducto(codigo);
		System.out.println(p);
		System.out.println("Cantidad a comprar");
		int cantidad = LeerDato.datoInt();
		int valor=0;
		int valorPagar=0;
		if(p instanceof Perecedero) { 
			valor = p.calcular(cantidad);
		    valorPagar = ((Perecedero) p).precioFinal(valor);
		}else 
			valor = p.calcular(cantidad);
		System.out.println("Valor a Pagar " +valorPagar);
		

	}

}
