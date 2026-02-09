import java.util.InputMismatchException;
import java.util.Scanner;
public class E5 {
    public static void main(String[] args) {
        boolean entrada_correcta = false;
        final int dividendo = 100;
        do { 
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Ingrese el número (Entre 1-100): ");
                int numero = scanner.nextInt();
                if (numero < 0 || numero > 100) {
                    throw new NumberFormatException("El numero introducido se sale de los límites permitidios... Vuelva a intentarlo");
                }
                else if (numero == 0) {
                    throw new NumberFormatException("No se puede realizar la división por 0...Vuelva a intentarlo");
                }
                else {
                    double resultado = (double)dividendo / numero;
                    System.out.println("Se le aplicará un descuento del " + resultado + " %");
                    entrada_correcta = true;
                }
            }
            catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
            catch (InputMismatchException e) {
                System.out.println("El valor introducido debe ser un número");
            }
        } while (!entrada_correcta);
    }
}
