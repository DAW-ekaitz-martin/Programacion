package Cine;
public class Reserva {
    final double precio = 10;
    int codigo_reserva, numero_entradas;
    String nombre_cliente;

    public Reserva(int codigo_reserva, int numero_entradas, String nombre_cliente) {
        this.codigo_reserva = codigo_reserva;
        this.numero_entradas = numero_entradas;
        this.nombre_cliente = nombre_cliente;
    }
    @Override
    public String toString() {
        return "Codigo_reserva: " + this.codigo_reserva + ", Numero de entradas: " + this.numero_entradas + 
        ", Nombre del Cliente: " + this.nombre_cliente + ", Precio por entrada: " + this.precio;
    }
}
