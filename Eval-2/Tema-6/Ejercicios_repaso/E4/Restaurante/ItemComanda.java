package Restaurante;

public class ItemComanda {
    String nombre_plato;
    double precio;
    int cantidad;
    public ItemComanda(String nombre_plato, double precio, int cantidad) {
        this.nombre_plato = nombre_plato;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    @Override
    public String toString() {
        return "Nombre del plato: " + this.nombre_plato + ", Precio: " + this.precio + ", Cantidad: " + this.cantidad;
    }
}
