import java.util.Scanner;

public class E25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int n = scanner.nextInt();

        int resultado = 1;
        // Como coincide que el signo es negativo cuando el numero es par, cada vez que el número(i) sea par lo transformo en negativo.
        for (int i = 2; i <= n; i++) {
            if (i % 2 != 0) {
                resultado += i;
            }
            else {
                resultado += (i * -1);
            }
        }
        System.out.println("El resultado es: " + resultado);
        scanner.close();
    }
}
