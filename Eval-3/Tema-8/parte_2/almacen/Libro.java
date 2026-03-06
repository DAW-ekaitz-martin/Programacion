package almacen;

public class Libro {
    private String autor, titulo;
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    @Override
    public String toString() {
        return "Autor: " + this.autor + ", Titulo: " + this.titulo;
    }
}
