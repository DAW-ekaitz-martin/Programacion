package Parte_1;
public class Persona {
    String nombre;
    int edad;
    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    void mostrarInformacion() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad); System.out.println("Dirección: " + this.direccion);
    }
    boolean esMayorDeEdad() {
        if(this.edad >= 18)
            return true;
        else
            return false;
    }
}
