import java.util.HashMap;
import java.util.Map;

public class E8 {
    public static void main(String[] args) {
        Map<Integer, String> nombres = new HashMap<>();
        nombres.put(1, "Ekaitz");
        nombres.put(2, "Mateo");
        nombres.put(3, "Gaizka");
        nombres.put(4, "Brandon");
        nombres.put(5, "Walid");
        for(Map.Entry<Integer,String> entrada: nombres.entrySet()) {
            System.out.println(entrada.getKey() + " | " + entrada.getValue());
        }
    }
}
