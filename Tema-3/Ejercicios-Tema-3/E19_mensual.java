import java.util.Scanner;

public class E19_mensual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el capital inicial: ");
        double cantidad = scanner.nextInt();

        System.out.print("Ingrese el tipo de interés (%): ");
        double interes = scanner.nextInt();

        int meses = 0;
        int anios = 0;

        //Averiguar la cantidad a la que debemos llegar
        double objetivo = cantidad * 2;
        //Averiguar la interés mensual del dinero(IMPORTANTE PONER QUE LAS VARIABLES SEAN DOUBLE, sino se trunca y la pluvalía es 0)
        double interes_anual = interes / 100;
        double interes_mensual = interes_anual / 12;
        double plusvalia;
        while (cantidad < objetivo) {
            meses ++;
            if (meses > 12) {
                meses = 0;
                anios ++;
            }
            plusvalia = cantidad * interes_mensual;
            cantidad += plusvalia;
            ///System.out.println("DEBUG CANTIDAD=>" + cantidad);
        }
        System.out.println("El tiempo en el que se duplicará el capital inical es: " + anios + " años y " + meses + " meses");
    }
}
