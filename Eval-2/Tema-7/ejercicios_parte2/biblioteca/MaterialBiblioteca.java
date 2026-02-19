package biblioteca;

public abstract class MaterialBiblioteca {
    String titulo, autor;
    public MaterialBiblioteca(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    @Override
    public String toString() {
        return "Titulo: " + this.titulo + ", Autor: " + this.autor;
    }
    public abstract double calcularMulta(int diasAtraso);

    public String getTitulo() {
        return this.titulo;
    }
}
