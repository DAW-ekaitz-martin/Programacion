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
    public void altaLibros(Libro[] array_libros, Libro libro_a_aniadir, int posicion) {
        array_libros[posicion] = libro_a_aniadir;
    }
}
