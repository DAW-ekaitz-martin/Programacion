package centro_educativo;

public class ExamenesOrales extends Examen{
    String satisfaccion;
    public ExamenesOrales(String fecha, String satisfaccion) {
        super(fecha);
        this.satisfaccion = satisfaccion;
    }
    @Override
    public boolean aprobado() {
        if(this.satisfaccion.equals("Suspenso") || this.satisfaccion.equals("Insuficiente")) {
            return false;
        }
        return true;
    }
}
