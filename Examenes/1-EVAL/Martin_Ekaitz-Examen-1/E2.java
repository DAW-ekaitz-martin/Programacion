import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {

        //1/1, perfecto
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        int num = scanner.nextInt();

        int cont = 0;

        while (num % 2 == 0) {
            num /= 2;
            cont ++;
        }
        if (num == 1) {
            System.out.println("El número ingresado es potencia de dos, su exponente es: " + cont);
        }
        else {
            System.out.println("El número ingresado NO es potencia de dos");
        }
        scanner.close();
    }
}
