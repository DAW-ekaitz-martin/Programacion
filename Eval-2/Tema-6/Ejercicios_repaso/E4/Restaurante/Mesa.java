package Restaurante;

public class Mesa {
    int numero, capacidad;
    String estado = "libre";//ocupada/libre
    Cliente cliente;
    public Mesa(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }
    @Override
    public String toString() {
        return "Numero de mesa: " + this.numero + ", Capacidad: " + this.capacidad + ", Estado: " + this.estado + ", Cliente: " + this.cliente;
    }
    public void setCliente(Cliente cliente) {
        if (this.estado.equals("ocupada")) {
            System.out.println("La mesa está ocupada");
        }
        else if (this.capacidad < cliente.num_comensales) {
            System.out.println("La capacidad de la mesa es menor a la cantidad de comensales");
        }
        else{
            this.cliente = cliente;
            this.estado = "ocupada";
        }
    }
}
