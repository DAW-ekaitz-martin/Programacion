import java.util.Scanner;
public class E6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        System.out.print("Ingrese un la potencia: ");
        int potencia = scanner.nextInt();

        double resultado = pow(numero, potencia);
        System.out.println("Resultado: " + resultado);
        scanner.close();
    }
    public static double pow(int numero, int potencia) {
        double resultado = 1;
        if (potencia != 0) {
            if ( potencia < 0) {
                potencia = potencia * -1;
                for (int i = 0; i < potencia; i++) {
                    resultado *= numero;
                }
                resultado = 1 / resultado;
            }
            else {
                for (int i = 0; i < potencia; i++) {
                    resultado *= numero;
                }
            }
            return resultado;
        }
        else {
            return resultado;
        }
        
    }
}
