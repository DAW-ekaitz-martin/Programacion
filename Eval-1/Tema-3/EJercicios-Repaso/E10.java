import java.util.Scanner;

public class E10 {
    public static void main(String[] args) {

        final double G = 9.81;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la altura inicial: ");
        int h_inicial = scanner.nextInt();
        // Entre 0 y 0.99, asumo que será la misma para todos los rebotes, que el suelo es liso...
        double r = 0.6; // No sé si hay que hacerlo con Math.random, así que le he asignado el del ejemplo y ya.

        //A
        double h_rebote = h_inicial * Math.pow(r,2); //Altura tras el primer rebote, sino simepre me dá un rebote más de los que verdaderamente da.
        int num_rebotes = 0;
        while (h_rebote > 0.01) {
            h_rebote = h_rebote * Math.pow(r,2);
            num_rebotes ++;
        }
        //B
        double distacia_total = h_inicial * ((1 + Math.pow(r, 2)) / (1 - Math.pow(r, 2)));
        //C
        double tiempo_total = Math.sqrt((2 * h_inicial)/ G) * ((1 + r) / (1-r));
        System.out.println("El número de rebotes han sido: " + num_rebotes);
        System.out.println("La distancia total recorrida ha sido de: " + distacia_total );
        System.out.println("El tiempo total de en movimiento ha sido: " + tiempo_total + " segundos");
        scanner.close();
    }
}
