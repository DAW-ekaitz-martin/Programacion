package Cine;

public class Pelicula {
    int codigo;
    String duracion, titulo;
    public Pelicula(String titulo, String duracion, int codigo) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.duracion = duracion;
    }
    @Override
    public String toString() {
        return "Código de la pelicula: " + this.codigo + ", duracion: " + this.duracion + ", Titulo: " + this.titulo;
    }
}
