import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            int num = (int)(Math.random()* 100) +1;
            numeros.add(num);
        }
        System.out.println("LISTA DE NUMEROS ANTES DE ORDENARLA: ");
        System.out.println(numeros);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la posición de referencia(0-" + numeros.size() + "): ");
        int k = scanner.nextInt();
        
        Collections.sort(numeros, (n1, n2) -> {
            if(Math.abs(n1 - k) != Math.abs(n2 - k)) {
                return Math.abs(n1 - k) - Math.abs(n2 - k);
            }
            //Si se encuentran a la misma distancia, el función del valor numérico
            else {
                return n1.compareTo(n2);
            }
        });
        System.out.println("LISTA DE NUMEROS DESPUÉS DE ORDENARLA: ");
        System.out.println(numeros);
        System.out.println("El criterio de ordenación es el siguiente: Primero miramos la diferencia entre k y el numero, si son distintas, colocamos primero el numero cuya \ndistancia a k sea menor. EN caso de ser iguales,lo hacemos en base a que numero es menor y lo colocamos antes");
    }
}
