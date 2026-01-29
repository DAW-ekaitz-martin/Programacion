package Libro;
public class Libro {
    String isbn, titulo, autor;
    boolean disponible = true;
    public Libro(String isbn, String titulo, String autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
    }
    public boolean getDisponible() {
        return this.disponible;
    }
    public boolean setDisponible() {
        if (this.disponible) {
            this.disponible = false;
        }
        else {
            this.disponible = true;
        }
        return this.disponible;
    }
    @Override
    public String toString() {
        return "Titulo del libro: " + this.titulo + ", autor: " + this.autor + ", isbn: " + this.isbn + ", Disponible: " + this.disponible;
    }
}

