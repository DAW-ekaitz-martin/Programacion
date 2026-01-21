package Parte_5;

public class Autor {
    String nombre;
    int edad;
    public Autor (String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public String getNombre () {
        return this.nombre;
    }
    public int getEdad () {
        return this.edad;
    }
}
