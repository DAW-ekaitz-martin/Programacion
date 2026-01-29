package Socio;
import Prestamo.Prestamo;
public class Socio {
    String dni, nombre;
    int num_prestamos = 0;
    Prestamo[] prestamos = new Prestamo[5];
    public Socio(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }
    public void aniadirPrestamo(Prestamo prestamo) {
        this.prestamos[this.num_prestamos] = prestamo;
        this.prestamos[this.num_prestamos].libro.setDisponible();
        this.num_prestamos ++;
    }
    public void devolverPrestamo(int codigo_prestamo) {
        //Quitar prestamo
        //Volvera poner el prestamo disponible
        for (int i = 0; i < this.num_prestamos; i++) {
            if (this.prestamos[i].getCodigoPrestamo() == codigo_prestamo) {
                System.out.println("Prueba A" + this.prestamos[i].libro);
                this.prestamos[i].libro.setDisponible();
                System.out.println("PRUEBA B:   " + this.prestamos[i].libro);
            }
            else {
                System.out.println("No se encontró ningún prestamo que contiene ese libro");
            }
        }
    }
    public void altaSocios(Socio[] lista_socios, int numero_socios, Socio socio_a_aniadir) {
        lista_socios[numero_socios] = socio_a_aniadir;
    }
    public void getPrestamos() {
        for (int i = 0; i < this.num_prestamos; i++) {
            System.out.println(this.prestamos[i]);
        }
    }
    @Override
    public String toString() {
        return "Nombre: " + this.nombre + ", DNI: " + this.dni + ", Numero de prestamos: " + this.num_prestamos;
    }
}