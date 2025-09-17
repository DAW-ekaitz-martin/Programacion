import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número decimal: ");
        double num = scanner.nextDouble();

        int entero = (int) num;
        double decimal = num - entero;

        System.out.println("La parte entera del numero es: " + entero + " y la decimal es : " + decimal);

        scanner.close();
    }
}
