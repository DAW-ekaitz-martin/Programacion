import java.util.Scanner;
public class E5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("NUMEROS GEMELOS ENTRE 1 Y 1000");
        for (int i = 2; i < 1000; i++) {
            if (primo(i) && primo(i + 2)) {
            System.out.println("(" + i + ", " + (i + 2) +")"); 
        }
        }
       scanner.close();
    }
    public static boolean primo(int num) {
        boolean primo = true;
        for (int i = 2; i < num; i ++) {
            if (num % i == 0) {
                primo = false;
            }
        }
        return primo;
    }
}
