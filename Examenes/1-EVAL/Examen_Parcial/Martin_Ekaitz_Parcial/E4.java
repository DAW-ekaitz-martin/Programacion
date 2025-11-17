import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        //1,4/1,5
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número positivo de al menos dos cifras: ");
        int num = scanner.nextInt();

        int digit = 0;
        int digit_2 = 0; //no lo usas
        int aux = 0;
        boolean resultado = true;

        if (num <= 10) { //menor que 10
            System.out.println("El número ingresado debe ser positivo y contener 2 cifras o más.");
        }
        else {
            while (num > 9) {
                digit = num % 10;
                aux = num / 10;
                if (aux % 10 < digit) {
                    num /= 10;
                }
                else {
                    resultado = false;
                    break; 
                }
            }
            if (resultado == false) {
                System.out.println("El número ingresado NO está en orden creciente.");
            }
            else {
                System.out.println("El número ingresado SI está en orden creciente.");
            }
        }
    }
}
