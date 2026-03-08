package instituto;

public class Competicion implements Inscribible, Validable{
    private String nombre;
    private int plazas, aforo;

    public Competicion(String nombre, int plazas, int aforo) {
        this.nombre = nombre;
        this.plazas = plazas;
        this.aforo = aforo;
    }
    public int getAforo() {
        return this.aforo;
    }
    public int getPlazas() {
        return this.plazas;
    }
    @Override
    public boolean inscribir(Alumno a) {
        if (this.plazas >= 1 && cumpleRequisitos(a)){
            this.plazas --;
            return true;
        }
        return false;
    }
    @Override
    public int plazasDisponibles() {
        return this.aforo - this.plazas;
    }
    @Override
    public boolean cumpleRequisitos(Alumno a) {
        if (a.getAutorizacion()) {
            return true;
        }
        return false;
    }
    @Override
    public String motivoRechazo(Alumno a) {
        return "La solicitud del alumno " + a.getNombre() + " ha sido rechazada porque no dispone del consentimiento médico pertinente para participar en " + this.nombre;
    }
    @Override
    public String toString() {
        return "Nombre: " + this.nombre + ", Aforo: " + this.aforo + ", Plazas Disponibles: " + this.plazas;
    }
}
