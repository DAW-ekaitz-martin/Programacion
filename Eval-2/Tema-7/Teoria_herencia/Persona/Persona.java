package Persona;
public class Persona {
    String nombre;
    int edad;
    public Persona (String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public String describir() {
        return "El nombre es: " + this.nombre + ", la edad es: " + this.edad;
    }
}