package universidad;

public abstract class Evaluacion {
    String nombreAlumno;
    double[] nota = new double[5];
    int num_notas = 0;
    public Evaluacion(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }
    public abstract double calcularNotaFinal();
    public abstract void aniadirNota(double nota);
}
