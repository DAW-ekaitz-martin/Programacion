package Prestamo;
import  Libro.Libro;
public class Prestamo {
    public Libro libro;
    String estado;
    int codigo_prestamo, numero_dias;
    public Prestamo(Libro libro, int codigo_prestamo, String estado, int numero_dias) {
        this.libro = libro;
        this.codigo_prestamo = codigo_prestamo;
        this.estado = estado;
        this.numero_dias = numero_dias;
    }
    public int getCodigoPrestamo() {
        return this.codigo_prestamo;
    }
    public void setEstadoDevuelto() {
        this.estado = "devuelto";
    }
    public void setEstadoActivo() {
        this.estado = "activo";
    }
    @Override
    public String toString() {
        return this.libro + ", estado: " + this.estado + ", código: " + this.codigo_prestamo + ", numero de dias: " + this.numero_dias;
    }
}
