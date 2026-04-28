import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class E17 {
    public static void main(String[] args) {
        ArrayList<Integer> notas = new ArrayList<>();
        Map<Integer, Integer> recuentoNotas = new HashMap<>();
        notas.add(7);
        notas.add(8);
        notas.add(9);
        notas.add(2);
        notas.add(7);
        notas.add(5);
        notas.add(9);
        notas.add(7);
        notas.add(2);
        notas.add(3);
        notas.add(5);
        notas.add(5);
        notas.add(7);
        for(int i = 0; i <= notas.size()-1; i++) {
            if(!recuentoNotas.containsKey(notas.get(i))) {
                recuentoNotas.put(notas.get(i), 1);
            }
            else {
                recuentoNotas.put(notas.get(i), recuentoNotas.get(notas.get(i)) + 1);
            }
        }
        System.out.println("DESORDENADO");
        System.out.println(recuentoNotas);
        ArrayList<Integer> notasOrdenadas = new ArrayList<>();
        for(Map.Entry<Integer, Integer> en : recuentoNotas.entrySet()) {
            notasOrdenadas.add(en.getKey());
        }
        Collections.sort(notasOrdenadas, (n1, n2) -> {
            return n1 - n2;
        });
        for(int i = 0; i < notasOrdenadas.size(); i++) {
            System.out.println("La nota " + notasOrdenadas.get(i) + " aparece " + recuentoNotas.get(notasOrdenadas.get(i)) + " veces");
        }
    }
}
