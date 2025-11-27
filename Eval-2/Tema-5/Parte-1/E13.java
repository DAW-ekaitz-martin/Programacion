import java.util.Scanner;

public class E13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud del array: ");
        int ult_num = scanner.nextInt();
        int[] n = new int[ult_num-1];
        for (int i = 0; i <= (ult_num-2); i++) {
            n[i] = i + 2;
        }

        for (int k = 0; k <= n.length-1; k++) {
            for (int l = k + 1; l <= n.length-1; l++) {
                /*System.out.println("DEBUG K => " + k);
                System.out.println("DEBUG L => " + l);
                System.out.println("DEBUG N[K] => " + n[k]);
                System.out.println("DEBUG N[L] => " + n[l]);*/
                
                if (n[k] == 0 ) {
                    break;
                }
                if (n[l] % n[k] == 0) {
                    n[l] = 0;
                }
                //System.out.println("DEBUG N[L] => " + n[l]);
                
                
            }
            if (n[k] * n[k] > ult_num) {
                break;
            }
        }

        for (int j = 0; j <= n.length-1; j++) {
            if (n[j] != 0)
                System.out.println(n[j]);
        }
        scanner.close();
    }
    
}
