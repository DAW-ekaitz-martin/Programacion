import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int num = scanner.nextInt();

        if (par(num)) {
            System.out.println("Es par");
        }
        else {
            System.out.println("Es impar");
        }
        scanner.close();
    }
    public static boolean par(int num) {
        if (num == 0) {
            return true;
        }
        return impar(num - 1);
    }
    public static boolean impar(int num) {
        if (num == 0) {
            return false;
        }
        return par(num - 1);
    }
}
