import java.util.Scanner;

public class E7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el valor de a: ");
        int a = scanner.nextInt();

        System.out.print("Ingrese el valor de b: ");
        int b = scanner.nextInt();

        System.out.print("Ingrese el valor de c: ");
        int c = scanner.nextInt();

        int discriminante = b*b - (4*a*c);

        double x = (-b +- Math.sqrt(discriminante)) / (2 *a);
        if (discriminante >= 0) {
            double resultado_1 = Math.sqrt(x);
            double resultado_2 = x * x;
            System.out.println("Resultado 1: " + resultado_1 + ", Resultado 2: " + resultado_2);

        }
        else {
            System.out.println("Error");
        }

        scanner.close();
    }
}
