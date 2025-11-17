import java.util.Scanner;
public class E1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de x: ");
        double x = scanner.nextInt();
        System.out.print("Ingrese el valor de a: ");
        double a = scanner.nextInt();
        System.out.print("Ingrese el valor de b: ");
        double b = scanner.nextInt();
        System.out.print("Ingrese el valor de c: ");
        double c = scanner.nextInt();
        System.out.print("Ingrese el valor de d: ");
        double d = scanner.nextInt();

        double resultado = polinomio_3(x, a, b, c, d);
        System.out.println("El resultado de la función es: " + resultado);
        scanner.close();

    }
    public static double polinomio_3(double x, double a, double b, double c, double d) {
            double p = a * Math.pow(x,3) + b * Math.pow(x,2) + c * x + d;

            return p;
        }
}
