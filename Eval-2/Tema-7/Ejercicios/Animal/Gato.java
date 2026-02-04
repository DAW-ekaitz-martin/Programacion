package Animal;

public class Gato extends Mamifero{
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
    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion();
    }
    //Ejercicio 15
    @Override
    public void amamantar() {
        System.out.println("El gato está siendo amamantado");
    }
    // Ejercicio 17
    @Override
    public void desplazarse() {
        System.out.println("El gato se desplaza");
    }
}
