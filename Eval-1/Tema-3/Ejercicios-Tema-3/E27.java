import java.util.Scanner;

public class E27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = (int)(1 + Math.random() * 100);
        int num_user = 0;
        for (int i = 0; i < 7; i ++) {
            System.out.print("Introduce un número: ");
            num_user = scanner.nextInt();
            if (num_user == num) {
                System.out.println("El número introducido es el correcto.");
                break;
            }
            else if (num_user > num) {
                System.out.println("El número introducido es mayor que el número a adivinar.");
            }
            else {
                System.out.println("El número introducido es menor que el número a adivinar.");
            }
        }
        scanner.close();
    }
}
