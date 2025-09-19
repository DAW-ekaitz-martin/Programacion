import java.util.Scanner;

public class E13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el eje x de la esquina superior izquierda: ");
        int x1 = scanner.nextInt();

        System.out.print("Ingrese el eje y de la esquina superior izquierda: ");
        int y1 = scanner.nextInt();

        System.out.print("Ingrese el eje x de la esquina inferior derecha: ");
        int x2 = scanner.nextInt();

        System.out.print("Ingrese el eje y de la esquina inferior derecha: ");
        int y2 = scanner.nextInt();

        System.out.print("Ingrese el eje x del punto a comprobar: ");
        int x3 = scanner.nextInt();

        System.out.print("Ingrese el eje y del punto a comprobar: ");
        int y3 = scanner.nextInt();

        int long_max;
        int long_min;

        int lat_max;
        int lat_min;
        
        if (x1 > x2) {
            long_max = x1;
            long_min = x2;
        }
        else {
            long_max = x2;
            long_min = x1;
        }

        if (y1 > y2) {
            lat_max = y1;
            lat_min = y2;
        }
        else {
            lat_max = y2;
            lat_min = y1;
        }


        if (x3 >= long_min && x3 <= long_max && y3 >= lat_min && y3 <= lat_max) {
                System.out.println("El punto en el espacio está dentro del rectangulo");
        }
        else {
            System.out.println("El punto en el espacio está fuera del rectangulo");
        }
        scanner.close();
    }
}
