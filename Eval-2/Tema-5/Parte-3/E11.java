public class E11 {
    public static void main(String[] args) {
        int[][] matriz = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] matriz_2 = {{1,2,3}, {4,5,6}, {7,8,9}};
        if (comprobar_longitud(matriz, matriz_2)) {
            int[][] matriz_3 = new int[matriz.length][matriz[0].length];
            suma_de_matrices(matriz, matriz_2, matriz_3);
            imprimir_matriz(matriz_3);
        } 
        else
            System.out.println("Las matrices tienen distintas dimesiones");
    }
    public static void imprimir_matriz(int[][] matriz) {
        for (int i = 0; i <= matriz.length-1; i++) {
            for (int j = 0; j <= matriz[0].length-1; j++) {
                System.out.print(matriz[i][j]);
                if (j < matriz[0].length-1)
                    System.out.print(", ");
                else
                    System.out.println();
            }
        }
    }
    public static boolean comprobar_longitud(int[][] matriz, int[][] matriz_2) {
        boolean misma_longitud = true;
        if (matriz.length != matriz_2.length || matriz[0].length != matriz_2[0].length)
            misma_longitud = false;
        return misma_longitud;
    }
    public static int[][] suma_de_matrices(int[][] matriz, int [][] matriz_2, int[][] matriz_3) {
        for (int i = 0; i<= matriz.length-1; i++) {
            for (int j = 0; j<= matriz[0].length-1; j++) {
                matriz_3[i][j] = matriz[i][j] + matriz_2[i][j];
            }
        }
        return matriz_3;
    }
}
