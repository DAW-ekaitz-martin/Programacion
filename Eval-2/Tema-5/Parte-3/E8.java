public class E8 {
    public static void main(String[] args) {
        int[][] matriz = new int[6][6];
        rellenar(matriz);
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
    public static int[][] rellenar(int[][] matriz) {
        for (int i = 0; i <= matriz.length-1; i++) {
            for (int j = 0; j <= matriz[0].length-1; j++) {
                matriz[i][j] = i + 1;
            }
        }
        return matriz;
    }
}
