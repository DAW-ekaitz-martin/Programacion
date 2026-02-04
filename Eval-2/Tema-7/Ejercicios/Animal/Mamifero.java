package Animal;

public class Mamifero extends Animal{
    public Mamifero(String nombre, int edad) {
        super(nombre,edad);
    }
    public Mamifero(String nombre) {
        super(nombre);
    }
    public void  amamantar() {
        System.out.println("El mamífero está amamantado");
    }
}
