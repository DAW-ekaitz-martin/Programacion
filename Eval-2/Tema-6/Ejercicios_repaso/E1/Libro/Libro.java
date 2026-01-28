package Libro;
public class Libro {
    String isbn, titulo, autor;
    boolean disponible;
    public Libro(String isbn, String titulo, String autor, boolean disponible) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }
    public boolean getDisponible() {
        return this.disponible;
    }
    public boolean setDisponible() {
        return !this.disponible;
    }
    @Override
    public String toString() {
        return "Titulo del libro: " + this.titulo + ", autor: " + this.autor + ", isbn: " + this.isbn + ", Disponible: " + this.disponible;
    }
}

