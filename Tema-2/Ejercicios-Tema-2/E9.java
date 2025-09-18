import java.util.Scanner;
public class E9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el día: ");
        int dia = scanner.nextInt();

        System.out.print("Ingrese el mes: ");
        int mes = scanner.nextInt();

        System.out.print("Ingrese el anio: ");
        int anio = scanner.nextInt();

        if (dia >= 32 || mes >= 13) {
            System.out.println("Fecha incorrecta");
        }
        else if (dia == 29 && mes == 2) {
            System.out.println("Febrero no tiene 29 días");
        }
        else if (mes % 2 == 0 && mes < 7 && dia == 31) {
            System.out.println("Error, este mes no tiene 31 días");
        }
        else if (mes % 2 != 0 && mes >= 8 && dia == 31) {
            System.out.println("Error, este mes no tiene 31 días");
        }
        else {
            System.out.print("La fecha " + dia + "/" + mes+ "/" + anio + " es correcta");
        }

        scanner.close();
    }
}
