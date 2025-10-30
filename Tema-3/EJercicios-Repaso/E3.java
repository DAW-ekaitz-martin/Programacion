import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int a = scanner.nextInt();

        System.out.print("Ingrese un número: ");
        int b = scanner.nextInt();
        int divisor;

        if (a < b) {
            divisor = a;
        }
        else {
            divisor = b;
        }
        while (divisor > 0) {
            if (a % divisor == 0 && b % divisor == 0) {
                System.out.println("El máximo común divisor es " + divisor);
                break;
            }
            divisor --;
        }
    }
}
