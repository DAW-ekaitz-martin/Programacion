package almacen;

public class Yogurt implements Perecedero{
    private int fragilidad, dias_para_caducar;
    private String marca;
    public Yogurt(String marca, int fragilidad, int dias_para_caducar) {
        this.marca = marca;
        this.fragilidad = fragilidad;
        this.dias_para_caducar= dias_para_caducar;
    }
    @Override
    public int diasParaCaducar() {
        return this.dias_para_caducar;
    }
    @Override
    public String toString() {
        return "Marca: " + this.marca + ", Fragilidad: " + this.fragilidad+ ", Dias para caducar: " + this.dias_para_caducar;
    }
}
