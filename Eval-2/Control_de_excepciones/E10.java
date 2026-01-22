import java.util.Scanner;
public class E10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean longitud_minima = false;
        do { 
            try {
                System.out.print("ingrese su contraseña: ");
                String password = scanner.nextLine();
                char[] array = password.toCharArray();
                if (array.length < 8) {
                    throw new IllegalArgumentException ("La contraseña tiene menos de 8 caracteres");
                }
                longitud_minima = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("La verificación de la contraseña se ha ejecutado");
            }
        } while (!longitud_minima);
    }
}
