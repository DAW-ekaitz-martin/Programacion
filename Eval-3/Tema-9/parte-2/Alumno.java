import java.util.Arrays;

public class Alumno {
    private String dni,nombre,apellidos;
    private double[] notas = new double[0];
    public Alumno(String dni, String nombre, String apellidos) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    @Override
    public String toString() {
        return this.apellidos+ ", " + this.nombre+"(" + this.dni+")";
    }
    public String getDni() {
        return this.dni;
    }
    public String getNombre() {
        return this.dni;
    }
    public void addNota(double nota) {
        this.notas = Arrays.copyOf(this.notas, this.notas.length+1);
        this.notas[this.notas.length-1] = nota;
    }
    public double[] getNotas() {
        return this.notas;
    }
}
