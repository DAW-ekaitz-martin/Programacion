import java.util.Scanner;
public class E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int n1 = scanner.nextInt();

        System.out.print("Ingrese un número: ");
        int n2 = scanner.nextInt();

        System.out.print("Ingrese un número: ");
        int n3 = scanner.nextInt();

        int numero_mayor = mayor(n1, n2, n3);
        int numero_menor = menor(n1, n2, n3);
        System.out.println("El numero más grande es: " + numero_mayor);
        System.out.println("El numero más pequeño es: " + numero_menor);
        scanner.close();
    }
    public static int mayor(int n1, int n2, int n3) {
        int resultado = n1;
        if (resultado < n2) {
            resultado = n2;
        }
        if (resultado < n3) {
            resultado = n3;
        }
        return resultado;
    }
    public static int menor(int n1, int n2, int n3) {
        int resultado = n1;
        if (resultado > n2) {
            resultado = n2;
        }
        if (resultado > n3) {
            resultado = n3;
        }
        return resultado;
    }
}
