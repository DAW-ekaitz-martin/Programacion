
import java.util.HashMap;
import java.util.Map;

public class E7 {
    public static void main(String[] args) {
        Map<String, Integer> palabras = new HashMap<>();
        palabras.put("hi",2);
        palabras.put("bye",3);
        palabras.put("how",3);
        palabras.put("where",5);

        System.out.println("CLAVES: ");
        for(Map.Entry<String,Integer> entrada: palabras.entrySet()) {
            System.out.println("-" + entrada.getKey());
        }
        System.out.println("VALORES: ");
        for(Map.Entry<String,Integer> entrada: palabras.entrySet()) {
            System.out.println("-" + entrada.getValue());
        }
    }
}
