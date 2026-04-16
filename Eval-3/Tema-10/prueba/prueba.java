
import java.util.ArrayList;

public class prueba {
    public static void main(String[] args) {
        //E1
        ArrayList<String> companieros = new ArrayList<>();
        companieros.add("Mateo");
        companieros.add("Brandon");
        companieros.add("Gaizka");
        companieros.add("Diego");
        companieros.add("Walid");
        for(String companiero : companieros) {
            System.out.println(companiero
            );
        }

        // E2
        ArrayList<Integer> numeros = new ArrayList<>();
        int longitud = (int)(Math.random() * 11) + 10;
        int suma = 0;
        for(int i = 0; i < longitud; i++) {
            int numero = (int)(Math.random() * 100);
            suma += numero;
            numeros.add(numero);
        }
        int maximo = numeros.get(0);
        int minimo = numeros.get(0);
        for(int i = 0; i < longitud; i++) {
            if(maximo < numeros.get(i)) {
                maximo = numeros.get(i);
            }
            if(minimo > numeros.get(i)) {
                minimo = numeros.get(i);
            }
        }
        System.out.println(numeros);
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + (double)suma/longitud);
        System.out.println("Maximo: " + maximo);
        System.out.println("Minimo: " + minimo);
        
    }
    
}
