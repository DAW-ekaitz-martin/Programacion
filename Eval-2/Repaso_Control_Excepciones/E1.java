import java.util.InputMismatchException;
import java.util.Scanner;
public class E1 {
    public static void main(String[] args) {
        boolean entradas_correctas = false;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Ingrese el número de entradas de adulto: ");
                int entradas_adulto = scanner.nextInt();
                System.out.print("Ingrese el número de entradas de niño: ");
                int entradas_ninio = scanner.nextInt();
                if (entradas_adulto < 0 || entradas_ninio < 0) {
                    throw new InputMismatchException("El tipo de dato ingresado no puede ser negativo");
                }
                
            }
            
            catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        }
        while(!entradas_correctas);
    }
}
