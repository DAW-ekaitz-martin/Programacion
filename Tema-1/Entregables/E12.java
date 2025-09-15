import java.util.Scanner;
public class E12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca en precio del producto: ");
        int precio = scanner.nextInt();

        System.out.print("Introduzca el importe pagado: ");
        int importe = scanner.nextInt();

        int cambio = importe - precio;

        int billete_50 = cambio >= 50 ? 1 : 0;

        cambio = cambio - 50;

        int billete_20 = cambio >= 20 ? 1 : 0;
        cambio = cambio - 20;

        int billete_10 = cambio >= 10 ? 1 : 0;
        cambio = cambio - 10;

        int billete_5 = cambio >= 5 ? 1 : 0;
        cambio = cambio - 5;

        int moneda_2 = cambio >= 2 ? 1 : 0;
        cambio = cambio - 2;

        int moneda_1 = cambio >= 1 ? 1 : 0;
        cambio = cambio - 1;

        System.out.println("Cambio: " + billete_50 + " billete de 50 euros, " + billete_20 + " billete de 20 euros, " + billete_10 + " billete de 10 euros, " + billete_5 + " billete de 5 euros, " + moneda_2 + " moneda de 2 euros, " + moneda_1 + " moneda de 1 euros" );
    }
}
