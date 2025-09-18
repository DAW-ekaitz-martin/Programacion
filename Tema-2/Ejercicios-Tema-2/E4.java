import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el año a comprobar: ");
        int anio = scanner.nextInt();

        if (anio % 4 == 0) {
            if (anio % 100 == 0 && anio % 400 != 0) {
                System.out.print("El año " + anio + " NO es bisiesto");
                return;
            }
            System.out.print("El año " + anio + " SI es bisiesto");
        }
        else {
            System.out.print("El año " + anio + " NO es bisiesto");
        }
        scanner.close();
    }
}
