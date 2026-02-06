package inventario;

public class TelefonoMovil extends Producto{
    String marca;
    int capacidadBateria;
    final double impuesto = 0.21;
    public TelefonoMovil(String marca, int capacidadBateria, String nombre, double precio, int id) {
        super(nombre, id, precio);
        this.marca = marca;
        this.capacidadBateria = capacidadBateria;
    }
    @Override
    public double calcularImpuesto() {
        return this.precio * this.impuesto; //Devuelve la cantidad que hay que sumarle al precio debido a los impuestos
    }

    @Override
    public String mostrarDetalles() {
        return "El id del producto es: " + this.id + ", el nombre es: " + this.nombre + ", el precio es: " + this.precio + ", la marca es: " + this.marca + ", la capacidad de la bateria es: " + this.capacidadBateria;
    }
    @Override
    public double getPrecio() {
        return this.precio;
    }
}
