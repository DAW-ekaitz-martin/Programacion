
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class E11 {
    public static void main(String[] args) {
        Map<String, Integer> productos = new HashMap<>();
        ArrayList<String> clavesProductos = new ArrayList<>();
        productos.put("Camiseta", 7);
        productos.put("TV", 4);
        productos.put("Jeans", 29);
        productos.put("Movil", 12);
        for(Map.Entry<String, Integer> entrada : productos.entrySet()) {
            clavesProductos.add(entrada.getKey());
        }
        Collections.sort(clavesProductos, (c1,c2) -> {
            return c1.compareTo(c2);
        });
        for(int i = 0; i <= clavesProductos.size()-1; i++) {
            System.out.println(clavesProductos.get(i) + " | "+ productos.get(clavesProductos.get(i)));
        }
    }
}
