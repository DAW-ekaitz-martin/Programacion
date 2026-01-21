import java.util.Scanner;
public class E5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do { 
            try {
                System.out.print("Ingrese su edad: ");
                int edad = scanner.nextInt();
                if (edad >= 120) {
                    throw new IllegalArgumentException ("El numero introducido es muy grande");
                }
                if (edad < 0) {
                    throw new IllegalArgumentException ("El numero introducido es muy grande");
                }
            }
            catch (IllegalArgumentException e) {};
        } while (true);
    }
}
