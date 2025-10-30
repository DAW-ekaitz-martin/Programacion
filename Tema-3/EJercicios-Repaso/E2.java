import java.util.Scanner;
public class E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        long numero = scanner.nextLong();

        long digit = 0;
        int cont_0 = 0;
        int cont_1 = 0;
        int cont_2 = 0;
        int cont_3 = 0;
        int cont_4 = 0;
        int cont_5 = 0;
        int cont_6 = 0;
        int cont_7 = 0;
        int cont_8 = 0;
        int cont_9 = 0;


        while (numero > 0) {
            digit = numero % 10;
            switch ((int)digit) {
                case 0 -> {
                    cont_0 ++;
                    break;
                }
                case 1 -> {
                    cont_1 ++;
                    break;
                }
                case 2 -> {
                    cont_2 ++;
                    break;
                }
                case 3 -> {
                    cont_3 ++;
                    break;
                }
                case 4 -> {
                    cont_4 ++;
                    break;
                }
                case 5 -> {
                    cont_5 ++;
                    break;
                }
                case 6 -> {
                    cont_6 ++;
                    break;
                }
                case 7 -> {
                    cont_7 ++;
                    break;
                }
                case 8 -> {
                    cont_8 ++;
                    break;
                }
                case 9 -> {
                    cont_9 ++;
                    break;
                }
            }
            numero /= 10;

        }
        System.out.println("RECUENTO => Digito 0 => " + cont_0 + " veces, Digito 1 => " + cont_1 + " veces, " + "Digito 2 => " + cont_2 + " veces, " + "Digito 3 => " + cont_3 + " veces, " 
        + "Digito 4 => " + cont_4 + " veces, " + "Digito 5 => " + cont_5 + " veces, " + "Digito 6 => " + cont_6 + " veces, " + "Digito 7 => " + cont_7 + " veces, " + "Digito 8 => " + cont_8 + " veces y " + "Digito 9 => " + cont_9 + " veces, ");
    }
}
