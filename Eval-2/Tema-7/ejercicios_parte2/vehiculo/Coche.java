package vehiculo;

public class Coche extends Vehiculo{
    public Coche(String modelo) {
        super(modelo);
    }
    public void acelerar() {
        System.out.println("El coche acelera");
    }
}
