package biblioteca;

public abstract class Publicacion {
    int codigo, anio_publicacion;
    String titulo;
    public Publicacion(String titulo, int codigo, int anio_publicacion) {
        this.codigo = codigo;
        this.anio_publicacion = anio_publicacion;
        this.titulo = titulo;
    }
    @Override
    public String toString() {
        return "Codigo: " + this.codigo + ", Año de publicación: " + this.anio_publicacion + ", Titulo: " + this.titulo;
    }
    public int getCodigo() {
        return this.codigo;
    }
    public int getAnio() {
        return this.anio_publicacion;
    }
}
