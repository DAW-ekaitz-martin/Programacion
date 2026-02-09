package persona;

public class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public String presentarse() {
        return "Me llamo " + this.nombre + " y tengo " + this.edad;
    }
}
