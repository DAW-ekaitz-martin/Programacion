import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double PI = 3.14;

        System.out.print("Ingrese el valor del angulo (en grados): ");
        int grados = scanner.nextInt();

        double radianes = grados * (PI / 180);

        System.out.println(grados + " grados equivale a " + radianes + "radianes");

        scanner.close();
    }
}
