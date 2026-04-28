

public class Alumno {
    String dni, nombre;
    double nota;
    public Alumno(String dni, String nombre, double nota) {
        this.dni = dni;
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNota() {
        return nota;
    }
    @Override
    public String toString() {
        return this.dni + ", Nombre: " + this.nombre + ", Nota: " + this.nota;
    }

    
    
}
