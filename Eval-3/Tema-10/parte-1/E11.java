import java.util.ArrayList;
import java.util.Collections;

public class E11 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        for(int i = 0; i <= 25; i ++) {
            numeros.add(i);
        }
        System.out.println("ANTES DE ORDENAR");
        System.out.println(numeros);
        Collections.sort(numeros, (n1, n2) -> {
            if (calcularDivisores((int)n1) != calcularDivisores((int)n2)) {
                return calcularDivisores((int)n1) - calcularDivisores((int)n2);
            }
            else {
                return n1.compareTo(n2) * -1;
            }
        });

        System.out.println("DESPUÉS DE ORDENAR");
        System.out.println(numeros);
    }
    public static int calcularDivisores(int numero)  {
        int contDivisores = 0;
        for(int i = 1; i <= numero; i++) {
            if(numero%i==0) {
                contDivisores ++;
            }
        }
        return contDivisores;
    }
}
