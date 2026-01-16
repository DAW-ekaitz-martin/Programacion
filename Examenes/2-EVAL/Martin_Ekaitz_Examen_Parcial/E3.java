import java.util.Scanner;
public class E3 {
    public static void main(String[] args) {
        final int LONGITUD_MIN = 12;
        Scanner scanner = new Scanner(System.in);
        char[] contra;
        do { 
            System.out.print("Introduzca su contraseña: ");
            String contrasenia = scanner.nextLine();
            char [] respuesta = contrasenia.toCharArray();
            contra = respuesta;
            if (!longitud(contra, LONGITUD_MIN)) 
                System.out.println("La contraseña debe tener mínimo 12 caracteres");
            if (!caracteres_especiales(contra))
                System.out.println("La contraseña no tiene caracteres especiales");
            if (!lower(contra))
                System.out.println("La contraseña no tiene minúsculas");
            if (!upper(contra))
                System.out.println("La contraseña no tiene mayúsculas");
            if (!numeric(contra))
                System.out.println("La contraseña no tiene numeros");
        } while (!longitud(contra, LONGITUD_MIN) || !caracteres_especiales(contra) || !lower(contra) || !upper(contra) || !numeric(contra));
        System.out.println("Contraseña guardada exitosamente");

    }
    public static boolean longitud(char[] contra, int LONGITUD_MIN) {
        int contador = 0;
        boolean longitud_minima = true;
        for (int i = 0; i < contra.length; i++) {
            contador ++;
        }
        if (contador < LONGITUD_MIN) {
            longitud_minima = false;
        }
            
        return longitud_minima;
    }
    public static boolean caracteres_especiales(char[] contra) {
        boolean caracteres_especiales = false;
        for (int i = 0; i < contra.length; i++) {
            switch (contra[i]) {
                case '!' -> {
                    caracteres_especiales = true;
                    break;
                }
                case '?' -> {
                    caracteres_especiales = true;
                    break;
                }
                case '.' -> {
                    caracteres_especiales = true;
                    break;
                }
                case ',' -> {
                    caracteres_especiales = true;
                    break;
                }
                case '$' -> {
                    caracteres_especiales = true;
                    break;
                }
                case '(' -> {
                    caracteres_especiales = true;
                    break;
                }
                case ')' -> {
                    caracteres_especiales = true;
                    break;
                }
                case '@' -> {
                    caracteres_especiales = true;
                    break;
                }
            }
            if (caracteres_especiales == true)
                break;
        }
        return caracteres_especiales;
    }
    public static boolean lower(char[] contra) {
        boolean minus = false;
        for (int i = 0; i < contra.length; i++) {
            if (contra[i] >= 'a' && contra[i] <= 'z')
                minus = true;
        }
        return minus;
    }
    public static boolean upper(char[] contra) {
        boolean mayus = false;
        for (int i = 0; i < contra.length; i++) {
            if (contra[i] >= 'A' && contra[i] <= 'Z')
                mayus = true;
        }
        return mayus;
    }
    public static boolean numeric(char[] contra) {
        boolean number = false;
        for (int i = 0; i < contra.length; i++) {
            if (contra[i] >= '0' && contra[i] <= '9')
                number = true;
        }
        return number;
    }

}
