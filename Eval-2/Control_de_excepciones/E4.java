import java.util.Scanner;
public class E4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean conversion_realizada = false;
        do {
            try {
                System.out.print("Ingrese su edad: ");
                String edad_str = scanner.next();
                int edad_int = Integer.parseInt(edad_str);
                conversion_realizada = true;
            }
            catch (NumberFormatException e) {
                System.out.println("El dato introducido no es un numero");
            };
        } while (!conversion_realizada);
        
        
        
    }
}
