import java.util.Scanner;

public class E15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce cuantas posiciones quieres desplazar cada número: ");
        int n = scanner.nextInt();

        int[] vector = {2, 3, 4, 5, 6};

        
        for (int j = 0; j < n; j ++) {
            for (int i = vector.length-1; i > 0; i--) {
                vector[i] = vector[i] + vector[i - 1];
                vector[i-1] = vector[i] - vector[i-1];
                vector[i] = vector[i] - vector[i-1];
            } 
        }
        for (int i = 0; i <= (vector.length-1); i++) {
            System.out.print(vector[i]);
            if (i < (vector.length-1))
                System.out.print(", ");
            if (i == (vector.length-1))
                System.out.println("");
        }
        scanner.close();
    }
    
}
