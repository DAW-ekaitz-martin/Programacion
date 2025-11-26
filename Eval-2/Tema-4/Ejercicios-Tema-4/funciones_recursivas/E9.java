import java.util.Scanner;

public class E9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int n1 = scanner.nextInt();
        int resultado = invertir(n1);
        System.out.println("El resultado es: " + resultado);
        scanner.close();
    }
    public static int invertir(int n1) {
        int invertido = 0;
        if(n1 >9) {
            invertido = invertir_2(n1, invertido);
        }
        if (n1 < 0) {
            return -invertir_2(-n1, invertido);
        }
        return n1;
    }
    public static int invertir_2(int n1, int invertido) {
        invertido = invertido * 10 + n1%10;
        if (n1 < 9) {
            return invertido;
        }
        return invertir_2((n1/10), invertido);
    }
    
}
