import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println(fibonacci(i));
        }
        scanner.close();
    }
    public static int fibonacci(int num) {
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}

