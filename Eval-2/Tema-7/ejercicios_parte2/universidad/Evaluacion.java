package universidad;

public abstract class Evaluacion {
    String nombreAlumno;
    int[] nota = new int[5];
    public Evaluacion(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }
    public abstract double calcularNotaFinal();

}
