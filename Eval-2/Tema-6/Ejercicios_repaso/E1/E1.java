import Biblioteca.Biblioteca;
import Libro.Libro;
import Prestamo.Prestamo;
import Socio.Socio;
public class E1 {
    public static void main(String[] args) {
        Biblioteca mi_biblioteca = new Biblioteca("Mi biblioteca");
        Socio yo = new Socio("22766404S", "Ekaitz");
        Libro mi_libro = new Libro("A123", "Luna de Plutón", "Yo");
        Prestamo prestamo_1 = new Prestamo(mi_libro, 1, "activo", 3);
        Libro otro_libro = new Libro("B123", "La odisea", "Yo");
        Prestamo prestamo_2 = new Prestamo(otro_libro, 2, "activo", 3);
        mi_biblioteca.altaLibros(mi_libro);
        mi_biblioteca.altaLibros(otro_libro);
        //Añadir libros
        if(mi_libro.getDisponible()) {
            yo.aniadirPrestamo(prestamo_1);
        }
        //System.out.println(prestamo_1);
        if(otro_libro.getDisponible()) {
            yo.aniadirPrestamo(prestamo_2);
        }
        System.out.println(prestamo_1.getCodigoPrestamo());
        //Mostrar todos los prestamos de un socio.
        System.out.println("MIS PRÉSTAMOS");
        yo.getPrestamos();
        //Devolver libros
        System.out.println("PRUEBA C:   " + prestamo_1.libro);
        yo.devolverPrestamo(prestamo_1.getCodigoPrestamo());
        //mi_libro.setDisponible();
        prestamo_1.setEstadoDevuelto();
        //Listar libros disponibles
        System.out.println("LIBROS DISPONIBLES");
        mi_biblioteca.mostrarDisponibles();
        System.out.println("LIBROS NO DISPONIBLES");
        mi_biblioteca.mostrarNoDisponibles();
    }
}
