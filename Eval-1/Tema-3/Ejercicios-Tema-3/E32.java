import java.util.Scanner;

public class E32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número natural: ");
        int n = scanner.nextInt();

        
        while (n > 1) { 
            if (n % 2 == 0) {
                n /= 2;
                System.out.println(n);
            }
            else {
                n = n * 3 + 1;
                System.out.println(n);
            }
        }
        scanner.close();
    }
}
