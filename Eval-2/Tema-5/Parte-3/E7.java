import java.util.Scanner;
public class E7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Primero averiguo las filas que he de cambiar
        System.out.print("Introduzca una fila: ");
        int indice_1 = scanner.nextInt();
        System.out.print("Introduzca otra fila: ");
        int indice_2 = scanner.nextInt();
        int[][] matriz = {{1,2,3}, {4,5,6}, {7,8,9}, {10, 11, 12}, {14, 15, 16}, {17, 18, 19}};
        int[][] matriz_2 = matriz.clone();
        //Obtengo la primera fila
        int[] primera_fila = obtener_fila(matriz, indice_1);
        //Obtengo la segunda fila
        int[] segunda_fila = obtener_fila(matriz, indice_2);
        //Intercambiar las filas
        intercambiar_filas(matriz_2, indice_1, indice_2, primera_fila, segunda_fila);
        imprimir_matriz(matriz_2);
        scanner.close();
    }
    public static int[][] intercambiar_filas(int[][] matriz_2, int indice_1, int indice_2, int[] primera_fila, int[] segunda_fila) {
        for (int i = 0; i <= matriz_2.length-1; i++) {
            for (int j = 0; j <= matriz_2[0].length-1; j++) {
                if (i == indice_1) {
                    matriz_2[i][j] = segunda_fila[j];
                }
                if (i == indice_2) {
                    matriz_2[i][j] = primera_fila[j];
                }
            }
        }
        return matriz_2;
    }
    public static void imprimir_matriz(int[][] matriz) {
        for (int i = 0; i <= matriz.length-1; i++) {
            for (int j = 0; j <= matriz[0].length-1; j++) {
                System.out.print(matriz[i][j]); 
                if (j < matriz[0].length-1)//Ahora mismo da igual si poner "j < matriz.length-1" o "j < matriz[0].length-1", ya que tiene el mismo numero de filas que de columnas, pero en otras ocasiones, lo que me interesa es el número de columnas.
                    System.out.print(", ");
                
            }
            System.out.println();
        }
    }
    public static int[] obtener_fila(int [][] matriz, int fila_1) {
        int[] array = new int[matriz[0].length];
        for(int i = 0; i <= matriz[0].length-1; i++) {
            array[i] = matriz[fila_1][i];
        }
        return array;
    }
}
