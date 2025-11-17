import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el día de la semana en formato numérico: ");
        int dia = scanner.nextInt();

        switch (dia) {
            case 1 -> {
            System.out.print("Lunes");
            break;
           }
           case 2 -> {
            System.out.print("Martes");
            break;
           }
           case 3 -> {
            System.out.print("Miercoles");
            break;
           }
           case 4 -> {
            System.out.print("Jueves");
            break;
           }
           case 5 -> {
            System.out.print("Virenes");
            break;
           }
           case 6 -> {
            System.out.print("Sabado");
            break;
           }
           case 7 -> {
            System.out.print("Domingo");
            break;
           }
           default -> {
            System.out.print("No existe el día " + dia + " de la semana");
           }
        }
        scanner.close();
    }
}
