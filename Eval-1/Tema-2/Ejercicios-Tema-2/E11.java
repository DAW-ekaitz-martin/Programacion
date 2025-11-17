import java.util.Scanner;

public class E11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el día: ");
        int dia = scanner.nextInt();

        System.out.print("Ingrese el mes: ");
        int mes = scanner.nextInt();
        
        System.out.print("Ingrese el año: ");
        int anio = scanner.nextInt();

        dia += 1;

        if (dia >= 32 || mes >= 13) {
            System.out.println("Fecha incorrecta");
        }
        if (anio % 4 == 0) {
            if (!(anio % 100 == 0 && anio % 400 != 0)) {
                System.out.println("ES BISIESTO");
                if (mes == 2 && dia > 29) {
                    mes += 1;
                    dia = 1;
                }
                else if ((mes % 2 == 0 && mes < 7 && dia > 30) || (mes % 2 != 0 && mes < 7 && dia > 31)) {
                    mes += 1;
                    dia = 1;
                }
                else if ((mes % 2 != 0 && mes >= 8 && dia == 30) || (mes % 2 == 0 && mes >= 7 && dia > 31)) {
                    mes += 1;
                    dia = 1;
                }
            }
        }
        else {
            if (mes == 2 && dia > 28) {
                mes += 1;
                dia = 1;
            }
            else if ((mes % 2 == 0 && mes < 7 && dia > 30) || (mes % 2 != 0 && mes < 7 && dia > 31)) {
                mes += 1;
                dia = 1;
            }
            else if ((mes % 2 != 0 && mes >= 8 && dia == 30) || (mes % 2 == 0 && mes >= 7 && dia > 31)) {
                mes += 1;
                dia = 1;
            }
        }
        if (mes > 12) {
            anio += 1;
            mes = 1;
            dia = 1;
        }
        System.out.println("Fecha actual: " + anio + "/" + mes + "/" + dia);
        scanner.close();
    }
}