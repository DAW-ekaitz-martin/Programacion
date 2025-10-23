import java.util.Scanner;

public class E16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int num = scanner.nextInt();

        int resultado = num < 0 ? num * -1 : num;

        System.out.println("El valor absoluto de " + num +  " es: " + resultado);

        scanner.close();

    }
}
