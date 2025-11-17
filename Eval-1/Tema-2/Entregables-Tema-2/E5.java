import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        System.out.print("Escriba una letra: ");
        char letra = scanner.nextLine().charAt(0);

        if (letra >= 97 && letra <= 122) {
            if (letra == 97 || letra == 101 || letra == 105 || letra == 111 || letra == 117) {
                System.out.println("La letra es minúscula y vocal");
            }
            else {
                System.out.println("La letra es minúscula y consonante");
            }
        }
        else if (letra >= 65 && letra <= 90) {
            if (letra == 65 || letra == 69 || letra == 73 || letra == 79 || letra == 85) {
                System.out.println("La letra es mayúscula y vocal");
            }
            else {
                System.out.println("La letra es mayúscula y consonante");
            }
        }
        else {
            System.out.print("El caracter introducido no es una letra");
        }
        scanner.close();
    }
}
