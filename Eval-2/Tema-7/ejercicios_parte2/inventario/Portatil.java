package inventario;

public class Portatil  extends Producto{
    String procesador;
    int ram;
    final double impuesto = 0.18;
    public Portatil(String nombre, int id, double precio, String procesador, int ram) {
        super(nombre, id, precio);
        this.procesador = procesador;
        this.ram = ram;
    }
    @Override
    public double calcularImpuesto() {
        return this.impuesto * this.precio;
    }
    @Override
    public String mostrarDetalles() {
        return "El id del producto es: " + this.id + ", el nombre es: " + this.nombre + ", el precio es: " + this.precio + ", el procesador es : " + this.procesador + ", la memoria RAM es: " + this.ram;
    }
    @Override
    public double getPrecio() {
        return this.precio;
    }
}
