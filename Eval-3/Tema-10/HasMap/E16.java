
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class E16 {
    public static void main(String[] args) {
        Map<String, ArrayList<Producto>> productos = new HashMap<>();
        ArrayList<Producto> tecno = new ArrayList<>();
        ArrayList<Producto> bota = new ArrayList<>();
        ArrayList<Producto> hogar = new ArrayList<>();

        Producto p1 = new Producto("TV", "Tecnología");
        Producto p2 = new Producto("Planta", "Botánica");
        Producto p3 = new Producto("Movil", "Tecnología");
        Producto p4 = new Producto("Batidora", "Hogar");
        Producto p5 = new Producto("Tablet", "Tecnología");
        Producto p6 = new Producto("Rumba", "Hogar");
        Producto p7 = new Producto("Lavadora", "Hogar");
        Producto p8 = new Producto("Maceta", "Botánica");
        Producto p9 = new Producto("Árbol", "Botánica");

        hogar.add(p4);
        hogar.add(p6);
        hogar.add(p7);

        tecno.add(p1);
        tecno.add(p5);
        tecno.add(p3);

        bota.add(p2);
        bota.add(p8);
        bota.add(p9);
        Collections.sort(tecno, (pro1, pro2) -> {
            return pro1.compareTo(pro2);
        });
        Collections.sort(bota, (pro1, pro2) -> {
            return pro1.compareTo(pro2);
        });
        Collections.sort(hogar, (pro1, pro2) -> {
            return pro1.compareTo(pro2);
        });

        productos.put("Tecnología", tecno);
        productos.put("Hogar", hogar);
        productos.put("Botánica", bota);
        
        System.out.println(productos);
        
    }
}
