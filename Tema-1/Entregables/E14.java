import java.util.Scanner;

public class E14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca su edad: ");
        int num = scanner.nextInt();

        String resultado = num >= 18 ? "Eres mayor de edad" : "Eres menor de edad";

        System.out.println(resultado);

        scanner.close();
    }
}
