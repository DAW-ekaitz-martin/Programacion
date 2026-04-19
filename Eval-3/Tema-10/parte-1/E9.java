
import java.util.ArrayList;
import java.util.Collections;

public class E9 {
    public static void main(String[] args) {
        ArrayList<String> cadenas = new ArrayList<>();
        char letra = 'E';
        for(int i = 0; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                cadenas.add(letra + "-"+j);
            }
            letra --;
        }
        System.out.println("ANTES DE ORDENARLO");
        System.out.println(cadenas);
        Collections.sort(cadenas, (c1, c2) -> {
            //Almaceno la letra
            char letraC1 = c1.charAt(0);
            char letraC2 = c2.charAt(0);
            //Si son distintas las ordeno
            if(letraC1 != letraC2) {
                return letraC1 - letraC2;
            }
            //Si no quito la letra y el guión y lo ordeno en cuanto al número
            else {
                //Creo dos variables auxiliares para poder modificarlas y quitar lo que no me interesa
                String aux1 = c1;
                String aux2 = c1;
                aux1.replace(String.valueOf(letraC1), "");
                aux1.replace("-", "");
                aux2.replace(String.valueOf(letraC2), "");
                aux2.replace("-", "");
                //Si c1 es más grande, lo devuelvo primero
                if (aux1.compareTo(aux2) > 0) {
                    return c2.compareTo(c1);
                    //return c1.compareTo(c2);
                }
                //Sino lo devuelvo al reves(primero c2), al hacer la compareación al reves ya lo devuelve de forma descente
                else {
                    return c1.compareTo(c2);
                    //return c2.compareTo(c1);
                }
                //[A-5, A-4, A-3, A-2, A-1, B-5, B-4, B-3, B-2, B-1, C-5, C-4, C-3, C-2, C-1,
                //  D-5, D-4, D-3, D-2, D-1, E-5, E-4, E-3, E-2, E-1]
            }
        });
        System.out.println("DESPUÉS DE ORDENARLO");
        System.out.println(cadenas);
    }
}
