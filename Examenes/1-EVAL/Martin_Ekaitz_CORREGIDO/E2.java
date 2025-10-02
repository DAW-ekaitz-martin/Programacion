import java.util.Scanner;
public class E2 {
    public static void main(String[] args) {

        /* Está casi perfecto:
         * 
         * 1) Las coordenadas x e y de un punto son números reales. Por ello, deberíamos usar el tipo double.
         * 
         * 2) Al no validar si los dos vértices realmente son el superior derecho y el inferior izquierdo, el usuario podría introducirlos
         * al revés, lo cual induciría a un error en el resultado. Por el momento (tiempo muy breve) esta comprobación no la tendré muy en cuenta, pero sería bueno
         * que las implementaras ya, porque pienso que eres capaz. 
         * 
         * Nota del ejercicio: 1,5/2
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("RECTANGULO 1");

        System.out.print("Ingrese el valor de x del vertice superior derecho: ");
        int x1 = scanner.nextInt();
        System.out.print("Ingrese el valor de y del vertice superior derecho: ");
        int y1 = scanner.nextInt();

        System.out.print("Ingrese el valor de x del vertice inferior izquierdo: ");
        int x2 = scanner.nextInt();
        System.out.print("Ingrese el valor de y del vertice inferior izquierdo: ");
        int y2 = scanner.nextInt();


        System.out.println("RECTANGULO 2");

        System.out.print("Ingrese el valor de x del vertice superior derecho: ");
        int x3 = scanner.nextInt();
        System.out.print("Ingrese el valor de y del vertice superior derecho: ");
        int y3 = scanner.nextInt();

        System.out.print("Ingrese el valor de x del vertice inferior izquierdo: ");
        int x4 = scanner.nextInt();
        System.out.print("Ingrese el valor de y del vertice inferior izquierdo: ");
        int y4 = scanner.nextInt();


        System.out.print("Ingrese el valor x del punto a comprobar: ");
        int px = scanner.nextInt();
        System.out.print("Ingrese el valor y del punto a comprobar: ");
        int py = scanner.nextInt();


        if ((px <= x1 && px >= x2 && py <= y1 && py >= y2) && (px <= x3 && px >= x4 && py <= y3 && py >= y4)) {
            System.out.println("El punto se encuentra dentro de los dos rectangulos");
        }
        else if (px <= x1 && px >= x2 && py <= y1 && py >= y2) {
            System.out.println("El punto se encuentra SOLO dentro del RECTANGULO 1");
        }
        else if (px <= x3 && px >= x4 && py <= y3 && py >= y4) {
            System.out.println("El punto se encuentra SOLO dentro del RECTANGULO 2");
        }
        else {
            System.out.println("El punto NO se encuentra dentro de ninguno de los rectángulos");
        }
        scanner.close();
    }
}
