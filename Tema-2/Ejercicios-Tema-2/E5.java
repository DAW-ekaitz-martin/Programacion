import java.util.Scanner;
public class E5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese un segundo número: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.print(num1 + ", " + num2);
        }
        else {
            System.out.print(num2 + ", " + num1);
        }
        scanner.close();
    }
}
