public class E10 {
    public static void main(String[] args) {
        int[][] matriz = new int[6][6];
        rellenar_derecha(matriz);
        rellenar_izquierda(matriz);
        imprimir_matriz(matriz);
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
    //Esta función rellena la matriz desde la diagonal principal hacia arriba a la derecha
    public static int[][] rellenar_derecha(int[][] matriz) {
        int i = 0;
        int columna = 0;
        while (i <= matriz[0].length-1) {
            int fila = 0;
            int j = i;
            while (j <= matriz.length-1) {
                matriz[fila][columna] = i + 1;
                fila ++;
                columna ++;
                j ++;
            }
            i ++;
            columna = i;
        }
        return matriz;
    }
    //Esta función rellena la matriz desde la diagonal principal hacia abajo a la izquierda
    public static int[][] rellenar_izquierda(int[][] matriz) {
        int i = 1;
        int fila = 1;
        while (i <= matriz[0].length-1) {
            int columna = 0;
            int j = i;
            while (j <= matriz.length-1) {
                matriz[fila][columna] = i + 1;
                fila ++;
                columna ++;
                j ++;
            }
            i ++;
            fila = i;
        }
        return matriz;
    }
}
