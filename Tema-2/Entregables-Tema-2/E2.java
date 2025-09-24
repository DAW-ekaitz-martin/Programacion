import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la intensidad de corriente (I) del circuito: ");
        int intensidad = scanner.nextInt();

        System.out.print("Ingrese la resistencia de corriente (R) del circuito: ");
        int resistencia = scanner.nextInt();

        int V = intensidad * resistencia;

        if (resistencia < 0) {
            System.out.println("Las resistencias negativas no tienen sentido físico");
        }
        else if (resistencia > 1000 ) {
            System.out.println("No consideramos resistencias mayores a 1000 ohmios");
        }
        else {
            System.out.println("La caída de potencial en el circuito es de: " + V);
        }
        scanner.close();
    }
}
