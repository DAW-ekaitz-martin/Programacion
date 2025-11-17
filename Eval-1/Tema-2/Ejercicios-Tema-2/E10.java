import java.util.Scanner;

public class E10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la hora(solo horas, posteriormente introducirá minutos y segundos): ");
        int hora = scanner.nextInt();

        System.out.print("Ingrese los minutos: ");
        int minutos = scanner.nextInt();
        
        System.out.print("Ingrese los segundos: ");
        int segundos = scanner.nextInt();

        segundos += 1;

        if (segundos > 59) {
            minutos += 1;
            segundos = 00;
        }
        if (minutos > 59) {
            hora += 1;
            minutos = 0;
        }
        if (hora > 23) {
            hora = 00;
        }


        System.out.println("Hora actual: " + hora + ":" + minutos + ":" + segundos);
        scanner.close();
    }
}
