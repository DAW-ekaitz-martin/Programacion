import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int num = scanner.nextInt();

        int mayor = num;
        int menor = num;

        if (num != 0) {
            while (num != 0) {
                if (num > mayor) {
                    mayor = num;
                }
                else if (num <  menor) {
                    menor = num;
                }
                System.out.print("Ingrese un número: ");
                num = scanner.nextInt();
            }
            System.out.print("El número más grande es: " + mayor + " y el más pequeño es " + menor);
        }
        else {
            System.out.print("El número introducido ya es 0, por lo que no se ejecutará el bucle");
        }
        scanner.close();
    }
}
