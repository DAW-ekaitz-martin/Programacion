import java.util.Scanner;
public class E6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] n = {1, 2, 3, 2, 5};

        System.out.print("Ingrese el número que quiere buscar: ");
        int numero = scanner.nextInt();
        boolean existe = false;
        for (int i = 0; i <= 4; i++) {
            if (numero == n[i]) {
                System.out.println("El número se encuentra en la posición " + i);
                existe = true;
            }
        }
        if (!existe) {
            System.out.println("El número no se encuentra en el array");
        }
        scanner.close();
    }
}
