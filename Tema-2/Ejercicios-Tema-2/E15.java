import java.util.Scanner;

public class E15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de x: ");
        int x = scanner.nextInt();

        System.out.print("Ingrese el valor de y: ");
        int y = scanner.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("Las coordenadas se encuentran en el cuadrante 1");
        }
        else if (x < 0 && y > 0) {
            System.out.println("Las coordenadas se encuentran en el cuadrante 2");
        }
        else if (x < 0 && y < 0) {
            System.out.println("Las coordenadas se encuentran en el cuadrante 3");
        }
        else if (x > 0 && y < 0) {
            System.out.println("Las coordenadas se encuentran en el cuadrante 4");
        }
        else if (x == 0 && y == 0) {
            System.out.println("Las coordenadas se encuentran en el origen de coordenadas");
        }
        else {
            if (x == 0) {
                System.out.println("Las coordenadas se encuentran en el eje x");
            }
            else if (y == 0) {
                System.out.println("Las coordenadas se encuentran en el eje y");
            }
            
        }

    }
}
