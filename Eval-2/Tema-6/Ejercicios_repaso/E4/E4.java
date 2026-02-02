import Restaurante.Mesa;
import Restaurante.Cliente;
import Restaurante.Comanda;
import Restaurante.ItemComanda;
import Restaurante.Restaurante;
public class E4 {
    public static void main(String[] args) {
        Restaurante mi_restaurante = new Restaurante("Restaurante Ekaitz Martin");
        Mesa mesa_1 = new Mesa(1, 7);
        Mesa mesa_2 = new Mesa(2, 5);
        Mesa mesa_3 = new Mesa(3, 10);
        Cliente ekaitz = new Cliente("Ekaitz", 6);
        ItemComanda item_1 = new ItemComanda("arroz", 5, 2);
        ItemComanda item_2 = new ItemComanda("pollo asado", 12.5, 1);
        ItemComanda item_3 = new ItemComanda("Plato combinado", 7.25, 4);
        Comanda comanda_1 =  new Comanda(1, mesa_1);
        //Añadir mesas al array(Restaurante)
        System.out.println("MESAS QUE HAY EN EL RESTAURANTE: ");
        mi_restaurante.aniadirMesa(mesa_1);
        mi_restaurante.aniadirMesa(mesa_2);
        mi_restaurante.aniadirMesa(mesa_3);
        //Listar mesas y su estado
        mi_restaurante.getMesas();
        //Añadir cliente a una mesa
        System.out.println("MESA 1:");
        mesa_1.setCliente(ekaitz);
        System.out.println(mesa_1);
        System.out.println("MESA 2:");
        mesa_2.setCliente(ekaitz);//Muestra mensaje de que no se puede añadir el cliente a la mesa, ya que excede su capacidad
        System.out.println(mesa_2);
        System.out.println("SITUACIÓN DE MESA OCUPADA:");
        mesa_1.setCliente(ekaitz);
        //Añadir items a una comanda
        comanda_1.aniadirItems(item_1);
        comanda_1.aniadirItems(item_2);
        comanda_1.aniadirItems(item_3);
        System.out.println("ITEMS DE UNA COMANDA:");
        comanda_1.getItems();
        //Cobrar y liberar mesa
        comanda_1.cobrarLiberarMesa(mesa_1);
        System.out.println("INFORMACIÓN DE LA MESA QUE ACABA DE SER LIBERADA:");
        System.out.println(mesa_1);
        System.out.println("LISTAR MESAS Y SU ESTADO:");
        mi_restaurante.getMesas();
        //Volver a utilizar la mesa desocupada recientemente
        System.out.println("REUTILIZAR LA MESA QUE ACABO DE DESOCUPAR:");
        mesa_1.setCliente(ekaitz);
        System.out.println(mesa_1);
    }
}
