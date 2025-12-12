public class E4 {
    public static void main(String[] args) {
        int[][] matriz = {{1,2,3}, {3,4,5}, {6,7,8}};
        int[][] matriz_2 = new int[matriz.length][matriz[0].length];
        System.out.println("MATRIZ NORMAL");
        imprimir_matriz(matriz);
        trasponer_matriz(matriz, matriz_2);
        System.out.println("MATRIZ TRASPUESTA");
        imprimir_matriz(matriz_2);

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
    public static int[][] trasponer_matriz(int[][] matriz, int[][] matriz_2) {
        for (int i = 0; i <= matriz.length-1; i++) {
            for (int j = 0; j <= matriz[0].length-1; j++) {
                //System.out.println("DEBUG MATRIZ fila: " + i + " columna: " + j + " = " + matriz[i][j]);
                matriz_2[j][i] = matriz[i][j];
                //System.out.println("DEBUG MATRIZ_2 fila: " + j + " columna: " + i + " = " + matriz[j][i]);
            }
        }
        return matriz_2;
    }

    
}
