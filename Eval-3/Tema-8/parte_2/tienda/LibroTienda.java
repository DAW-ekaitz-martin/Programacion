package tienda;

public class LibroTienda implements Descontable{
    private String nombre, autor;
    private double precio;
    final int descuento = 5;
    public LibroTienda(String nombre, String autor, double precio) {
        this.nombre = nombre;
        this.autor = autor;
        this.precio = precio;
    }
    public int getDescuento() {
        return this.descuento;
    }
    @Override
    public void aplicarDescuento(double porcentaje) {
        this.precio -= this.precio * (porcentaje/100);
    }
    @Override
    public double precioFinal() {
        return this.precio;
    }
    @Override
    public String toString() {
        return "Nombre: " + this.nombre + ", Autor: " + this.autor + ", Precio: " + this.precio + ", Descuento: " + this.descuento;
    }
}
