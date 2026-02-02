package Tienda;

public class Producto {
    String codigo, nombre;
    double precio;
    int stock;

    public Producto(String codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    @Override
    public String toString() {
        return "Codigo del producto: " + this.codigo + ", Nombre del producto: " + this.nombre +
        ", Precio: " + this.precio + ", Stock: " + this.stock;
    }
    public String getCodigo() {
        return this.codigo;
    }
}
