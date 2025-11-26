import java.util.Scanner;
public class E9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] v1 = new int[5];
        int[] v2 = new int[5];
        int[] v3 = new int[5];
        int[] v4 = new int[5];

        for (int i = 0; i <= (v1.length - 1); i++) {
            System.out.print("Ingrese un número en la posición " + i + " del vector: ");
            int numero = scanner.nextInt();
            v1[i] = numero;
            v2[i] = (int)(1 + Math.random() * 10);
            v3[i] = v1[i] + v2[i];
            v4[i] = v1[i] - v2[i];
        }
        System.out.println("Vector 1");
        for (int j = 0; j <= (v1.length - 1); j++) {
            System.out.print(v1[j]);
            if (j < (v1.length - 1))
            System.out.print(", ");
            else {
                System.out.println();
            }
        }
        System.out.println("Vector 2");
        for (int j = 0; j <= (v2.length - 1); j++) {
            System.out.print(v2[j]);
            if (j < (v2.length - 1))
            System.out.print(", ");
            else {
                    System.out.println();
                }
        }
        System.out.println("Vector 3");
        for (int j = 0; j <= (v3.length - 1); j++) {
            System.out.print(v3[j]);
            if (j < (v3.length - 1))
            System.out.print(", ");
            else {
                System.out.println();
            }
        }
        System.out.println("Vector 4");
        for (int j = 0; j <= (v4.length - 1); j++) {
            System.out.print(v4[j]);
            if (j < (v4.length - 1))
            System.out.print(", ");
            else {
                    System.out.println();
                }
        }
        scanner.close();
    }
}
