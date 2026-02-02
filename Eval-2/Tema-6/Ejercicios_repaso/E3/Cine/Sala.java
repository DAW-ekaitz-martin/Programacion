package Cine;

public class Sala {
    int identificador, capacidad, entradas_reservadas=0;
    public Sala(int identificador, int capacidad) {
        this.identificador = identificador;
        this.capacidad = capacidad;
    }
    @Override
    public String toString() {
        return this.identificador + ", Capacidad: " + this.capacidad + 
        ", Cantidad de entradas reservadas: " + this.entradas_reservadas + ", Entradas disponibles: " + (this.capacidad-this.entradas_reservadas);
    }
    public int getEntradasDisponibles() {
        return this.capacidad - this.entradas_reservadas;
    }
}
