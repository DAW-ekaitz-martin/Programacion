package Animal;

public class Perro extends Mamifero {
    String raza;
    boolean esEntrenado;
    public Perro(String nombre, int edad, String raza, boolean esEntrenado) {
        super(nombre, edad);
        this.raza = raza;
        this.esEntrenado = esEntrenado;
    }
    public Perro(String nombre) {
        super(nombre);
    }
    public void ladrar() {
        System.out.println("Guau guau");
    }
    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + " y es de raza: " + this.raza;
    }
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra");
    }
    public void EsEntrenado() {
        if(this.esEntrenado) {
            System.out.println("El perro ha sido entrenado");
        }
        else {
            System.out.println("El perro NO ha sido entrenado");
        }
        
    }
    //Ejercicio 15
    @Override
    public void amamantar() {
        System.out.println("El perro está siendo amamantado");
    }
    // Ejercicio 17
    @Override
    public void desplazarse() {
        System.out.println("El perro se desplaza");
    }
}
