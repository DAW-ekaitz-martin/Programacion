import Cine.Cine;
import Cine.Pelicula;
import Cine.Reserva;
import Cine.Sala;
import Cine.Sesion;
public class E3 {
    public static void main(String[] args) {
        Cine mi_cine = new Cine("Mi cine");
        Pelicula django = new Pelicula("Django", "3h 5min", 1);
        Pelicula el_caballero_oscuro = new Pelicula("El caballero oscuro", "2h 30min", 2);
        Pelicula ready_player_one = new Pelicula("Ready player One", "3h 18min", 3);
        Sala sala_1 = new Sala(1, 50);
        Sala sala_2 = new Sala(2, 50);
        Sala sala_3 = new Sala(3, 50);
        Sala sala_4 = new Sala(4, 50);
        Reserva reserva_1 = new Reserva(1, 4, "Ekaitz");
        Reserva reserva_2 = new Reserva(2, 4, "Manuel");
        Sesion sesion_1 = new Sesion(1, ready_player_one, sala_1);
        Sesion sesion_2 = new Sesion(2, el_caballero_oscuro, sala_2);
        //Añadir las pelis, salas
        mi_cine.aniadirPeli(django);
        mi_cine.aniadirPeli(el_caballero_oscuro);
        mi_cine.aniadirPeli(ready_player_one);
        mi_cine.aniadirSala(sala_1);
        mi_cine.aniadirSala(sala_2);
        mi_cine.aniadirSala(sala_3);
        mi_cine.aniadirSala(sala_4);

        //Añadir la reserva a la Sesión
        sesion_1.crearSesion(reserva_1);
        sesion_1.crearSesion(reserva_2);
        /*System.out.println("INFORMACIÓN GENERAL DE LA SESIÓN: ");
        System.out.println(sesion_1);
        System.out.println("INFORMACIÓN DE LAS RESERVAS DE LA SESIÓN: ");
        sesion_1.getReservas();
        //Recaudación de la sesión
        System.out.println("RECAUDACIÓN DE LA SESIÓN: ");
        System.out.println(sesion_1.getRecaudacion());
        //Consultar entradas disponibles
        System.out.println("ENTRADAS DISPONIBLES: ");
        System.out.println(sala_1.getEntradasDisponibles());*/
        //Consultar la sesión más libre:
        mi_cine.aniadirSesion(sesion_1);
        mi_cine.aniadirSesion(sesion_2);
        System.out.println("SESIÓN MÁS LIBRE: ");
        System.out.println(mi_cine.getsesionMasLibre());
    }
}
