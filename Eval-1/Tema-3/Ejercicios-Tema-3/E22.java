import  java.util.Scanner;

public class E22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int num = scanner.nextInt();

        final int DIVISOR = 2;
        int contador = 0;
        if (num == 1) {
            System.out.println("El valor de k es: 0");
        }
        else {
            int aux = num;
            while (aux % 2 == 0) {
                aux /= DIVISOR;
                contador++;
            }
            //System.out.println("DEBUGG CONTADOR * 2=> " + contador * 2);
            //System.out.println("DEBUGG NUM / 2=> " + num / 2);
            if (aux != 1) {
                System.out.println("El número no puede ser representado como potencia de 2");
            }
            else {
                System.out.println("El valor de k es: " + contador);
            }
        }
    }
}    
