package hospital;

public class Analitica extends ActoMedico{
    int numPruebas = 0;
    public Analitica (int id, String nombrePaciente, double costeBase, int numPruebas) {
        super(id, nombrePaciente, costeBase);
        this.numPruebas = numPruebas;
    }
    @Override
    public double calcularCoste() {
        return this.costeBase + this.numPruebas * 8;
    }
    @Override
    public String toString() {
        return super.toString() + ", Numero de Pruebas: " + this.numPruebas;
    }
}
