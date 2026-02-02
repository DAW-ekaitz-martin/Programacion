package Animal;

public class Gato extends Animal{
    public Gato(String nombre, int edad) {
        super(nombre,edad);
    }

    public void maullar() {
        System.out.println("Miau Miau");
    }

    @Override
    public void hacerSonido() {
        System.out.println("El gato maúlla");
    }
}
