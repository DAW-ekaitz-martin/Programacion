import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class E18 {
    public static void main(String[] args) {
        ArrayList<String> palabras = new ArrayList<>();
        Map<Integer, ArrayList<String>> hashpalabras = new HashMap<>();
        ArrayList<String> longitud3 = new ArrayList<>();
        ArrayList<String> longitud4 = new ArrayList<>();
        ArrayList<String> longitud6 = new ArrayList<>();
        ArrayList<String> longitud8 = new ArrayList<>();
        palabras.add("Hola");
        palabras.add("quel");
        palabras.add("aupa");
        palabras.add("hay");
        palabras.add("alli");
        palabras.add("aqui");
        palabras.add("Hola");
        palabras.add("voy");
        palabras.add("lee");
        palabras.add("historia");
        palabras.add("locura");
        for(int i = 0; i < palabras.size(); i++) {
            if(palabras.get(i).length() == 3) {
                longitud3.add(palabras.get(i));
            }
            else if(palabras.get(i).length() == 4) {
                longitud4.add(palabras.get(i));
            }
            else if(palabras.get(i).length() == 6) {
                longitud6.add(palabras.get(i));
            }
            else {
                longitud8.add(palabras.get(i));
            }
        }
        hashpalabras.put(3, longitud3);
        hashpalabras.put(4, longitud4);
        hashpalabras.put(6, longitud6);
        hashpalabras.put(8, longitud8);
        System.out.println("DESORDENADO");
        System.out.println(hashpalabras);
        for(Map.Entry<Integer, ArrayList<String>> en : hashpalabras.entrySet()) {
            Collections.sort(en.getValue(), (p1, p2) -> {
                return p1.compareToIgnoreCase(p2);
            });
        }
        System.out.println("ORDENADO");
        System.out.println(hashpalabras);
    }
}
