import java.util.Scanner;

public class E13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        System.out.println("DIRECCIÓN 1");
        System.out.print("Ingrese el número de vehículos en la primera dirección: ");
        int d1 = scanner.nextInt();
        System.out.print("Ingrese 's' en caso de ambulancia en esta dirección o 'n' si no la hay: ");
        String amb_1 = sc.next();

        System.out.println("DIRECCIÓN 2");
        System.out.print("Ingrese el número de vehículos en la segunda dirección: ");
        int d2 = scanner.nextInt();
        System.out.print("Ingrese 's' en caso de ambulancia en esta dirección o 'n' si no la hay: ");
        String amb_2 = sc.next();

        System.out.println("DIRECCIÓN 3");
        System.out.print("Ingrese el número de vehículos en la segunda dirección: ");
        int d3 = scanner.nextInt();
        System.out.print("Ingrese 's' en caso de ambulancia en esta dirección o 'n' si no la hay: ");
        String amb_3 = sc.next();

        System.out.println("DIRECCIÓN 4");
        System.out.print("Ingrese el número de vehículos en la segunda dirección: ");
        int d4 = scanner.nextInt();
        System.out.print("Ingrese 's' en caso de ambulancia en esta dirección o 'n' si no la hay: ");
        String amb_4 = sc.next();

        System.out.print("Ingrese el tiempo de espera acumulado de los peatones(en segundos): ");
        int peatones = scanner.nextInt();

        if (amb_1.equals("s")) {
            System.out.println("Hay una ambulancia en la dirección 1");
            System.out.println("El semáforo de la dirección 1 se pone en verde.");
        }
        else if (amb_2.equals("s")) {
            System.out.println("Hay una ambulancia en la dirección 2");
            System.out.println("El semáforo de la dirección 2 se pone en verde.");
        }
        else if (amb_3.equals("s")) {
            System.out.println("Hay una ambulancia en la dirección 3");
            System.out.println("El semáforo de la dirección 3 se pone en verde.");
        }
        else if (amb_4.equals("s")) {
            System.out.println("Hay una ambulancia en la dirección 4");
            System.out.println("El semáforo de la dirección 4 se pone en verde.");
        }
        else {
            if (peatones > 60) {
                System.out.println("El tiempo acumulado para peatones es de " + peatones + " segundos");
                System.out.println("El semáforo para peatones se pone en verde.");
            }
            else {
                if (d1 > d2 && d1 > d3 && d1 > d4) {
                    System.out.println("No hay ambulancias en ninguna dirección");
                    System.out.println("El tiempo de espera para peatones en menos de 60s: ");
                    System.out.println("La dirección 1 es la que más coches tiene");
                    System.out.println("El semáforo para la dirección 1 se pone en verde");
                }
                else if (d2 > d1 && d2 > d3 && d2 > d4) {
                    System.out.println("No hay ambulancias en ninguna dirección");
                    System.out.println("El tiempo de espera para peatones en menos de 60s");
                    System.out.println("La dirección 2 es la que más coches tiene");
                    System.out.println("El semáforo para la dirección 2 se pone en verde");
                }
                else if (d3 > d1 && d3 > d2 && d3 > d4) {
                    System.out.println("No hay ambulancias en ninguna dirección");
                    System.out.println("El tiempo de espera para peatones en menos de 60s");
                    System.out.println("La dirección 3 es la que más coches tiene");
                    System.out.println("El semáforo para la dirección 3 se pone en verde");
                }
                else if (d4 > d1 && d4 > d3 && d4 > d2) {
                    System.out.println("No hay ambulancias en ninguna dirección");
                    System.out.println("El tiempo de espera para peatones en menos de 60s");
                    System.out.println("La dirección 4 es la que más coches tiene");
                    System.out.println("El semáforo para la dirección 4 se pone en verde");
                }
            }
        }
        scanner.close();
    }
}
