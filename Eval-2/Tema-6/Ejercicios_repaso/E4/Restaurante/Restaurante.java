package Restaurante;

public class Restaurante {
    String nombre;
    Mesa[] mesas = new Mesa[7];
    int cant_mesas = 0;
    public Restaurante(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return "Nombre: " + this.nombre;
    }
    //Añadir mesa
    public void aniadirMesa(Mesa mesa) {
        this.mesas[cant_mesas] = mesa;
        this.cant_mesas ++;
    }
    //Mostrar las mesas del restaurante
    public void getMesas() {
        for (int i = 0; i < this.cant_mesas; i++) {
            System.out.println(mesas[i]);
        }
    }
}
