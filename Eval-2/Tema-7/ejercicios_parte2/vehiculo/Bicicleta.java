package vehiculo;

public class Bicicleta extends Vehiculo{
    public Bicicleta(String modelo) {
        super(modelo);
    }
    public void acelerar() {
        System.out.println("La bicicleta acelera");
    }
}
