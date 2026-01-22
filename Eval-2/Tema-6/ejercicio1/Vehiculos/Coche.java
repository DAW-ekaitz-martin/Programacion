package Vehiculos;

public class Coche {
    String marca, modelo;
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    public String getMarca() {
        return this.marca;
    }
    public String getModelo() {
        return this.modelo;
    }
}
