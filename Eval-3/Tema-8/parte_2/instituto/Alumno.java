package instituto;

public class Alumno {
    private String dni, nombre;
    private int edad, curso;
    private boolean autorizacionFirmada;

    public Alumno(String dni, String nombre, int edad, int curso, boolean autorizacionFirmada) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
        this.autorizacionFirmada = autorizacionFirmada;
    }

    public String getNombre() {
        return this.nombre;
    }
    public int getCurso() {
        return this.curso;
    }
    public boolean getAutorizacion() {
        return this.autorizacionFirmada;
    }
    @Override
    public String toString() {
        return "Nombre: " + this.nombre + ", DNI: " + this.dni + ", Edad: " + this.edad + ", Curso: " + this.curso + ", Autorización Firmanda: " + this.autorizacionFirmada;
    }
}
