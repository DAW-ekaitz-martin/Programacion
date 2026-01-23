package Socio;
import Prestamo.Prestamo;
public class Socio {
    String dni, nombre;
    int num_prestamos;
    Prestamo[] prestamos = new Prestamo[5];
    public Socio(String dni, String nombre, int num_prestamos, Prestamo prestamos) {
        this.dni = dni;
        this.nombre = nombre;
        this.num_prestamos = num_prestamos;
        this.prestamos[num_prestamos] = prestamos;
    }
    public void altaSocios(Socio[] lista_socios, int numero_socios, Socio socio_a_aniadir) {
        lista_socios[numero_socios] = socio_a_aniadir;
    }
}