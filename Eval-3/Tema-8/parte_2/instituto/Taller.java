package instituto;

public class Taller implements Inscribible, Validable{
    private int numPlazas, cursoMin, aforo;
    private String nombre;
    public Taller(String nombre, int numPlazas, int cursoMin, int aforo) {
        this.numPlazas = numPlazas;
        this.cursoMin = cursoMin;
        this.nombre = nombre;
        this.aforo = aforo;
    }
    public int getAforo() {
        return this.aforo;
    }
    public int getPlazas() {
        return this.numPlazas;
    }
    @Override
    public boolean inscribir(Alumno a) {
        if (cumpleRequisitos(a) && this.numPlazas >= 1) {
            this.numPlazas --;
            return true; //Se puede inscribir
        }
        return false;
    }
    @Override
    public int plazasDisponibles() {
        return this.aforo - this.numPlazas;
    }
    @Override
    public boolean cumpleRequisitos(Alumno a) {
        if (a.getCurso() >= this.cursoMin) {
            return true;
        }
        return false;
    }
    @Override
    public String motivoRechazo(Alumno a) {
        return "El alumno " + a.getNombre() + "no está en un curso suficientemente alto para participar en el taller de " + this.nombre;
    }
    @Override
    public String toString() {
        return "Nombre: " + this.nombre + ", Aforo: " + this.aforo + ", Plazas Disponibles: " + this.numPlazas + ", Curso min: " + this.cursoMin;
    }
}
