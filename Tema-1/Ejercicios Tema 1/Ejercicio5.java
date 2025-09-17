import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.14;
        System.out.print("Ingrese el valor del radio: ");
        double radio = scanner.nextDouble();

        double area = PI * (radio * radio);
        double longitud = (2 * PI) * radio;

        System.out.println("El area del circulo es: " + area);
        System.out.println("La longitud de la circunferencia es: " + longitud);

        scanner.close();
    }
    
}
