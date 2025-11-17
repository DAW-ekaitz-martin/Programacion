import java.util.Scanner;
public class E1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de segundos: ");
        int segundos = scanner.nextInt();
        System.out.println(conversor(segundos));
        scanner.close();
    }

    public static String conversor(int segundos) {
        int seg = segundos % 60;
        int min = segundos / 60;
        int minutos = min % 60;
        int horas = min / 60;

        String seg_str = Integer.toString(seg);
        String min_str = Integer.toString(minutos);
        String hora_str = Integer.toString(horas);

        String respuesta = hora_str + ":" + min_str + ":" + seg_str;
        return respuesta;
    }
}
