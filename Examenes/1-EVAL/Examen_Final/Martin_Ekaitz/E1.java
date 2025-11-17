import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PI = Math.PI;

        System.out.print("Ingrese el valor del error: ");
        double error_user = scanner.nextDouble();

        double suma = 1;
        double i = 3;
        boolean signo = false;

        double error_pi = 0;
        do { 
            if (signo == false) {
                suma -= 1/i;
                signo = true;
            }
            else {
                suma += 1/i;
                signo = false;
            }
            error_pi = Math.abs(PI - (suma * 4)) / PI;
            i += 2;
            System.out.println("ERROR_PI=> " + error_pi);
        } while (error_pi >= error_user);

        System.out.println("Resultado de la suma: " + 4*suma);
        scanner.close();
    }
}
