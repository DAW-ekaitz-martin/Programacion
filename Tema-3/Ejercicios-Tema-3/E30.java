import java.util.Scanner;

public class E30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        double num = scanner.nextDouble();
        double x = num;
        double aux = num;
        while (true) {
            x =  ((double) 1/2)*(x + (num / x));
            if (aux - x < 0.000001) {
                System.out.println("La raíz cuadrada es de: " + x);
                break;
            }
            aux = x;
        }
    }
}

