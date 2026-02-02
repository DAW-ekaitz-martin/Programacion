package Restaurante;
import Restaurante.ItemComanda;
public class Comanda {
    int codigo;
    int cant_items = 0;
    Mesa mesa_asociada;
    ItemComanda[] items = new ItemComanda[10];
    double a_cobrar = 0;
    public Comanda (int codigo, Mesa mesa_asociada) {
        this.codigo = codigo;
        this.mesa_asociada = mesa_asociada;
    }
    @Override
    public String toString() {
        return "Codigo de comanda: " + this.codigo + ", Mesa asociada: " + this.mesa_asociada;
    }
    public void aniadirItems(ItemComanda item) {
        this.items[cant_items] = item;
        a_cobrar += item.precio * item.cantidad;
        cant_items ++;
    }
    //Mostrar items
    public void getItems() {
        for (int i = 0; i < this.cant_items; i++) {
            System.out.println(items[i]);
        }
    }

    //Liquidar y liberar mesa
    public void cobrarLiberarMesa(Mesa mesa) {
        mesa.estado = "libre";
        mesa.cliente = null;
        System.out.println("La mesa " + mesa.numero + " ha sido liberada, total a pagar: " + this.a_cobrar);
    }
}
