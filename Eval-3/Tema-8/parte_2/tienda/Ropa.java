package tienda;

public class Ropa implements Descontable{
    private String talla;
    private double precio;
    final int descuento = 20;
    public Ropa(String talla, double precio) {
        this.talla = talla;
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
        return "Talla: " + this.talla + ", Precio: " + this.precio + ", Descuento: " + this.descuento;
    }
}
