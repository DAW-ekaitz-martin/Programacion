
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class E14 {
    public static void main(String[] args) {
        final int NUMERO_MAX_FALTAS = 15;
        Map<String, Integer> alumnos = new HashMap<>();
        ArrayList<String> listAlumnos = new ArrayList<>();
        ArrayList<Map.Entry<String, Integer>> listOrdenar = new ArrayList<>();
        alumnos.put("Ekaitz", 25);
        alumnos.put("Hao", 15);
        alumnos.put("Walid", 5);
        alumnos.put("Gaizka", 13);
        alumnos.put("Mateo", 24);
        for(Map.Entry<String, Integer> en : alumnos.entrySet()) {
            if(en.getValue() > NUMERO_MAX_FALTAS) {
                listAlumnos.add(en.getKey());
            }
        }
        //Como no puedo modificar el HashMap mientras lo estoy recorriendo, voy a añadir las claves del HAshMap que quiero eliminar a un ArrayList auxiliar, para despues RECORRIENDO ESE ArrayList con las claves que quiero eliminar, las elimino del HashMap(ahora si puedo porque no lo estoy recorriendo)
        for(int i = 0; i <= listAlumnos.size()-1; i++) {
            alumnos.remove(listAlumnos.get(i));
        }
        for(Map.Entry<String, Integer> en : alumnos.entrySet()) {
            listOrdenar.add(en);
        }
        System.out.println("DESORDENADO");
        System.out.println(listOrdenar);
        Collections.sort(listOrdenar, (a1, a2) -> {
            return a1.getKey().compareTo(a2.getKey());
        });
        System.out.println("ORDENADO");
        System.out.println(listOrdenar);
    }
}
