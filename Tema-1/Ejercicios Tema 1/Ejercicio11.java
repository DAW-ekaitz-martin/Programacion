import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int num_1 = scanner.nextInt();

        System.out.print("Ingrese un numero: ");
        int num_2 = scanner.nextInt();

        int cociente = num_1 / num_2;
        int resto = num_1 % num_2;

        System.out.println("Cociente: " + cociente);
        System.out.println("Resto: " + resto);
        
        scanner.close();
    }
}
