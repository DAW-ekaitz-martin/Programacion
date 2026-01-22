import java.util.InputMismatchException;
import java.util.Scanner;
public class E8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean numero_correcto = false;
        do { 
            try {
                System.out.print("Ingrese una nota (1-10): ");
                int nota = scanner.nextInt();
                if (nota < 0 || nota > 10) {
                    throw new IllegalArgumentException ("El número introducido excede de los límites.");
                }
                numero_correcto = true;
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println(e);
            }
            catch (IllegalArgumentException error) {
                System.out.println(error.getMessage());
            } finally {
                System.out.println("La validación de la nota ha sido realizada");
            }
        } while (!numero_correcto);
    }
}
