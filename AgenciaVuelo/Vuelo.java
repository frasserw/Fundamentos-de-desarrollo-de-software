package Relaciones.src.ejercicio1;

import java.util.Arrays;

public class Vuelo {
    private int numero;
    private Ciudad ciudadSalida;
    private Ciudad ciudadLlegada;
    private int duracion;
    private int numeroSilla;
    private Silla listaSilla[];
    private Piloto piloto;

    public Vuelo(int numero, Ciudad ciudadSalida, Ciudad ciudadLlegada, int duracion, int numeroSilla, Piloto piloto) {
        this.numero = numero;
        //Relación de agregación, un objeto CiudadSalida y CiudadLlegada se declaran
        //en la clase Agencia y se pasa como parámetro 
        this.ciudadSalida = ciudadSalida;
        this.ciudadLlegada = ciudadLlegada;
        this.duracion = duracion;
        this.numeroSilla = numeroSilla;
        //Relación de Composición una arreglos de objetos de la clase Silla
        this.listaSilla =new Silla[numeroSilla];
        //RElación de agregación,un objeto de la clase Piloto se crea en la clase
        //Agencia y se pasa como parámetro  
        this.piloto = piloto;
    }
    /**
     * Método para asignar una referencia de un objeto silla que tiene una relación
     * de asociación con un objetos de la clase Pasajero, a un elemento de el arreglo
     * estatico de la clase Silla. El objeto silla se crea en la clase Agencia
     * @param silla
     */
    public void asignarSilla(Silla silla){
        for (int i = 0; i < listaSilla.length; i++) {
            if(listaSilla[i] == null){
                listaSilla[i] = silla;
                break;
            }
        }

    }
/**
 * Método para buscar un pasajero asociado a una silla en un vuelo.
 * El parametro id es enviado desde la clas Agencia.
 * @param id identificación del pasajero dato de tipo entero
 * @return Retorna una referencia al objeto Silla. 
 */
    public Silla buscarPasajero(int id){
        for (Silla silla : listaSilla) {
            if (silla.getPasajero().getId() == id) {
                return silla;
            }
        }
        return null;
    }
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Ciudad getCiudadSalida() {
        return ciudadSalida;
    }

    public void setCiudadSalida(Ciudad ciudadSalida) {
        this.ciudadSalida = ciudadSalida;
    }

    public Ciudad getCiudadLlegada() {
        return ciudadLlegada;
    }

    public void setCiudadLlegada(Ciudad ciudadLlegada) {
        this.ciudadLlegada = ciudadLlegada;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getNumeroSilla() {
        return numeroSilla;
    }

    public void setNumeroSilla(int numeroSilla) {
        this.numeroSilla = numeroSilla;
    }

    public Silla[] getListaSilla() {
        return listaSilla;
    }

    public void setListaSilla(Silla[] listaSilla) {
        this.listaSilla = listaSilla;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    @Override
    public String toString() {
        return "Vuelo numero " + numero + " CiudadSalida " + ciudadSalida + " CiudadLlegada " + ciudadLlegada
                + " Duracion=" + duracion + " Piloto=" + piloto + "]";
    }
}
