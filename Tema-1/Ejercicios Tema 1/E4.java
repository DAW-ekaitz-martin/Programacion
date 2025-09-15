import java.util.Scanner;
public class E4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la base del triangulo: ");
        int base = scanner.nextInt();

        System.out.print("Introduce la altura del triangulo: ");
        int altura = scanner.nextInt();

        double area = (double) (base * altura ) / 2;

        System.out.println("El area del triangulo es : " + area);

        scanner.close();
    }
}
