import java.util.Scanner;
public class E2 {
    public static void main(String[] args) {
        int [][] matriz = new int[4][4];
        rellenar(matriz);
        imprimir(matriz);
        restar(matriz);
        imprimir(matriz);
    }
    public static void rellenar(int[][] matriz) {
        for (int i = 0; i <= matriz.length-1; i++) {
            for (int j = 0; j <= matriz[0].length-1; j++) {
                matriz[i][j] = (int)(1 + Math.random() * 9);
            }
        }
    }
    public static void imprimir(int[][] matriz) {
        for (int i = 0; i <= matriz.length-1; i++) {
            for (int j = 0; j <= matriz[0].length-1; j++) {
                System.out.print(matriz[i][j]); 
                if (j < matriz[0].length-1)//Ahora mismo da igual si poner "j < matriz.length-1" o "j < matriz[0].length-1", ya que tiene el mismo numero de filas que de columnas, pero en otras ocasiones, lo que me interesa es el número de columnas.
                    System.out.print(", ");
                
            }
            System.out.println();
        }
    }
    public static void restar(int[][] matriz) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la resta que quiere hacerle a cada número: ");
        int numero = scanner.nextInt();
        for (int i = 0; i <= matriz.length-1; i++) {
            for (int j = 0; j <= matriz[0].length-1; j++) {
                matriz[i][j] -= numero;
            }
        }
        scanner.close();
    }

}
