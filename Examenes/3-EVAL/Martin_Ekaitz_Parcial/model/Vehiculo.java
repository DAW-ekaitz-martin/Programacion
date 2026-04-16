package model;

public abstract class Vehiculo {
    private String marca, modelo;
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    abstract double calcularPrecioAlquiler();
    @Override
    public String toString() {
        return "Marca: " + this.marca + ", Modelo: " + this.modelo;
    }
}
