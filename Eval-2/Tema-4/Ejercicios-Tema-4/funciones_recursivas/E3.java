import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int num = scanner.nextInt();

        System.out.println("El factorial de " + num + " es: " + factorial(num));
        scanner.close();
    }
    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        }
       if (num == 1) {
            return num;
       } 
       return factorial(num - 1) * num;
    }
}
