import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero de 3 cifras: ");
        int num = scanner.nextInt();

        int cifra_1 = num % 10;
        num /= 10;
        int cifra_2 = num % 10;
        num /= 10;

        int resultado = cifra_1 + cifra_2 + num;

        System.out.println("El resultado de la suma de los dígitod es: " + resultado);

        scanner.close();
    }    

}
