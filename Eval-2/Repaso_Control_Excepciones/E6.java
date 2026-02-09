import java.util.InputMismatchException;
import java.util.Scanner;
public class E6 {
    public static void main(String[] args) {
        int n=0,s=0,e=0,o = 0;
        int cantidad_instrucciones = 0;
        do { 
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Ingrese la dirección(N,S,E,O): ");
                String direccion = scanner.nextLine();

                if (!direccion.equals("N") && !direccion.equals("S") && 
                !direccion.equals("E") && !direccion.equals("O")) {
                    throw new IllegalArgumentException ("El valor introducido no es válido, vuelva a intentarlo...");
                }
                System.out.println("Ingrese los pasos: ");
                int pasos = scanner.nextInt();
                if (direccion.equals("N")) {
                    n+= pasos;
                    s-= pasos;
                    cantidad_instrucciones ++;
                }
                else if (direccion.equals("S")) {
                    s+= pasos;
                    n-= pasos;
                    cantidad_instrucciones ++;
                }
                else if (direccion.equals("E")) {
                    e+= pasos;
                    o-= pasos;
                    cantidad_instrucciones ++;
                }
                else if (direccion.equals("O")) {
                    o+= pasos;
                    e-= pasos;
                    cantidad_instrucciones ++;
                }
            }
            catch (IllegalArgumentException error) {

                System.out.println(error.getMessage());

            }catch (InputMismatchException error) {
                System.out.println("El valor introducido no es un número entero... Vuelva a intentarlo");
            }
        } while (cantidad_instrucciones < 5);
        System.out.println("TU POSICION ES: ");
        System.out.println(n + " pasos al norte");
        System.out.println(s + " pasos al sur");
        System.out.println(e + " pasos al este");
        System.out.println(o + " pasos al oeste");

    }
}
