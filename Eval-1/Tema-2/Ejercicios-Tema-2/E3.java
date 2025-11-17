import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese un segundo número: ");
        int num2 = scanner.nextInt();

        if (num1 % num2 != 0) {
            System.out.println("El numero " + num1 + " NO es múltiplo de " + num2);
        }
        else {
            System.out.println("El numero " + num1 + " SÍ es múltiplo de " + num2);
        }

        scanner.close();
    }
}
