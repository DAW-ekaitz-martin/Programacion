import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor del lado a: ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese el valor del lado a: ");
        double b = scanner.nextDouble();

        System.out.print("Ingrese el valor del lado a: ");
        double c = scanner.nextDouble();

        double s = (a + b + c) / 2;

        double resultado = Math.sqrt(s * (s-a) * (s-b) * (s-c));

        System.out.println("El área del triangulo es de: " + resultado);

        scanner.close();
    }
}
