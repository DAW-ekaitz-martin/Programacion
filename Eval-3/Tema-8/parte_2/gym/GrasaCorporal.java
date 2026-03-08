package gym;

public class GrasaCorporal implements Medible{
    private double valor;
    private String unidad;
    public GrasaCorporal(double valor, String unidad) {
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
}
