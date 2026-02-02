package Cine;
import Cine.Pelicula;
import Cine.Sala;
import Cine.Reserva;
public class Sesion {
    int codigo_sesion,numero_de_reservas = 0;
    Pelicula pelicula;
    Sala sala;
    double recaudado = 0;
    Reserva[] reservas = new Reserva[6];
    
    public Sesion(int codigo_sesion, Pelicula pelicula, Sala sala) {
        this.codigo_sesion = codigo_sesion;
        this.pelicula = pelicula;
        this.sala = sala;
    }
    @Override
    public String toString() {
        return "Código: " + this.codigo_sesion + ", Cantidad reservas: " + this.numero_de_reservas + 
        ", " + this.pelicula + ", Sala: " + this.sala; 
    }

    public void crearSesion(Reserva reserva) {
        if (sala.capacidad >= sala.entradas_reservadas + reserva.numero_entradas) {
            reservas[numero_de_reservas] = reserva;
            numero_de_reservas ++;
            sala.entradas_reservadas += reserva.numero_entradas;
            this.recaudado += reserva.numero_entradas * reserva.precio;
        }
        else {
            System.out.println("No hay entradas suficientes para hacer la reserva");
        }
        
    }
    public void getReservas() {
        for (int i = 0; i < this.numero_de_reservas; i ++) {
            System.out.println(reservas[i]);
        }
    }
    public double getRecaudacion() {
        return this.recaudado;
    }
}

