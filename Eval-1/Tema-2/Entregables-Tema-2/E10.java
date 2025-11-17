import java.util.Scanner;

public class E10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de h: ");
        int h = scanner.nextInt();

        System.out.print("Ingrese el valor de k: ");
        int k = scanner.nextInt();

        System.out.print("Ingrese el radio del circulo: ");
        int radio = scanner.nextInt();

        System.out.print("Ingrese las coordenadas de x: ");
        int x = scanner.nextInt();

        System.out.print("Ingrese las coordenadas de y: ");
        int y = scanner.nextInt();

        double distancia = Math.pow((x-h),2) + Math.pow((y-k),2);
        //System.out.println(distancia);
        radio = (int) Math.pow(radio, 2);
        //System.out.println(radio);

        if (distancia <= radio) {
            System.out.print("El cículo está dentro del punto: ");
        }
        else {
            System.out.print("El cículo está fuera del punto: ");
        }
        scanner.close();
    }
}
