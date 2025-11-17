import java.util.Scanner;

public class E14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su contraseña: ");
        String password = scanner.next();

        if (password.length() < 8) {
            System.out.println("La contraseña debe tener más de 8 carácteres");
        }
        if (!password.matches(".*[A-Z]*.")) {
            System.out.println("La contraseña debe tener al menos una mayúscula");
        }
        if (!password.matches(".*[1-9]*.")) {
            System.out.println("La contraseña debe contener al menos un número");
        }
        // if (!password.matches(".*@.*") && !password.matches(".*#.*") && !password.matches(".*$.*") && !password.matches(".*%.*") && !password.matches(".*&.*") && !password.matches(".*'*'.*")) {
        //     System.out.println("La contraseña debe contener al menos un carácter especial");
        // }
        if (!password.matches(".*[@#$%&*].*")){
            System.out.println("La contraseña debe contener al menos un carácter especial");
        }
        else {
            System.out.println("La contraseña contiene todo lo necesario.");
        }
    }
}
