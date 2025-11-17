import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int num_1 = scanner.nextInt();
        if (num_1 == 0) {
            System.out.println("El cero es un número neutro");
        }
        else if (num_1 < 0) {
            System.out.println("El número ingresado es negativo");
        }
        else {
            System.out.println("El número ingresado es positivo");
        }
        scanner.close();
    }
}
