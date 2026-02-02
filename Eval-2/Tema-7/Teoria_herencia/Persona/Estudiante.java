package Persona;

public class Estudiante extends Persona{
    private String carrera;
    public Estudiante(String nombre, String carrera, int edad) {
        super(nombre, edad);
        this.carrera = carrera;
    }

    @Override
    public String describir() {
        return super.describir() + " y la carrera es: " + this.carrera;
    }
}
