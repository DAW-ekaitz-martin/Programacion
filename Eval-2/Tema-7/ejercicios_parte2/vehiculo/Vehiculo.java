package vehiculo;

public abstract  class Vehiculo {
    String modelo;
    public Vehiculo(String modelo) {
        this.modelo=modelo;
    }
    public abstract void acelerar();
    public void detener() {
        System.out.println("El coche se ha detenido");
    }
}
