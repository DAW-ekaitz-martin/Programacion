import java.util.Scanner;
public class E5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean edad_valida = false;
        do { 
            try {
                System.out.print("Ingrese su edad: ");
                int edad = scanner.nextInt();
                if (edad >= 120) {
                    throw new IllegalArgumentException ("El numero introducido es muy grande");
                }
                if (edad < 0) {
                    throw new IllegalArgumentException ("El numero introducido es muy pequeño");
                }
                edad_valida = true;
            }
            catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            finally {
                System.out.println("La validación de edad se ha realizado");
            }
            
        } while (!edad_valida);
    }
}
