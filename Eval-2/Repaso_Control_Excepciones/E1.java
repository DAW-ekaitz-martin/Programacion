import java.util.InputMismatchException;
import java.util.Scanner;
public class E1 {
    public static void main(String[] args) {
        boolean entradas_correctas = false;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                
                System.out.print("Ingrese el número de entradas de adulto: ");
                String entradas_adulto_str = scanner.nextLine();
                int entradas_adulto = Integer.parseInt(entradas_adulto_str);
                if (entradas_adulto < 0) {
                    throw new InputMismatchException("El número ingresado no puede ser negativo");
                }
                System.out.print("Ingrese el número de entradas de niño: ");
                String entradas_ninio_str = scanner.nextLine();
                int entradas_ninio = Integer.parseInt(entradas_ninio_str);
                if (entradas_ninio < 0) {
                    throw new InputMismatchException("El número ingresado no puede ser negativo");
                }
                entradas_correctas = true;
            }
            
            catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }
            catch (NumberFormatException e) {
                System.out.println("El valor introducido no es un número entero, operación rechazada...");
            }
            finally{
                System.out.println("Validación realizada");
            }
        }
        while(!entradas_correctas);
    }
}
