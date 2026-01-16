import java.util.InputMismatchException;
import java.util.Scanner;
public class E1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean respuesta_correcta;
        do { 
            try {
                respuesta_correcta = true; 
                System.out.print("Ingrese un número: ");
                int numero_1 = scanner.nextInt();
                System.out.print("Ingrese otro número: ");
                int numero_2 = scanner.nextInt();
                double resultado = numero_1 / numero_2;
                System.out.println("El resultado de la division es " + resultado);
                scanner.close();
            } catch (ArithmeticException aritmetico) {
                respuesta_correcta= false;
                System.out.println("El error recibido es: " +  aritmetico);
            } catch (InputMismatchException mismatch) {
                scanner.nextLine();//Cuando se da el input mismatch error, el valor del escaner no se almacena en la variable y se queda en "limbo", para evitar eso, hay que hacer un nextLIne() y entonces ya funcionaria
                System.out.println("El error recibido es: " +  mismatch);
                respuesta_correcta=false;
            }
        } while (!respuesta_correcta);
        
    }
}
