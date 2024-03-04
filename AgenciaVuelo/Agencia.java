package Relaciones.src.ejercicio1;

public class Agencia {
    private static Vuelo listaVuelo[];
    private static Ciudad ciudad1;
    private static Ciudad ciudad2;
    private static Piloto piloto;

    public static void main(String[] args) {
    
    //Declara un arreglos estatico con cuatro referencias de la clase Vuelo
       listaVuelo =new Vuelo[4];
    //CRear dos insttancias de la clase Ciudad
       ciudad1 =new Ciudad(100,"Bogota");
       ciudad2 =new Ciudad(200,"Cali");
    //Crea una instancia de la clase Piloto
       piloto =new Piloto("Juanita",600);
    //Asigna dos instancia de la clase Vueloa a los elementos con indice 0 y 1
    //del arreglos estatico de la clase Vuelo 
       listaVuelo[0] =new Vuelo(1000,ciudad1,ciudad2,30,10,piloto);
       listaVuelo[1] =new Vuelo(2000,ciudad2,ciudad1,40,10,piloto);
    //Crea dos instancia de la clase Pasajero
       Pasajero pasajero1 =new Pasajero(1000,"Pachita",30,"Mujer");
       Pasajero pasajero2 =new Pasajero(5000,"Francisco",50,"Hombre");
       Pasajero pasajero3 =new Pasajero(8000,"Albita",45,"Mujer");
    
       //Crear dos instancias de la clase Silla
       Silla silla1 =new Silla('A',100,pasajero1);
       Silla silla2 =new Silla('A',101,pasajero2);
       Silla silla3 =new Silla('A',102,pasajero3);
    //Asigana instancia silla al ellemnto 1 indice cero del arareglo estatico 
    //listVuelo
       listaVuelo[0].asignarSilla(silla1);
       listaVuelo[0].asignarSilla(silla2);
       listaVuelo[0].asignarSilla(silla3);
    //Muestra la lista de pasajero en Vuelo espesifico
       System.out.println("LISTA DE PASAJEROS DE UN VUELO");
       for (Vuelo vuelo : listaVuelo) {
        if(vuelo == null)
            break;
        else if (vuelo.getNumero() == 1000) {
                System.out.println(vuelo);
                for (Silla silla : vuelo.getListaSilla()) {
                    if (silla != null) {
                         System.out.println(silla);
                    }
                }
                break;
        }else{
            System.out.println("Numero de Vuelo no Existe");
        }
       }

       //Buscar un pasajero en un Vuelo
       //S e requiere el numero del vuelo y la identificación del pasajero
       System.out.println("MUESTRA LOS DATOS DE UN PASAJEROS EN UN VUELO");
       for (Vuelo vuelo : listaVuelo) {
            if(vuelo==null)
                break;
            else if (vuelo.getNumero() == 1000) {
                System.out.println(vuelo);
                for (Silla silla : vuelo.getListaSilla()) {
                    if (silla != null) {
                        if(silla.getPasajero().getId()==5000){
                            System.out.println(silla.getPasajero());            
                            break;
                        }        
                    }
                }
            }   
        }
    }
}