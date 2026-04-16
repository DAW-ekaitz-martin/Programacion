import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int n = scanner.nextInt();
        boolean esCapi = capicua(n);
        if(esCapi) {
            System.out.println("El numero " + n + " es capicua");
        }
        else {
            System.out.println("El numero " + n + " NO es capicua");
        }
    }
    public static boolean capicua(int n) {
        int insideOut = 0;
        int aux = n;
        while(n > 10) {
            insideOut = insideOut * 10 + (n%10);
            n/= 10;
        }
        insideOut = insideOut * 10 + n;  
        if (aux == insideOut) {
            return true;
        }
        return false;
    }
}
