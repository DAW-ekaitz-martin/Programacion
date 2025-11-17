import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una temperatura en ºC: ");
        int celsius = scanner.nextInt();

        double farenheit = (double) (celsius * 9/5) + 32;
        System.out.println(celsius + "ºC equivalen a " + farenheit + "ºF");
            
        scanner.close();
    }
}
