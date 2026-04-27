
import java.util.HashMap;
import java.util.Map;

public class E6 {
    public static void main(String[] args) {
        Map<String, Double> alumnos = new HashMap<>();
        alumnos.put("Ekaitz", 10.0);
        alumnos.put("Gaizka", 7.75);
        alumnos.put("Mateo",8.5);
        alumnos.put("Brandon", 9.3);
        alumnos.put("Walid",9.7);
        for(Map.Entry<String,Double> entrada: alumnos.entrySet()) {
            System.out.println("-" + entrada.getKey()+ ":"+ entrada.getValue());
            System.out.println("El orden en el que aparecen en consola es diferente debido al algoritmo que usa java para buscar en base a la clave de manera más eficiente");
        }
    }
}
