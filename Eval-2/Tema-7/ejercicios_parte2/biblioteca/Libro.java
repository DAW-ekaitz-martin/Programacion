package biblioteca;

public class Libro extends MaterialBiblioteca{
    String genero;
    public Libro (String titulo, String autor, String genero) {
        super(titulo, autor);
        this.genero = genero;
    }
    @Override
    public String toString() {
        return super.toString() + ", Género: " + this.genero;
    }
    @Override
    public double calcularMulta(int diasAtraso) {
        double importe = diasAtraso * 0.5;
        return importe;
    }
}
