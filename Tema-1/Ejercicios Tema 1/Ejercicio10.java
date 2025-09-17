import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.next();

        System.out.print("Ingrese su primer apellido: ");
        String apellido = scanner.next();

        System.out.print("Ingrese su segundo apellido: ");
        String apellido_2 = scanner.next();

        nombre = nombre.replace("a", "");
        apellido = apellido.replace("a", "");
        apellido_2 = apellido_2.replace("a", "");

        nombre = nombre.replace("e", "");
        apellido = apellido.replace("e", "");
        apellido_2 = apellido_2.replace("e", "");

        nombre = nombre.replace("i", "");
        apellido = apellido.replace("i", "");
        apellido_2 = apellido_2.replace("i", "");

        nombre = nombre.replace("o", "");
        apellido = apellido.replace("o", "");
        apellido_2 = apellido_2.replace("o", "");

        nombre = nombre.replace("u", "");
        apellido = apellido.replace("u", "");
        apellido_2 = apellido_2.replace("u", "");

        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(apellido_2);

        scanner.close();
    }
}
