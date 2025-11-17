import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de a: ");
        int a = scanner.nextInt();

        System.out.print("Ingrese el valor de b: ");
        int b = scanner.nextInt();

        System.out.print("Ingrese un número: ");
        int num_1 = scanner.nextInt();

        if (num_1 >= a && num_1 <= b) {
            System.out.println("El " + num_1 + " está dentro del intervalo de " + a + " y " + b);

        }
        else {
            System.out.println("El " + num_1 + " NO está dentro del intervalo de " + a + " y " + b);
        }
        scanner.close();
    }
}
