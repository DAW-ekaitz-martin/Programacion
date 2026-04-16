
import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int n = scanner.nextInt();
        double resultado = suma(n);
        System.out.println("El resultado de la suma es: " + resultado);
        scanner.close();
    }
    public static double suma(int n) {
        if(n == 1) {
            return n;
        }
        return suma(n-1) + (double)1/n;
    }
}
