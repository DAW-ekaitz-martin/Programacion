package Prestamo;

public class Prestamo {
    String codigo_prestamo, estado;
    int numero_dias;
    public Prestamo(String codigo_prestamo, String estado, int numero_dias) {
        this.codigo_prestamo = codigo_prestamo;
        this.estado = estado;
        this.numero_dias = numero_dias;
    }
}
