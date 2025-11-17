import java.util.Scanner;
public class E4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_2;
        int cont;
        int suma = 0;
        do { 
            System.out.print("Ingrese un número: ");
            int num = scanner.nextInt();
            num_2 = num;
            cont = 0;
            for (int i = 1; i <= num; i ++) {
                if (num % i == 0) {
                    cont ++;
                }
            }
            if (cont == 2) {
                suma += num;
            }

        } while (num_2 != 0);
        System.out.println("El resultado de la suma es: " + suma);
    }
}
