import java.util.Scanner;

public class E12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("PUNTO A");

        System.out.print("Ingrese el valor de x: ");
        int x1 = scanner.nextInt();
        System.out.print("Ingrese el valor de y: ");
        int y1 = scanner.nextInt();

        System.out.print("PUNTO B");

        System.out.print("Ingrese el valor de x: ");
        int x2 = scanner.nextInt();
        System.out.print("Ingrese el valor de y: ");
        int y2 = scanner.nextInt();

        System.out.print("PUNTO C");

        System.out.print("Ingrese el valor de x: ");
        int x3 = scanner.nextInt();
        System.out.print("Ingrese el valor de y: ");
        int y3 = scanner.nextInt();

        double ab = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
        double bc = Math.sqrt(Math.pow((x3-x2), 2) + Math.pow((y3-y2), 2));
        double ac = Math.sqrt(Math.pow((x3-x1), 2) + Math.pow((y3-y1), 2));

        double a;
        double b;
        double c;
        if (ab > bc && ab > ac) {
            a = ab;
            b = bc;
            c = ac;
        }
        else if (bc > ab && bc > ac) {
            a = bc;
            b = ab;
            c = ac;
        }
        else {
            a = ac;
            b = bc;
            c = ab;
        }

        if (a >= b + c) {
            System.out.println("No es un triángulo");
        }
        else {
            if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) {
                System.out.println("Es un triángulo rectangulo");
            }
            else if (Math.pow(a, 2) > Math.pow(b, 2) + Math.pow(c, 2)) {
                System.out.println("Es un triángulo obtusángulo");
            }
            else if (Math.pow(a, 2) < Math.pow(b, 2) + Math.pow(c, 2)) {
                System.out.println("Es un triángulo acutángulo");
            }
        }
        scanner.close();
    }
}
