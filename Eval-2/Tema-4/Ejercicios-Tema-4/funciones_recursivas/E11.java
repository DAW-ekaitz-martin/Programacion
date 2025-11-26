import java.util.Scanner;

public class E11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int n = scanner.nextInt();
        double resultado = calculo(n);
        System.out.println("El resultado es " + resultado);
        scanner.close();
    }
    public static double calculo(int n) {
        if (n == 1) {
            return 1;
        }
        return 1.0/n + calculo(n-1);
    }
}
