import java.util.Scanner;
public class E8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nota: ");
        int nota = scanner.nextInt();

        if (nota < 0) {
            System.out.print("ERROR");
        }

        switch (nota) {
            
            case 0,1,2,3,4 -> 
                System.out.println("Insuficiente");
            
            case 5 ->
                System.out.println("Suficiente");
            case 6 ->
                System.out.println("Bien");
            
            case 7,8 ->
                System.out.println("Notable");
            
            case 9, 10 ->
                System.out.println("Sobresaliente");
        };
        scanner.close();
    }
}
