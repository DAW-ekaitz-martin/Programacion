package model;

public class Moto extends Vehiculo implements Revisable, Asegurable{
    private double precio;
    private double descuentoVehiculoPequenio = 150;
    private int mesesAlquiler;
    public Moto(String marca, String modelo, double precio, int mesesAlquiler) {
        super(marca, modelo);
        this.precio = precio;
        this.mesesAlquiler = mesesAlquiler;
    }
    @Override
    public double calcularPrecioAlquiler() {
        return (this.precio * this.mesesAlquiler) - this.descuentoVehiculoPequenio;
    }
    @Override
    public String mostrarNormasRevision() {
        return " 1-Las emisiones no pueden superar el máximo permitido. \n 2-Todas las luces del vehiculo deben funcionar correctamente. \n 3-La direccion de la moto debe funcionar correctamente.";
    }
    @Override
    public String mostrarCondicionesSeguro() {
        return " 1-Al tratarse de una moto, el precio del seguro será inferior al de un turismo. \n 2-Si el titular es novel, se realizará un recargo de 50 euros.";
    }
    @Override
    public String toString() {
        return super.toString() +", Precio: " + this.precio +  ", Descuento por vehiculo pequeño: " + this.descuentoVehiculoPequenio + ", Duracion del alquiler: " + this.mesesAlquiler;
    }
}
