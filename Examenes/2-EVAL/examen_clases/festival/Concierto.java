package festival;

public class Concierto {
    String codigo, artista, escenario;
    double precio_entrada;
    int hora_inicio, minuto_inicio, hora_fin, minuto_fin, aforo;
    public Concierto(String codigo, String artista, String escenario, int hora_inicio, int minuto_inicio, int hora_fin, int minuto_fin, double precio_entrada, int aforo) {
        this.codigo = codigo;
        this.artista = artista;
        this.escenario = escenario;
        this.hora_inicio = hora_inicio;
        this.minuto_inicio = minuto_inicio;
        this.hora_fin = hora_fin;
        this.minuto_fin = minuto_fin;
        this.precio_entrada = precio_entrada;
        this.aforo = aforo;
    }
    /**
     * 
     * @return Retorna el aforo disponible del concierto
     */
    public int getAforo() {
        return this.aforo;
    }
    @Override
    public String toString() {
        return this.codigo+ " "+ this.artista + " " + this.escenario + " (" + this.hora_inicio + ":" + this.minuto_inicio + "-" + this.hora_fin + ":" + this.minuto_fin +") " + this.precio_entrada + "$";
    }
}
