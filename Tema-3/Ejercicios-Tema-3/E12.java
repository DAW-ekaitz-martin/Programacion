import java.util.Scanner;

public class E12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int num = scanner.nextInt();

        int suma = 0;

        while (num > 10) {
            int digit = num % 10;
            suma += digit;
            num /= 10;
        }
        suma += num;
        System.out.println("El valor de la suma es: " + suma);
    }
}
