
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class E13 {
    public static void main(String[] args) {
        Map<String, Integer> jugadores = new HashMap<>();
        ArrayList<Map.Entry<String, Integer>> listJugadores = new ArrayList<>();
        jugadores.put("Ekaitz", 25);
        jugadores.put("Hao", 15);
        jugadores.put("Walid", 5);
        jugadores.put("Gazika", 13);
        jugadores.put("Mateo", 24);
        for(Map.Entry<String, Integer> en : jugadores.entrySet()) {
            listJugadores.add(en);
        }
        
        System.out.println("DESORDENADO");
        System.out.println(listJugadores);
        Collections.sort(listJugadores, (j1, j2) -> {
            return (j1.getValue() - j2.getValue()) *-1;
        });
        System.out.println("ORDENADO");
        System.out.println(listJugadores);
    }
}
