import java.util.Scanner;
public class E10 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese otro número: ");
        int num2 = scanner.nextInt();

        if (amigos(num1, num2)) {
            System.out.println("Los números son amigos");
        }
        else {
            System.out.println("Los números NO son amigos");
        }
        scanner.close();
    }
    public static boolean amigos(int num1, int num2) {
        int suma_num1 = 0;
        int suma_num2 = 0;
        boolean amigos = false;
        for (int i = 1; i < num1; i++) {
            if (num1 % i == 0) {
                suma_num1 += i;
            }
        }
        for (int i = 1; i < num2; i++) {
            if (num2 % i == 0) {
                suma_num2 += i;
            }
        }
        if (suma_num1 == num2 && suma_num2 == num1) {
            amigos = true;
        }
        return amigos;
    }
}
