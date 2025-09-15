import java.util.Scanner;

public class E7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de a: ");  
        int a = scanner.nextInt();
        
        System.out.print("Ingrese el valor de b: ");  
        int b = scanner.nextInt();

        System.out.print("Ingrese el valor de c: ");  
        int c = scanner.nextInt();

        System.out.print("Ingrese el valor de x: ");  
        int x = scanner.nextInt();

        System.out.print("Ingrese el valor de y: ");  
        int y = scanner.nextInt();

        double distancia = (a * x + b * y + c) / Math.sqrt(Math.pow(a, a) + Math.pow(b,b));

        System.out.println("La distancia es: " + distancia);

        scanner.close();
    }
}
