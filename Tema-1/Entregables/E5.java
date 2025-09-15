import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nota del primer trimestre: ");
        int t1 = scanner.nextInt();

        System.out.print("Ingrese su nota del segundo trimestre: ");
        int t2 = scanner.nextInt();

        System.out.print("Ingrese su nota del tercer trimestre: ");
        int t3 = scanner.nextInt();

        int media = (t1 + t2 + t3) / 3;

        System.out.println("La media aritmética del curso en la asignatura es de: " + media);

        scanner.close();
    }
}
