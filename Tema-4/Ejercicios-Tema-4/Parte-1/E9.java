import java.util.Scanner;
public class E9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        if (perfecto(numero)) {
            System.out.println("El número es perfecto");
        }
        else {
            System.out.println("El número NO es  perfecto");
        }
        scanner.close();
    }
    public static boolean perfecto(int num) {
        int suma = 0;
        boolean perfecto = false;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                suma += i;
            }
        }
        if (suma == num) {
            perfecto = true;
        }
        return perfecto;
    }
}
