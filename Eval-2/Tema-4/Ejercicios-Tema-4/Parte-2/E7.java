import java.util.Scanner;
public class E7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un año: ");
        int anio = scanner.nextInt();

        boolean bisiesto = bisiesto(anio);
        if (bisiesto) {
            System.out.print("El año es bisiesto");
        }
        else {
            System.out.print("El año NO es bisiesto");
        }
        scanner.close();
    }
    public static boolean bisiesto(int anio) {
        boolean bisiesto = false;
        if (anio % 4 == 0) {
            bisiesto = true;
            if (anio % 100 == 0) {
                bisiesto = false;
                if (anio % 400 == 0) {
                    bisiesto = true;
                }
            }
        }
        return bisiesto;
    }

}
