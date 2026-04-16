package model;

public class Coche extends Vehiculo implements Revisable, Asegurable{
    private double precio;
    private double descuentoVehiculoGrande = 250;
    private int mesesAlquiler;
    public Coche(String marca, String modelo, double precio, int mesesAlquiler) {
        super(marca, modelo);
        this.precio = precio;
        this.mesesAlquiler = mesesAlquiler;
    }
    @Override
    public double calcularPrecioAlquiler() {
        return (this.precio * this.mesesAlquiler) - this.descuentoVehiculoGrande;
    }
    @Override
    public String mostrarNormasRevision() {
        return " 1-Las emisiones no pueden superar el máximo permitido. \n 2-Todas las luces del vehiculo deben funcionar correctamente. \n 3-La presion de las 4 ruedas debe ser la correcta.";
    }
    @Override
    public String mostrarCondicionesSeguro() {
        return " 1-Al tratarse de un turismo, el precio del seguro será superior al de una moto. \n 2-Si el titular es novel, se realizará un recargo de 50 euros.";
    }
    @Override
    public String toString() {
        return super.toString() +", Precio: " + this.precio +  ", Descuento por vehiculo grande: " + this.descuentoVehiculoGrande + ", Duracion del alquiler: " + this.mesesAlquiler;
    }
}
