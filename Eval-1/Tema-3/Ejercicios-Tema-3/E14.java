import java.util.Scanner;

public class E14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de segundos: ");
        int segundos = scanner.nextInt();

        int minutos = 0;
        int horas = 0;

        while(segundos > 60) {
            //Las horas se calculan diviendo los segundos entre 3600 y quedandonos su paerte entera
            horas = (int) segundos / (int) 3600;
            // Para los minutos calculo el residuo de la dvisión anterior, lo divido entre 60 y me quedo la parte entera
            minutos = ((int) segundos % (int) 3600) / 60;
            //Por último, los segundos equivalen a la parte entera del residuo de la división con la que calculé los minutos
            segundos = ((int) segundos % (int) 3600) % 60;
        }
        System.out.println(horas  + " Horas, " + minutos + " minutos, " + segundos + " segundos." );
    }
}
