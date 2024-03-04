package Relaciones.src.ejercicio1;

public class Silla {
    private char letra;
    private int numero;
    private Pasajero pasajero;
    
    public Silla(char letra, int numero, Pasajero pasajero) {
        this.letra = letra;
        this.numero = numero;
        this.pasajero = pasajero;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    @Override
    public String toString() {
        return "Silla # " + letra + "-" + numero + " " + pasajero;
    }

}
