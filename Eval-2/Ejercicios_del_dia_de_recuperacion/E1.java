import java.util.Scanner;
public class E1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserta un número: ");
        int x = scanner.nextInt();
        int a = 245778;
        int resultado = insertar_numero(a, x);
        System.out.println("El resultado es: " + resultado);
        scanner.close();
    }
    public static int insertar_numero(int a, int x) {
        if (x > a % 10)
            return a * 10 + x;
        return insertar_numero(a / 10, x) * 10 + a%10 ;
    }
}
