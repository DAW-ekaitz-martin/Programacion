package biblioteca;

public class Revista extends MaterialBiblioteca{
    int numeroEdicion;
    public Revista (String titulo, String autor, int numeroEdicion) {
        super(titulo, autor);
        this.numeroEdicion = numeroEdicion;
    }
    @Override
    public String toString() {
        return super.toString() + ", Número de Edición: " + this.numeroEdicion;
    }
    @Override
    public double calcularMulta(int diasAtraso) {
        double importe = diasAtraso * 0.25;
        return importe;
    }
}
