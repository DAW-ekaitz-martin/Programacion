package tienda;

public class Electronica implements Descontable{
    private String marca, tipo_articulo;
    private double precio;
    final int descuento = 10;
    public Electronica(String marca, String tipo_articulo, double precio) {
        this.marca = marca;
        this.tipo_articulo = tipo_articulo;
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
        return "Marca: " + this.marca + ", Tipo de Articulo: " + this.tipo_articulo + ", Precio: " + this.precio + ", Descuento: " + this.descuento;
    }
}
