import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double IVA = 0.21;

        System.out.print("Ingrese el precio final del producto: ");
        double total = scanner.nextDouble();
        
        double impuestos = total * IVA;

        System.out.println("El suplemento cobrado por IVA es de : " + impuestos + " euros");

        scanner.close();
    }
}
