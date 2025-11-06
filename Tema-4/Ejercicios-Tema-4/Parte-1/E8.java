import java.util.Scanner;
public class E8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        int resultado = num_cifras(numero);
        System.out.println("El número " + numero + " tiene " + resultado + " cifras");
        scanner.close();
    }
    public static int num_cifras(int num) {
        int cont = 1;
        while (num > 9) {
            num /= 10;
            cont ++;
        }
        return cont;
    }
}
