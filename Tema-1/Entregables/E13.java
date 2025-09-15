import java.util.Scanner;

public class E13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        int num = scanner.nextInt();

        String resultado = num % 2 == 0 ? "El número " + num + " es par" : "El número " + num + " es impar";

        System.out.println(resultado);

        scanner.close();
    }
}
