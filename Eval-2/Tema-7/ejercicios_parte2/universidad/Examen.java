package universidad;

public class Examen  extends Evaluacion{
    public Examen(String nombreAlumno) {
        super(nombreAlumno);
    }
    @Override
    public double calcularNotaFinal() {
        double total = 0;
        double promedio;
        for (int i= 0; i <= super.nota.length-1; i++) {
            total += super.nota[i];
        }
        promedio = total / super.nota.length;
        return promedio;
    }
}
