import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa un tiempo medido en segundos: ");
        int tiempo = scanner.nextInt(); 
        
        int segundos = tiempo % 60;
        tiempo = tiempo / 60;
        int minutos = tiempo % 60;
        int horas = tiempo / 60;

        System.out.println(horas + "h:" + minutos + "m:" + segundos + "s");

        scanner.close();
    }
}
