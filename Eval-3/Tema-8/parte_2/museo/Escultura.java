package museo;

public class Escultura implements Exhibible, Restaurable {
    private String nombre, autor;
    private int anio, atractivo, estado;
    public Escultura(String nombre, String autor, int anio, int atractivo, int estado) {
        this.nombre = nombre;
        this.autor = autor;
        this.anio = anio;
        this.atractivo = atractivo;
        this.estado = estado;
    }
    @Override
    public String cartel() {
        return "Nombre: " + this.nombre + ", Autor: " + this.autor + ", Anio: " + this.anio + ", Atractivo: " + this.atractivo + ", Estado: " + this.estado;
    }
    @Override
    public int atractivo() {
        return this.atractivo;
    }
    @Override
    public int estado() {
        return this.estado;
    }
    @Override
    public double costeRestauracion() {
        return 45.50;
    }
}
