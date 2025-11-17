import java.util.Scanner;

public class E11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.14;

        System.out.print("Ingrese la distancia a la diana: ");
        double distancia = scanner.nextDouble();

        System.out.print("Ingrese el ángulo de lanzamiento(grados): ");
        double angulo = scanner.nextDouble();

        System.out.print("Ingrese la velocidad de lanzamiento: ");
        double velocidad = scanner.nextDouble();

        angulo = (angulo * PI)/180;
        //System.out.println(angulo);

        double d = Math.pow(velocidad, 2) * Math.sin(angulo) / 32.2;

        double d_2_win = distancia * 0.10;

        double drop_point = distancia - d;

        if (drop_point < d_2_win) {
            System.out.println("MISSION COMPLETED");
        }
        else {
            System.out.println("MISSION FAILED");
            double difference = drop_point - d_2_win;
            System.out.println("Tu proyectil se desvió " + difference + " metros del objetivo.");
        }
        scanner.close();
    }
}
