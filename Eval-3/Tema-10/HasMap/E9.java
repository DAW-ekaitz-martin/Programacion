import java.util.HashMap;
import java.util.Map;

public class E9 {
    public static void main(String[] args) {
        Map<String, String> parejas = new HashMap<>();
        parejas.put("Hola", "que tal");
        parejas.put("gh", "que");
        parejas.put("fg", "tal");
        parejas.put("o", "ey");
        parejas.put("es", "er");
        System.out.println("ANTES DE MODIFICAR");
        for(Map.Entry<String,String> entrada: parejas.entrySet()) {
            System.out.println(entrada.getKey() + " | " + entrada.getValue());
        }
        parejas.put("Hola", "adios");
        System.out.println("DESPUÉS DE MODIFICAR");
        for(Map.Entry<String,String> entrada: parejas.entrySet()) {
            System.out.println(entrada.getKey() + " | " + entrada.getValue());
        }
    }
}
