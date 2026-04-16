public class Alumno {
    private String dni,nombre,apellidos;
    public Alumno(String dni, String nombre, String apellidos) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    public String getDNI() {
        return this.dni;
    }
    @Override
    public String toString() {
        return this.apellidos + ", " + this.nombre + "(" + this.dni + ")";
    }

}
