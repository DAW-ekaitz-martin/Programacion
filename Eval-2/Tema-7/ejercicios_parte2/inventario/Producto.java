package inventario;

public abstract class Producto {
    int id;
    String nombre;
    double precio;
    public Producto(String nombre, int id, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }
    @Override
    public String toString() {
        return "El id del producto es: " + this.id + ", el nombre es: " + this.nombre + ", el precio es: " + this.precio;
    }
    public abstract double calcularImpuesto();
    public abstract String mostrarDetalles();
    public abstract double getPrecio();
}
