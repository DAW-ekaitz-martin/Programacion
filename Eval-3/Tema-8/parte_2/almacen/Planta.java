package almacen;

public class Planta implements Fragil, Perecedero{
    private String tipo;
    private int fragilidad, dias_para_caducar;
    public Planta(String tipo, int fragilidad, int dias_para_caducar) {
        this.tipo = tipo;
        this.fragilidad = fragilidad;
        this.dias_para_caducar = dias_para_caducar;
    }
    @Override
    public int nivelFragilidad() {
        return this.fragilidad;
    }
    @Override
    public int diasParaCaducar() {
        return this.dias_para_caducar;
    } 
    @Override
    public String toString() {
        return "Tipo: " + this.tipo + ", Fragilidad: " + this.fragilidad + ", Dias para caducar: " + this.dias_para_caducar;
    }
}
