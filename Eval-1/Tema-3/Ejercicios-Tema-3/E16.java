import java.util.Scanner;

public class E16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números de la secuencia de Fibonacci quiere ver: ");
        int num = scanner.nextInt();

        int a = 0;
        int b = 1;
        int suma = 0;

        System.out.print(a + ",");
        System.out.print(b + ",");
        //Hago hasta (num - 2) porque imprimo dos números fuera del bucle, para no mostrar 2 números más de los pedidos
        for (int i = 0; i < (num - 2); i++) {
            suma = a + b;
            System.out.print(suma + ",");
            a = b;
            b = suma;
        }
        scanner.close();
    }
}
