import java.util.Scanner;

public class E10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número de tres cifras: ");
        int num = scanner.nextInt();

        System.out.println("El numero inicial es: " + num);

        int a = num % 10;
        num = num / 10;
        int b = num % 10;
        num = num / 10;
        a = a * 10 + b;
        a = a * 10 + num;

        System.out.println("El numero invertido es: " + a);

        scanner.close();

    }
}
