import java.util.Scanner;
public class E1 {
    public static void main(String[] args) {
    
        int [][] matriz = new int[3][3];
        rellenar(matriz);
        imprimir(matriz);
        suma_fila(matriz);
        suma_columna(matriz);
    }
    public static int[][] rellenar(int[][] matriz) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <= matriz.length-1; i++) {
            for (int j = 0; j <= matriz[0].length-1; j++) {
                System.out.print("Ingrese un número: ");
                int numero = scanner.nextInt();
                matriz[i][j] = numero;
            }
        }
        scanner.close();
        return matriz;
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
    public static void suma_fila(int[][] matriz) {
        for (int i = 0; i <= matriz.length-1; i++) {
            int suma = 0;
            for (int j = 0; j <= matriz[0].length-1; j++) {
                suma+=matriz[i][j];
            }
            System.out.println("La suma de la fila " + i + " es: " + suma);
        }
    }
    public static void suma_columna(int[][] matriz) {
        for (int i = 0; i <= matriz.length-1; i++) {
            int suma = 0;
            for (int j = 0; j <= matriz[0].length-1; j++) {
                suma+=matriz[j][i];
            }
            System.out.println("La suma de la columa " + i + " es: " + suma);
        }
    }
}
