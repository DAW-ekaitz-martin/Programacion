import java.util.Scanner;

public class E9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor del primer número: ");
        int a = scanner.nextInt();

        System.out.print("Ingrese el valor del segundo número: ");
        int b = scanner.nextInt();

        boolean resultado = a == b ? true : false;

        System.out.print(resultado);

        scanner.close();
    }
}
