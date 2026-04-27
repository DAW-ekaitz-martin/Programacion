import java.util.ArrayList;
import java.util.Collections;

public class E16 {
    public static void main(String[] args) {
        Pedido p1 = new Pedido("2004-11-5",1,2,45.84);
        Pedido p2 = new Pedido("2004-11-5",2,2,94.5);
        Pedido p3 = new Pedido("2000-5-3",3,3,3.8);
        Pedido p4 = new Pedido("2013-11-3",4,1,21.84);
        Pedido p5 = new Pedido("2004-9-3",5,2,51.4);
        ArrayList<Pedido> pedidos = new ArrayList<>();
        pedidos.add(p1);
        pedidos.add(p2);
        pedidos.add(p3);
        pedidos.add(p4);
        pedidos.add(p5);
        System.out.println("ANTES DE ORDENAR");
        System.out.println(pedidos);
        //Por Codigo
        Collections.sort(pedidos, (a1, a2) -> {
            return a1.compareTo(a2);
        });
        System.out.println("ORDENADO POR FECHA");
        System.out.println(pedidos);
        //Por Prioridad y luego importe
        Collections.sort(pedidos, (a1, a2) -> {
            //Ordenar por Prioridad descendente
            if(a1.getPrioridad() != a2.getPrioridad()) {
                return a1.getPrioridad() - a2.getPrioridad() * -1;
            }
            //Sino por importe descendente
            else {
                if(a1.getImporte() - a2.getImporte() > 0) {
                    return -1;//Para que vaya antes a1(descendente)
                }
                else {
                    return 1; //Si a1 no etiene un precio más alto, ordeno a2 primero, ya que o bien a2 tiene un precio más alto o bien son iguales, por lo que me da igual colocar a a2 primero.
                }
            }
        });
        System.out.println("ORDENADO POR PRIORIDAD DESC Y EN CASO DE EMPATE POR PRECIO DESC");
        System.out.println(pedidos);
    }
    
}
