import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double MERCURIO = 0.38;
        final double VENUS = 0.91;
        final double TIERRA = 1.00;
        final double MARTE = 0.38;
        final double JUPITER = 2.53;
        final double SATURNO = 1.06;
        final double URANO = 0.92;
        final double NEPTUNO = 1.20;
        final double PLUTON = 0.57;

        System.out.print("Introduce tu peso: ");
        double peso = scanner.nextDouble();


        System.out.println("Su peso en Mercurio es de: " + peso * MERCURIO + "Kg");
        System.out.println("Su peso en Venus es de: " + peso * VENUS + "Kg");
        System.out.println("Su peso en Tierra es de: " + peso * TIERRA + "Kg");
        System.out.println("Su peso en Marte es de: " + peso * MARTE + "Kg");
        System.out.println("Su peso en Júpiter es de: " + peso * JUPITER + "Kg");
        System.out.println("Su peso en Saturno es de: " + peso * SATURNO + "Kg");
        System.out.println("Su peso en Urano es de: " + peso * URANO + "Kg");
        System.out.println("Su peso en Neptuno es de: " + peso * NEPTUNO + "Kg");
        System.out.println("Su peso en Plutón es de: " + peso * PLUTON + "Kg");
        
        scanner.close();
    }
}
