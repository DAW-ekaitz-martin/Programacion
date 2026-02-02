package Tienda;

public class Tienda {
    String nombre;
    int num_productos = 20;
    Producto[] catalogo = new Producto[num_productos];
    
    public Tienda(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return "Nombre de la tienda: " + this.nombre;
    }
}
