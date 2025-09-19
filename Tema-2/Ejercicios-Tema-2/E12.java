import java.util.Scanner;

public class E12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Ingrese el valor de a: ");
        int a = scanner.nextInt();

        System.out.print("Ingrese el valor de b: ");
        int b = scanner.nextInt();

        System.out.print("Ingrese el valor de c: ");
        int c = scanner.nextInt();

        System.out.print("Ingrese el valor de d: ");
        int d = scanner.nextInt();

        System.out.print("Ingrese el valor de e: ");
        int e = scanner.nextInt();

        System.out.print("Ingrese el valor de f: ");
        int f = scanner.nextInt();

        double x = (c * e - b * f) / (a * e - b * d);
        int y = (a * f - c * d) / (a * e - b * d);

        if (a / d == b /e && b/e == c/f) {
            System.out.println("Las rectas son coincidentes(infinitas soluciones");
        }

        else if(a/d == b/e  && b / e != c/f) {
            System.out.println("Las rectas son paralelas, no tiene solución");
        }
        else {
            if (a / d != b / e) {
                System.out.println("Solo existe una solución: X = " + x + ", Y = " + y);
            }
        }
        scanner.close();
    }
}
