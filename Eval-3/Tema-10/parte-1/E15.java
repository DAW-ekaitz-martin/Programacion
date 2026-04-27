import java.util.ArrayList;
import java.util.Collections;

public class E15 {
    public static void main(String[] args) {
        Producto movil = new Producto("Iphone", 19, 1299.83);
        Producto planta = new Producto("Petunia", 20, 10);
        Producto tv = new Producto("LG Oled", 20, 840.3);
        Producto batidora = new Producto("Batidora Philips", 1, 74.75);
        Producto gafas = new Producto("Gafas de sol Hawkers", 3, 7.25);
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(movil);
        productos.add(planta);
        productos.add(tv);
        productos.add(batidora);
        productos.add(gafas);
        //Buscar duplicados
        for(int i = 0; i <= productos.size()-1; i++) {
            for(int j = i + 1; j <= productos.size()-1; j++) {
                if(productos.get(i).getCodigo() == productos.get(j).getCodigo()) {
                    if(productos.get(i).getPrecio() -  productos.get(j).getPrecio() > 0) {
                        productos.remove(j);
                    }
                    else {
                        productos.remove(i);
                    }
                }
            }
        }
        System.out.println("ANTES DE ORDENAR");
        System.out.println(productos);
        //Por Codigo
        Collections.sort(productos, (a1, a2) -> {
            return a1.compareTo(a2);
        });
        System.out.println("ORDENADO POR CODIGO");
        System.out.println(productos);
    }
    
}
