import java.util.Scanner;

public class E11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número de tres cifras: ");
        int num = scanner.nextInt();
        int num_inical = num;

        int a = num % 10;
        num = num / 10;
        int b = num % 10;
        num = num / 10;
        a = a * 10 + b;
        a = a * 10 + num;

        String resultado = num_inical == a ? "El número " + num_inical + " es capicúa" : "El número " + num_inical + " no es capicúa";

        System.out.println(resultado);

        scanner.close();

    }
}
