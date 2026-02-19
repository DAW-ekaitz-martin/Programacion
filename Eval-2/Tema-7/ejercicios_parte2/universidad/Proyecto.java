package universidad;

public class Proyecto extends Evaluacion{
    public Proyecto(String nombreAlumno) {
        super(nombreAlumno);
    }
    @Override
    public double calcularNotaFinal() {
        double total = 0;
        double promedio;
        double nota_mas_baja = this.nota[0];
        for (int i= 0; i <= this.nota.length-1; i++) {
            if (this.nota[i] < nota_mas_baja) {
                nota_mas_baja = this.nota[i];
            }
            total += this.nota[i];
        }
        total -= nota_mas_baja;
        promedio = total / (this.nota.length - 1); //Resto 1 porque descarto la nota más baja, estonces debo dividir entre el numero de notas almacenadas en el array -1
        return promedio;
    }
    @Override
    public void aniadirNota(double nota) {
        super.nota[super.num_notas] = nota;
        super.num_notas ++;
    }
}
