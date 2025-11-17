import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int n = scanner.nextInt();

        System.out.print("Ingrese una letra: ");
        char letra = scanner.next().toUpperCase().charAt(0);
        
        if (dni(n, letra)) {
           System.out.println("El dni es correcto"); 
        }
        else {
            System.out.println("El dni es incorrecto");
        }


    }
    public static boolean dni(int n, char letter) {
        final int NUMERO_COMPROBACION = 23;
        int resto = n % NUMERO_COMPROBACION;
        char letra = 'a';

        switch (resto) {
            case 0 -> {
                letra = 'T';
                break;
            }
            case 1 -> {
                letra = 'T';
                break;
            }
            case 2 -> {
                letra = 'W';
                break;
            }
            case 3 -> {
                letra = 'A';
                break;
            }
            case 4 -> {
                letra = 'G';
                break;
            }
            case 5 -> {
                letra = 'M';
                break;
            }
            case 6 -> {
                letra = 'Y';
                break;
            }
            case 7 -> {
                letra = 'F';
                break;
            }
            case 8 -> {
                letra = 'P';
                break;
            }
            case 9 -> {
                letra = 'D';
                break;
            }
            case 10 -> {
                letra = 'X';
                break;
            }
            case 11 -> {
                letra = 'B';
                break;
            }
            case 12 -> {
                letra = 'N';
                break;
            }
            case 13 -> {
                letra = 'J';
                break;
            }
            case 14 -> {
                letra = 'Z';
                break;
            }
            case 15 -> {
                letra = 'S';
                break;
            }
            case 16 -> {
                letra = 'Q';
                break;
            }
            case 17 -> {
                letra = 'V';
                break;
            }
            case 18 -> {
                letra = 'H';
                break;
            }
            case 19 -> {
                letra = 'L';
                break;
            }
            case 20 -> {
                letra = 'C';
                break;
            }
            case 21 -> {
                letra = 'K';
                break;
            }
            case 22 -> {
                letra = 'E';
                break;
            }
        }
        if (letra == letter) {
            return true;
        }
        return false;
    }
}
