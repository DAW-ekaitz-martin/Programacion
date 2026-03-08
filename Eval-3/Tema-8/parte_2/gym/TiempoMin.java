package gym;

public class TiempoMin implements Medible{
    private double valor;
    private String unidad;
    public TiempoMin(double valor, String unidad) {
        this.valor = valor;
        this.unidad = unidad;
    }
    @Override
    public double valor() {
        return this.valor;
    }
    @Override
    public String unidad() {
        return this.unidad;
    }
    @Override
    public String toString() {
        return "Valor: " + this.valor + ", Unidad: " + this.unidad;
    }
}