package plataforma;

public class TallerPresencial implements Ofertable {
    private String titulo, profesor;
    private int duracion_horas;
    private double precio;
    public TallerPresencial(String titulo, String profesor, int duracion_horas, double precio) {
        this.titulo = titulo;
        this.profesor = profesor;
        this.duracion_horas = duracion_horas;
        this.precio = precio;
    }

    public String getTitulo() {
        return this.titulo;
    }
    public String getProfesor() {
        return this.profesor;
    }
    public int duracionHoras() {
        return this.duracion_horas;
    }
    public double precio() {
        return this.precio;
    }
    @Override
    public String toString() {
        return "Titulo: " + this.titulo + ", Profesor: " + this.profesor + ", Duracion horas: " + this.duracion_horas + ", Precio: " + this.precio;
    }
}
