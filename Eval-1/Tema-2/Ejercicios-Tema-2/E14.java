import java.util.Scanner;

public class E14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese otro número: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingrese el carácter de la operación que desea realizar('+' , '-', 'x' o '/' ): ");
        String signo = scanner.next();

        int resultado;

        if (signo.equals( "+")) {
            resultado = num1 + num2;
        }
        else if (signo.equals( "-")) {
            resultado = num1 - num2;
        }
        else if (signo.equals( "x")) {
            resultado = num1 * num2;
        }
        else {
            resultado = num1 / num2;
        }

        System.out.println("El resultado es: " + resultado);
        scanner.close();
    }
}
