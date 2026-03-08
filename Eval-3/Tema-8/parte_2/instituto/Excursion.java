package instituto;

public class Excursion implements Inscribible, Pagablee{
    private double precio;
    private int plazas, aforo;
    private String nombre;
    private boolean pagado = false;
    public Excursion(String nombre, int plazas, double precio, int aforo) {
        this.plazas = plazas; 
        this.nombre = nombre;
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
    public double precio() {
        return this.precio;
    }
    @Override
    public boolean registrarPago(Alumno a, double cantidad) {
        if (a.) {
            this.pagado = true;
        }
        return this.pagado;
    }
    @Override
    public boolean estaPagado(Alumno a) {
        if (registrarPago(a, this.precio)) {
            return true;
        }
        return false;
    }
    @Override
    public boolean inscribir(Alumno a) {
        if (estaPagado(a) && this.plazas >= 1 ){
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
    public String toString() {
        return "Nombre: " + this.nombre + ", Aforo: " + this.aforo + ", Plazas Disponibles: " + this.plazas + ", Precio: " + this.precio + ", Pagado: " + this.pagado;
    }
}
