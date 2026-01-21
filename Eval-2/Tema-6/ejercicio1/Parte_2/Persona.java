public class Persona {
    String nombre, direccion;
    int edad;
    Persona(String nombre, int edad, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }
    void mostrarInformacion() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Dirección: " + this.direccion);
    }
    boolean esMayorDeEdad() {
        if(this.edad >= 18)
            return true;
        else
            return false;
    }
    int cumplirAnios() {
        return this.edad ++;
    }
    void cambiarNombre(String nombre) {
        this.nombre = nombre;
    }
    String establecerDireccion(String direccion) {
        this.direccion = direccion;
        return this.direccion;
    }
}
