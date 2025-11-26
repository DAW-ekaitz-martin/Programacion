import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        
        do {
            System.out.print("Ingrese un número entero positivo: ");
            int n = scanner.nextInt();
            numero = n;
        }
        while(numero < 0); 
        
        int resultado = invertir(numero);
        System.out.println("El número invertido es: " + resultado);
    }
    public static int invertir(int numero) {
        int resultado = 0;
        while (numero > 9) {
            int digit = numero % 10;
            resultado = resultado * 10 + digit;
            numero /= 10;
        }
        resultado = resultado * 10 + numero;
        return resultado;
    }
}
