import java.util.Scanner;

public class E35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double E = 0.000001;

        System.out.print("Ingrese el valor de a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Ingrese el valor de b: ");
        double b = scanner.nextDouble();

        // System.out.print("Ingrese el valor de la tolerancia deseada: ");
        // double e = scanner.nextDouble();

        double f_a = Math.pow(a, 3) - 2 * a - 5;
        double f_b = Math.pow(b, 3) - 2 * b - 5;

        if (f_a * f_b >= 0) {
            System.out.println("El teorema de Bolzano no garantiza una raíz en este intervalo");
        }
        else {
            double c = 0;
            while (f_b - f_a > E) {
                c = f_a + f_b / 2;
                if (f_a * c < 0) {
                    f_b = c;
                }
                if (c * f_b < 0) {
                    f_a = c;
                }
            }
            c = (f_a +f_b) / 2;
            System.out.println("El valor de c es : " + c);
        }
        
    }
}
