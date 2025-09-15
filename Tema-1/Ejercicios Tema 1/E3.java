import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int num_1 = scanner.nextInt();

        System.out.print("Introduce un numero: ");
        int num_2 = scanner.nextInt();
        
        int area = num_1 * num_2;
        int perimetro = 2 * (num_1 * num_2);

        System.out.println("El área del rectangulo es : " + area);
        System.out.println("El perímetro del rectangulo es: " + perimetro);
    }
}
