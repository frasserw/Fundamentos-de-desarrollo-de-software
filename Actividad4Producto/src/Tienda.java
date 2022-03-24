import java.util.ArrayList;
import java.util.List;

public class Tienda {
	private List<Producto> catalogoProducto;
	/**
	 * 
	 */
	public Tienda() {
		catalogoProducto =new ArrayList<>();
	}
	/**
	 * Funcion para adicionar un producto al catalogo
	 * @param p
	 */
	public void adiconarProducto(Producto p) {
		catalogoProducto.add(p);
	}
	/**
	 * 
	 * @param clase
	 */
	public void catalogoProducto(String algo) {
		if(algo == "Perecedero")
			for (Producto p : catalogoProducto) {
			 if(p instanceof Perecedero)
				System.out.println(p);
			} 
		else	
			System.out.println(catalogoProducto.toString());	
	}
	
	
	
	/**
	 * 
	 * @param codigo
	 * @return una instancia de la clase producto
	 */
	public Producto buscarProducto(int codigo) {
		for (Producto p : catalogoProducto) {
			if(p.codigo==codigo)
				return p;
		}
		return null;
	}
	
	
	
}
