import java.util.Scanner;

public class E19_anual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el capital inicial: ");
        double cantidad = scanner.nextInt();

        System.out.print("Ingrese el tipo de interés (%): ");
        double interes = scanner.nextInt();

        int anios = 0;

        //Averiguar la cantidad a la que debemos llegar
        double objetivo = cantidad * 2;
        //Averiguar la interés anual del dinero(IMPORTANTE PONER QUE LAS VARIABLES SEAN DOUBLE, sino se trunca y la pluvalía es 0)
        double interes_anual = interes / 100;
        double plusvalia;
        while (cantidad < objetivo) {
            anios ++;
            plusvalia = cantidad * interes_anual;
            cantidad += plusvalia;
        }
        System.out.print("El tiempo en el que se duplicará el capital inical es: " + anios + " años");
    }
}
