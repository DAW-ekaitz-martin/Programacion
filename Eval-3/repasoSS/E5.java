
import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        int conejos = 4;
        int meses = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la capacidad de la granja: ");
        int capacidad = scanner.nextInt();
        
        scanner.close();
        System.out.println("La granja tardará " + meses + " en exceder su capacidad");
    }
}
