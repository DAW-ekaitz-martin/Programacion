public class Jugador {
    String nombre;
    int puntos, asistencias, faltas;
    public Jugador(String nombre, int puntos, int asistencias, int faltas) {
        this.nombre = nombre;
        this.puntos = puntos;
        this.asistencias = asistencias;
        this.faltas = faltas;
    }
    public int getAsistencias() {
        return asistencias;
    }
    public int getFaltas() {
        return faltas;
    }
    public String getNombre() {
        return nombre;
    }
    public int getPuntos() {
        return puntos;
    }
    @Override
    public String toString() {
        return this.nombre + ", Puntos: " + this.puntos + ", Asistencias: " + this.asistencias + ", Faltas: " + this.faltas;
    }
}
