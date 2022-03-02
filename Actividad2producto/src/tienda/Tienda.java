package tienda;
/**
 * Programa Tienda, implementada el catalogo de productos de la tienda
 * Implementa las fucnionalidades para asignar un producto al catalogo, buscar producto
 * modificar un producto y mostrar el catalogo de productos. 
 * @author william.fraccer
 *
 */
public class Tienda {
	private int nit;
	private String nombre;
	private Producto[] catalogoProducto;
	/**
	 * @param nit
	 * @param nombre
	 * @param catalogoProducto
	 */
	public Tienda(int nit, String nombre, int numeroProducto) {
		super();
		this.nit = nit;
		this.nombre = nombre;
		this.catalogoProducto =new Producto[numeroProducto];
	}
	/**
	 * @return the nit
	 */
	public int getNit() {
		return nit;
	}
	/**
	 * @param nit the nit to set
	 */
	public void setNit(int nit) {
		this.nit = nit;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Funci�n para agregar productos a la lista de productos arreglo estatico 
	 * @param producto instancia objeto de la clase Producto
	 * @return
	 */
	public boolean agregarProducto(Producto producto) {
		boolean estado=false;
		for (int i = 0; i < catalogoProducto.length; i++) {
			if(catalogoProducto[i]==null) {
				catalogoProducto[i]=producto;
				estado=true;
				break;
			}
		}
		return estado;
	}
	/**
	 * Funci�n para buscar un producto especifico en el catalogo de productos
	 * @param codigo
	 * @return
	 */
	public Producto buscar(int codigo) {
		Producto p=null;
		for (Producto producto : catalogoProducto) {
			if(producto.getCodigo() == codigo) {
				p = producto;
				break;
			}
		}
		return p;
	}
	/**
	 * Funci�n para mostrar el catalogo de producto segun el tipo de producto
	 * @param tipo entreo identifica el tipo de prducto 1 perecedero 2 no perecedero
	 */
	public void mostrarCatalogo(int tipo) {
		for (Producto producto : catalogoProducto) {
			if(producto != null) {
			  if(producto.getTipo().getId() == tipo) {
				System.out.println(producto);
			  }
			}
		}
	}
	/**
	 * Funci�n para mostrra el catalfo de productos teniendo encuenta el rango de precio
	 * @param rangoI rango inicial de precio
	 * @param rangoF rango final de precio 
	 */
	public void mostrarCatalogoR(int rangoI, int rangoF) {
		for (Producto producto : catalogoProducto) {
			if(producto != null) {
			  if(producto.getPrecioVenta() >= rangoI && producto.getPrecioVenta() <= rangoF) {
				System.out.println(producto);
			  }
			}
		}
	}
}
