package instituto;

public interface Pagablee {
    double precio();
    /**
     * true si queda pagado
     * @param a
     * @param cantidad
     * @return
     */
    boolean registrarPago(Alumno a, double cantidad);
    boolean estaPagado(Alumno a);
}
