import java.util.Scanner;
public class E7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de m: ");
        int m = scanner.nextInt();

        System.out.print("Ingrese el valor n: ");
        int n = scanner.nextInt();
        double resultado = coeficiente_binomial(m, n);
        System.out.println("Resultado: " + resultado);
        scanner.close();
    }
    public static double factorial(double numero) {
        double resultado = 1;
        while (numero > 1) {
            resultado *= numero;
            numero --;
        }
        return resultado;
    }
    public static double coeficiente_binomial(double m, double n) {
        double resultado = factorial(m) / (factorial(n) * factorial((m-n)));
        return resultado;
    }
}
