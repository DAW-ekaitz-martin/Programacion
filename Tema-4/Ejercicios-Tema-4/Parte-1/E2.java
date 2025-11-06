import java.util.Scanner;
public class E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de x1: ");
        int x1 = scanner.nextInt();
        System.out.print("Ingrese el valor de y1: ");
        int y1 = scanner.nextInt();
        System.out.print("Ingrese el valor de x2: ");
        int x2 = scanner.nextInt();
        System.out.print("Ingrese el valor de y2: ");
        int y2 = scanner.nextInt();
        double resultado = espacio_euclideo(x1, y1, x2, y2);
        System.out.println("La distancia de los dos puntos en el espacio euclideo es de: " + resultado);
        scanner.close();
    }
    public static double espacio_euclideo(int x1, int y1, int x2, int y2) {
        double d = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return  d;
    }
}
