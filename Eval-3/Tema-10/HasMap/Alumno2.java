public class Alumno2 {
    String dni, nombre;
    double nota;
    public Alumno2(String dni, String nombre, double nota) {
        this.dni = dni;
        this.nombre = nombre;
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }
    
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }
    
}
