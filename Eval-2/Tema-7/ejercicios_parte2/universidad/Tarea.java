package universidad;

public class Tarea extends Evaluacion{
    public Tarea(String nombreAlumno) {
        super(nombreAlumno);
    }
    @Override
    public double calcularNotaFinal() {
        double total = 0;
        double promedio;
        for (int i= 0; i <= this.nota.length-1; i++) {
            total += this.nota[i];
        }
        promedio = total / this.nota.length;
        double suma_adicional = promedio * 0.10;
        promedio += suma_adicional;
        return promedio;
    }
    @Override
    public void aniadirNota(double nota) {
        super.nota[super.num_notas] = nota;
        super.num_notas ++;
    }
}
