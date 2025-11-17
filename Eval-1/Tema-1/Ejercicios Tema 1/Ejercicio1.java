import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        System.out.print("Ingrese su nombre: ");
        nombre = sc.nextLine();
        System.out.println("Su nombre es " + nombre);

        sc.close();
    }
}
