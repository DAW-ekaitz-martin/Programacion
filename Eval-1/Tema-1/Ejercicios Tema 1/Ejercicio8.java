import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el valor de z: ");
        int z = scanner.nextInt();

        System.out.print("Introduce el valor de a: ");
        int a = scanner.nextInt();

        System.out.print("Introduce el valor de b: ");
        int b = scanner.nextInt();

        System.out.print("Introduce el valor de c: ");
        int c = scanner.nextInt();

        int resultado = a * (z * z) + b * z + c;

        System.out.println("EL resultado de f(" + z + ") es: " + resultado);

        scanner.close();
    }
}
