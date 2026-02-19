package hospital;

public class Cirugia extends ActoMedico{
    int minutosQuirofano;
    public Cirugia(int id, String nombrePaciente, double costeBase, int minutosQuirofano) {
        super(id, nombrePaciente, costeBase);
        this.minutosQuirofano = minutosQuirofano;
    }
    @Override
    public double calcularCoste() {
        return this.costeBase + this.minutosQuirofano * 12;
    }
    @Override
    public String toString() {
        return super.toString() + ", Minutos de quirófano: " + this.minutosQuirofano;
    }
}
