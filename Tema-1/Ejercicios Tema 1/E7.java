import java.util.Scanner;

public class E7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final double PESO_1 = 0.30;
        final double PESO_2 = 0.70;

        System.out.print("Ingrese la nota que sacó en el primer examen: ");
        double nota_1 = scanner.nextDouble();
        nota_1 = nota_1 * PESO_1;
        
        System.out.print("Ingrese la nota que quiere obtener en esta parte: ");
        double nota_deseada = scanner.nextDouble();



        double nota_2 = ((nota_deseada * 2) - nota_1) * PESO_2;

        System.out.println("La nota necesaria para alcanzar la nota deseada es: " + nota_2);

        scanner.close();

    }    
}
