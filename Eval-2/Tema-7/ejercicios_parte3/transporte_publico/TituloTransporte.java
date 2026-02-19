package transporte_publico;

public abstract class TituloTransporte {
    int numero;
    double precio;
    String zona;
    public TituloTransporte(int numero, double precio, String zona) {
        this.numero = numero;
        this.precio = precio;
        this.zona = zona;
    }
    public abstract boolean validarViaje();
    @Override //Cambio el mostrar estado a to string para poder heredarlo más facilmente en las subclases
    public String toString() {
        return "Numero: " + this.numero + ", Precio: " + this.precio + ", Zona: " + this.zona;
    }
    public int getNumero() {
        return this.numero;
    }
}
