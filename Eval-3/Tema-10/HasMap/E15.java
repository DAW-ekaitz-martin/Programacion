
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class E15 {
    public static void main(String[] args) {
        Map<String, Double> productos = new HashMap<>();
        ArrayList<Map.Entry<String, Double>> listProductos = new ArrayList<>();
        productos.put("Camiseta", 7.6);
        productos.put("TV", 4.3);
        productos.put("Jeans", 29.9);
        productos.put("Movil", 12.1);
        for(Map.Entry<String, Double> en : productos.entrySet()) {
            listProductos.add(en);
        }
        System.out.println("DESORDENADO");
        System.out.println(listProductos);
        Collections.sort(listProductos, (p1, p2) -> {
            if(p1.getValue() - p2.getValue() > 0) {
                return -1;
            }
            else {
                return 1;
            }
        });
        System.out.println("ORDENADO");
        System.out.println(listProductos);
    }
}
