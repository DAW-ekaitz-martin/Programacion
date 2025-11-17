import java.util.Scanner;

public class E10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número para mostrar su tabla de multiplicar: ");
        int num = scanner.nextInt();
        if (num >= 1 && num <= 9) {
            for (int i = 0; i <= 10; i ++) {
                System.out.println(num +" x " + i + " = " + num * i);
            }
        }
        else {
            System.out.println("El " + num +" no es un número entre el 1 y el 9");
        }
        scanner.close();
    }
}
