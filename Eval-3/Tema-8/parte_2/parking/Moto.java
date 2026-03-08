package parking;

public class Moto implements Pagable{
    private String tipo;
    double importeHora;
    public Moto(String tipo, double importeHora) {
        this.tipo = tipo;
        this.importeHora = importeHora;
    }

    @Override
    public double importe(int horas) {

        return this.importeHora * horas;
    }
    @Override
    public String toString() {
        return "Tipo: " + this.tipo + ", Importe por Hora: " + this.importeHora;
    }
}
