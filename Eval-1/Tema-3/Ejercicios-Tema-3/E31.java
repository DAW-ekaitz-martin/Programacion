import java.util.Scanner;

public class E31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int num = scanner.nextInt();
        int digit= 0;
        //Para saber en que posición me encuentro
        int i = 0;
        int total = 0;
        //Creo la variable para poder enseñar el número sin modificar al final del programa
        int aux = num;

        while (num >= 1) {
            digit = num % 10;
            total += digit * Math.pow(2, i);
            i ++;
            num /= 10;
        }

        System.out.println("BINARIO: " + aux + " DECIMAL: " + total);
        scanner.close();
    }
}
