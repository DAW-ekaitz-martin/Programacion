package centro_educativo;

public abstract class Examen implements Aprobable{
    String fecha;
    public Examen(String fecha) {
        this.fecha = fecha;
    }
    @Override
    public abstract boolean aprobado();
}
