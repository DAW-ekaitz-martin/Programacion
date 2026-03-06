package museo;

public class Fotografia implements Exhibible{
    private String nombre, autor;
    private int anio, atractivo;
    public Fotografia(String nombre, String autor, int anio, int atractivo) {
        this.nombre = nombre;
        this.autor = autor;
        this.anio = anio;
        this.atractivo = atractivo;
    }
    @Override
    public String cartel() {
        return "Nombre: " + this.nombre + ", Autor: " + this.autor + ", Anio: " + this.anio + ", Atractivo: " + this.atractivo;
    }
    @Override
    public int atractivo() {
        return this.atractivo;
    }
}
