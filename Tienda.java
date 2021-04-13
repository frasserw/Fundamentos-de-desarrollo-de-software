package tienda;

import java.util.ArrayList;
import utilidades.LeerDato;
/**
 * 
 */
public class Tienda {
    private ArrayList<Producto> catalogoProducto;
    private ArrayList<Cliente> listaCliente;
    private String nombreTienda;
         
    /**
     *Constructor  
     */
    public Tienda(String nombreTienda){
        catalogoProducto =new ArrayList<Producto>();
        listaCliente =new ArrayList<Cliente>();
        this.nombreTienda = nombreTienda;

    }
    /**
     * 
     * @return el nombre de la tienda
     */
    public String getNombreTienda() {
        return nombreTienda;
    }

    /**
     * Función o método para resgistra los clientes en la lista de clientes 
     * 
     */
    public void resgistraCliente(){
        System.out.println("REGISTRO DE CLIENTES");
        System.out.println("DATOS DEL CLIENTE");
        System.out.println("Identificacion ");
        int id = LeerDato.datoInt();
        System.out.print("Nombre y Apellido ");
        String nombre = LeerDato.dato();
        System.out.print("Telefono ");
        String telefono = LeerDato.dato();
        System.out.print("Correo electrónico ");
        String correo = LeerDato.dato();
        System.out.println("Fecha de Nacimiento ");
        System.out.print("Año ");
        int anio = LeerDato.datoInt();
        System.out.print("Mes ");
        int mes = LeerDato.datoInt();
        System.out.println();
        int dia = LeerDato.datoInt();

        //Se crea una instancia (Objeto de la clase Cliente)
        Cliente cliente = new Cliente(id,nombre,telefono,correo);
       
        // Se instancia la función o método fecha de la clase Cliente para crear por composición un instancia de la clase fecha
        cliente.fecha(anio, mes, dia);
       
        //Se adiciona una instancia (objeto) de la clase cliente a la lista de cleintes 
        listaCliente.add(cliente);

    }
    /**
     * Función o método para registrar o adicionar instancias de la claee producto al catalogo de productos.
     */
    public void registraProducto(){
        System.out.println("REGISTRO DE PRODUCTOS");
        System.out.println("DATOS DEL PRODUCTO");
        System.out.print("Codigo ");
        int codigo = LeerDato.datoInt();
        System.out.print("Descripción ");
        String descripcion = LeerDato.dato();
        System.out.println("Precio ");
        long precio = LeerDato.datoLong();
        System.out.println("FECHA DE VENCIMIENTO");
        System.out.print("Año ");
        int anio = LeerDato.datoInt();
        System.out.println("Mes ");
        int mes = LeerDato.datoInt();
        System.out.println("Día ");
        int dia = LeerDato.datoInt();
        //Se crea una instancia (objeto)  de la clase producto y se pasan los parametros al cosntructor
        Producto producto =new Producto(codigo, descripcion, precio);
        //Se instancia el metodo fechaVento de la clase producto para crear por composición una instancia de la clase Fecha
        producto.fechaVento(anio, mes, dia);

        catalogoProducto.add(producto);
    }
    /**
     * Función ue muestra la lista de clientes por consola
     */
    public void listaCliente(){
        for (Cliente cliente : listaCliente) {
            System.out.println(cliente);
        }
    }
    /**
     * Función que muestra el catalogo de productos por consola
     */
    public void catalogoProducto(){
        for (Producto producto : catalogoProducto) {
            System.out.println(producto);
        }

    }
    
}
