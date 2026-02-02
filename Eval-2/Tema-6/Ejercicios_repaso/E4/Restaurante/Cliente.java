package Restaurante;

public class Cliente {
    String nombre;
    int num_comensales;
    public Cliente(String nombre, int num_comensales) {
        this.nombre = nombre;
        this.num_comensales = num_comensales;
    }
    @Override
    public String toString() {
        return this.nombre + ", Numero de comensales: " + this.num_comensales;
    }
}
