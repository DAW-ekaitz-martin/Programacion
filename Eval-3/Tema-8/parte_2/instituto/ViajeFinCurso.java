package instituto;

public class ViajeFinCurso implements Inscribible, Pagablee, Validable{
    private double precio;
    private String nombre;
    private int plazas, aforo;
    private boolean pagado;
    public ViajeFinCurso(String nombre, double precio, int plazas, int aforo) {
        this.nombre = nombre;
        this.plazas = plazas;
        this.precio = precio;
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
        if (estaPagado(a) && this.plazas >= 1 && cumpleRequisitos(a)){
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
    public double precio() {
        return this.precio;
    }
    @Override
    public boolean registrarPago(Alumno a, double cantidad) {
        if (this.pagado == false) {
            this.pagado = true;
        }
        return this.pagado;
    }
    @Override
    public boolean estaPagado(Alumno a) {
        if (this.pagado) {
            return true;
        }
        return false;
    }
    @Override
    public boolean cumpleRequisitos(Alumno a) {
        if (a.getCurso() >= 6) {
            return true;
        }
        return false;
    }
    @Override
    public String motivoRechazo(Alumno a) {
        return "La solicitud del alumno " + a.getNombre() + " ha sido rechazada porque no pertenece a un curso suficientemente alto como para ir al viaje de fin de curso " + this.nombre;
    }
    @Override
    public String toString() {
        return "Nombre: " + this.nombre + ", Aforo: " + this.aforo + ", Plazas Disponibles: " + this.plazas + ", Precio: " + this.precio + ", Pagado: " + this.pagado;
    }
}
