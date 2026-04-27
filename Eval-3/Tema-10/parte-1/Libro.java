public class Libro {
    String titulo, autor;
    int anio;
    public Libro(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }
    public int getAnio() {
        return anio;
    }
    public String getAutor() {
        return autor;
    }
    public String getTitulo() {
        return titulo;
    }
    @Override
    public String toString() {
        return this.titulo + ", Autor: " + this.autor + ", Año: " + this.anio;
    }
}
