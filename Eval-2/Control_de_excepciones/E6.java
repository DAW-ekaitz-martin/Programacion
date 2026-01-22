import java.util.Scanner;
public class E6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean numero_correcto = false;
        do { 
            try {
                System.out.print("Ingrese un número: ");
                String numero_str = scanner.nextLine();
                char[] array = numero_str.toCharArray();
                for (int i = 0; i <= array.length-1; i++) {
                    if (array[i] == '-') {
                    throw new IllegalArgumentException ("El número introducido es negativo");
                    }
                    if (array[i] < '1' || array[i] > '9') {
                        throw new NumberFormatException ("El formato de la respuesta no es un número.");
                    }
                }
                numero_correcto = true;
            }
            catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
            catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            finally {
                System.out.println("Comprobación realizada");
            }
        } while (!numero_correcto);
    }
}
