import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de una variable: ");
        int var1 = scanner.nextInt();

        System.out.print("Ingrese el valor de una variable: ");
        int var2 = scanner.nextInt();

        System.out.println("Variable 1: " + var1 + "; Variable 2: " + var2);

        var1 = var1 + var2;
        var2 = var1 - var2;
        var1 = var1 - var2;

        System.out.println("Variable 1: " + var1 + "; Variable 2: " + var2);

    }
}
