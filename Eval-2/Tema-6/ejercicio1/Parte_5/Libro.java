package Parte_5;

public class Libro {
    String titulo;
    double precio;
    Autor autor;
    public Libro(String titulo, double precio, Autor autor) {
        this.titulo = titulo;
        this.precio = precio;
        this.autor = autor;
    }
    public String getTitulo () {
        return this.titulo;
    }
    public double getPrecio () {
        return this.precio;
    }
}
