package Animal;
public class Animal {
    String nombre;
    int edad = 0;
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public Animal(String nombre) {
        this.nombre = nombre;
    }
    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
    public String mostrarInformacion() {
       return "El animal se llama: " + this.nombre + " y tiene " + this.edad + " años";
    }
}