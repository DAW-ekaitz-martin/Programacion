import java.util.Scanner;
public class E13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números a ingresar: ");
        int cantidad = scanner.nextInt();

        int suma = 0;

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese un número: ");
            int num = scanner.nextInt();
            suma += num ;
        }
        double media = (double)suma / (double)cantidad;
        System.out.println("La media aritmética es de: " + media);
    }
}
