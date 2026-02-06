import java.util.Scanner;
public class E4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oportunidades = 3;
        String contrasenia = "hola";
        do { 
            try {
                System.out.print("Ingrese la contraseña: ");
                String intento = scanner.nextLine();
                if (intento.equals( "")) {
                    oportunidades --;
                    throw new IllegalArgumentException ("La respuesta está vacía");
                }
                if (!contrasenia.equals(intento)) {
                    oportunidades --;
                    System.out.println("Contraseña incorrecta, " + oportunidades + " oportunidades restantes");
                }
                else {
                    System.out.println("Contraseña correcta!");
                    break;
                }
                
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                System.out.println("Contraseña incorrecta, " + oportunidades + " oportunidades restantes");
            }
        } while (oportunidades >= 1);
        if (oportunidades == 0) {
            System.out.println("No quedan más oportunidades");
        }
    }
}
