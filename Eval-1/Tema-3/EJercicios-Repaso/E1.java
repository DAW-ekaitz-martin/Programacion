import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int num = scanner.nextInt();

        int numero = num;
        int aux = 0;
        int digit = 0;

        while (num > 0) {
            digit = num % 10;
            aux = aux * 10 + digit;
            num /= 10;
        }
        if (numero == aux) {
            System.out.println("Es capicúa");
        }
        else {
            System.out.println("No es capicúa");
        }
        scanner.close();
    }
}
