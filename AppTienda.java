package tienda;

import utilidades.LeerDato;

public class AppTienda {
    public static void main(String[] args) {
        Tienda miTienda =new Tienda("Todo Muy Barato .com");
        int opc;
        boolean salir=true;
        while(salir){
            opc=0;
            System.out.println("TIENDA " + miTienda.getNombreTienda());
            System.out.println("1. Registro de Clientes");
            System.out.println("2. Registro de Productos");
            System.out.println("3. Catalogo de Productos");
            System.out.println("4. Lista de Clientes");
            System.out.println("5. Salir ");
            System.out.print("Entrar un Número de 1 a 5 -> ");
            opc = LeerDato.datoInt();

            switch(opc){
                case 1:miTienda.resgistraCliente();
                    break;
                case 2:miTienda.registraProducto();
                    break;
                case 3:miTienda.catalogoProducto();
                    break;
                case 4:miTienda.listaCliente();
                    break;
                case 5:salir=false;
                    break;
                default: System.out.println("Error opción no implementada");
                    break;

            }

        }    
    }

    

}
