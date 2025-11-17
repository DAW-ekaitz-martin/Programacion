import java.util.Scanner;
public class E7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double TRAMO_2 = 0.10;
        final double TRAMO_3 = 0.20;
        final double TRAMO_4 = 0.30;

        System.out.print("Ingrese su salario bruto anual: ");
        double salario = scanner.nextDouble();
 
        if (salario < 12000) {
            System.out.print("No se le cobrará IRPF");
        }
        else if (salario >= 12000 && salario < 25000) {
            double irpf = salario * TRAMO_2;
            System.out.print("Se le cobrará un IRPF de: " + irpf + "euros");
        }
        else if (salario >= 25000 && salario <= 45000) {
            double irpf = salario * TRAMO_3;
            System.out.print("Se le cobrará un IRPF de: " + irpf + "euros");
        }
        else {
            double irpf = salario * TRAMO_4;
            System.out.print("Se le cobrará un IRPF de: " + irpf + "euros");
        }
        scanner.close();
    }
}
