import java.util.Scanner;

public class E17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número(Se calculará sus multiplos del 1 al 100): ");
        int num = scanner.nextInt();
        for (int i = 1; i <= 100; i++) {
            if (i % num == 0) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
