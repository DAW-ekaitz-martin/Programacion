import java.util.InputMismatchException;
import java.util.Scanner;
public class E3 {
    public static void main(String[] args) {
        boolean finalizar = false;
        do {
            try {
                int[] array = new int[10];
                Scanner scanner = new Scanner(System.in);
                System.out.println("ELIJA LA OPCIÓN QUE DESEA REALIZAR: ");
                System.out.println("1-Registrar puntos en una posición concreta");
                System.out.println("2-Consultar la jugada");
                System.out.println("3-Mostral el total");
                System.out.println("4-Finalizar el programa");
                System.out.print("Respuesta: ");
                int input = scanner.nextInt();
                if (input < 1 || input > 4) {
                    throw new NumberFormatException ("El valor introducido no está en el rango seleccionado");
                }
                if (input == 1) {
                    System.out.println("Ingrese el número de la jugada (1-10): ");
                    int numero_de_jugada = scanner.nextInt();
                    if (numero_de_jugada < 1 || numero_de_jugada > 10) {
                        throw new NumberFormatException ("No existe ese número de jugada.");
                    }
                    else {
                        System.out.print("Ingrese los puntos anotados en la jugada numero " + numero_de_jugada + ": ");
                        int puntuacion = scanner.nextInt();
                        array[numero_de_jugada-1] = puntuacion;
                    }
                }
                if (input == 2) {
                    for (int i = 0; i < array.length-1; i++) {
                        System.out.println(array[i]);
                    }
                }
                else if (input == 4) {
                    finalizar = true;
                }
            } catch (NumberFormatException e) {
                //System.out.println("El valor introducido nose sale del rango");
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("El valor introducido no es un número entero");
            }
            

        } while (!finalizar);
    }
}
