
import java.util.Scanner;

public class E9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escribe el año: ");
        int x = scanner.nextInt();

        int a = x % 19;
        int b = x % 4;
        int c = x % 7;
        int d = (19 * a + 24) % 30;
        int e = (2 * b + 4 * c + 6 * d + 5) % 7;
        int pascua = 22 + d + e;
        System.out.println(pascua);
        if (pascua > 31) {
            pascua = pascua - 31;
            System.out.print("El día de pascua del año " + x + " es " + pascua + " de abril");
        }
        else {
            System.out.print("El día de pascua del año " + x + " es " + pascua + " de marzo");
        }
        scanner.close();

    }
}
