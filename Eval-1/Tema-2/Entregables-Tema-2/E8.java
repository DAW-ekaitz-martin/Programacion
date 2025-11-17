import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int BILBAO = 200;
        final int BADAJOZ = 80;
        final int CADIZ = 20;

        System.out.print("Ingrese la cantidad de dinero de la que dispone: ");
        int presupuesto = scanner.nextInt();



        if (presupuesto >= BILBAO) {
            System.out.print("Puedes viajar a Bilbao");
        }
        else if (presupuesto >= BADAJOZ) {
            System.out.print("Puedes viajar a Badajoz");
        }
        else if (presupuesto >= CADIZ) {
            System.out.print("Puedes viajar a Cádiz");
        }
        else {
             System.out.print("No tienes suficiente dinero para viajar");
        }
        scanner.close();
    }
}
