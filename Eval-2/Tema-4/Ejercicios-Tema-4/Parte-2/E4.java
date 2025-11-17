import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int n1 = scanner.nextInt();
        if (capicua(n1))
        {
            System.out.println("El número es capicúa");
        }
        else {
            System.out.println("El número NO es capicúa");
        }
        
    }
    public static boolean capicua(int n) {
        int resultado = 0;
        int aux = n;
        while (n > 9) {
            int digit = n % 10;
            resultado = resultado * 10 + digit;
            n /= 10;
        }
        resultado = resultado * 10 + n;
        if (resultado == aux) {
            return true;
        }
        return false;
    }
}
