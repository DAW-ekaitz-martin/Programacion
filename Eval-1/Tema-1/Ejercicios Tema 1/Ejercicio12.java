import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        double num = scanner.nextDouble();

        int last_pos = (int)num % 10;

        System.out.println("La última cifra del número ingrsado es: " + last_pos);

        scanner.close();
    }
}
