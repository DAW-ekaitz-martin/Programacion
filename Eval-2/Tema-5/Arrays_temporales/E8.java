import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca el valor objetivo: ");
        int objetivo = scanner.nextInt();
        int[] n = {1, 2, 3, 4, 5, 6, 7};
        int posición = encontrar_objetivo(n.clone(), objetivo);

    }
    public static int encontrar_objetivo(int [] n, int objetivo) {
        int longitud = n.length;
        int i = 0;
        while (i < longitud/2) {
            for (int j = longitud/2; j > 1;)
            if (n[longitud/2] == objetivo)
                return longitud/2;
            else if (objetivo > n[longitud/2])
                i = longitud / 2;
            longitud /= 2;
        }
        
    }
}
