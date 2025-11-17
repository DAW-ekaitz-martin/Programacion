import java.util.Scanner;

public class E7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número para calcular su factorial: ");
        int num = scanner.nextInt();

        //Simplemente hago esto para poder poner el número inicial en el print.
        int numero = num;

        int factorial = 1;

        while (num > 1) {
            factorial *= num;
            num --;
            
        }
        System.out.print("El factorial de " +  numero + " es: " + factorial);
        scanner.close();
    }
}
