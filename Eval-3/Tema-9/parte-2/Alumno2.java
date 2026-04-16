public class Alumno2 {
    private String dni,nombre,apellidos;
    private int[] notas = new int[0];
    public Alumno2(String dni, String nombre, String apellidos) {
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
