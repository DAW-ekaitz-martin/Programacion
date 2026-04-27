
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class E12 {
    public static void main(String[] args) {
        Map<String, Double> clientes = new HashMap<>();
        ArrayList<Double> saldos = new ArrayList<>();
        clientes.put("Ekaitz", 3004.4);
        clientes.put("Mateo", 2004.4);
        clientes.put("Walid", 1004.4);
        clientes.put("Brandon", 4504.4);
        for(Map.Entry<String, Double> entrada : clientes.entrySet()) {
            saldos.add(entrada.getValue());
        }
        
        System.out.println("ANTES DE ORDENAR");
        System.out.println(saldos);
        Collections.sort(saldos, (c1, c2) -> {
            if((double)c1 - (double)c2 > 0) {
                return -1;
            }
            else {
                return 1;
            }
        });
        System.out.println("ORDENADO");
        System.out.println(saldos);
    }
}
