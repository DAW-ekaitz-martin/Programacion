
import java.util.ArrayList;
import java.util.Collections;

public class E4 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList();
        for(int i = 0; i < 50; i++) {
            int numero = (int)(Math.random() * 100) + 1;
            numeros.add(numero);
        }
        System.out.println(numeros);
        //Ordenarlo de manera descendente
        Collections.sort(numeros, Collections.reverseOrder());
        System.out.println(numeros);
        System.out.println("LOS 10 NUMEROS MÁS GRANDES");
        for(int i = 0; i < 10; i++) {
            System.out.println((int)numeros.get(i));
        }
        for(int i = 0; i <= numeros.size()-1; i++) {
            for(int j = i + 1; j <= numeros.size()-1; j++) {
                if(numeros.get(i).equals(numeros.get(j))) {
                    numeros.remove(j);
                }
            }
        }
        System.out.println("LOS 10 NUMEROS MÁS GRANDES SIN REPETIDOS");
        for(int i = 0; i < 10; i++) {
            int num = numeros.get(i);
            System.out.println(num);
        }
    }
}
