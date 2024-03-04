package Relaciones.src.ejercicio1;

public class Piloto {
    private String nombre;
    private int horasVuelo;
    
    public Piloto(String nombre, int horasVuelo) {
        this.nombre = nombre;
        this.horasVuelo = horasVuelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasVuelo() {
        return horasVuelo;
    }

    public void setHorasVuelo(int horasVuelo) {
        this.horasVuelo = horasVuelo;
    }

    @Override
    public String toString() {
        return "Piloto " + nombre + " HorasVuelo " + horasVuelo;
    }
}
