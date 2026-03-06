package centro_educativo;

public class ExamenesEscritos extends Examen{
    int duracion;
    double calificacion;
    public ExamenesEscritos(String fecha, int duracion, double calificacion) {
        super(fecha);
        this.duracion = duracion;
        this.calificacion = calificacion;
    }
    @Override
    public boolean aprobado() {
        if (this.duracion < 90) {
            if (this.calificacion >= 6) {
                return true;
            }
        }
        return false;
    }
}
