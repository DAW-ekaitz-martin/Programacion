package almacen;
public class Movil implements Fragil{
    private String marca;
    private int fragilidad;
    public Movil(String marca, int fragilidad) {
        this.marca = marca;
        this.fragilidad = fragilidad;
    }
    @Override
    public int nivelFragilidad() {
        return this.fragilidad;
    }
    @Override
    public String toString() {
        return "Marca: " + this.marca + ", Fragilidad: " + this.fragilidad;
    }
}
