import java.util.Scanner;
public class E4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();  
        int resultado = factorial(numero);
        System.out.println("El factorial de " + numero +  " es " + resultado); 
        scanner.close();    
    }
    public static int factorial(int numero) {
        int resultado = 1;
        while (numero > 1) {
            resultado *= numero;
            numero --;
        }
        return resultado;
    }
}
