import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");

        int num= scanner.nextInt();

        if (num % 2 != 0) {
            System.out.println("El numero es impar");
        } 
        else {
            System.out.println("El numero es par");
        }

        scanner.close();
    }    
}
