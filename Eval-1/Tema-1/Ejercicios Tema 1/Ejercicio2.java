import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.print("Ingrese un numero: ");

        Scanner scanner = new Scanner(System.in);
        int numero_1 = scanner.nextInt();

        System.out.print("Ingrese un segundo: ");
        int numero_2 = scanner.nextInt();

        int suma = numero_1 + numero_2;
        int resta = numero_1 - numero_2;
        int multi = numero_1 * numero_2;
        double division = (double) numero_1 / numero_2;

        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicación es: " + multi);
        System.out.println("El resultado de la division es: " + division);


        scanner.close();
    }
}
