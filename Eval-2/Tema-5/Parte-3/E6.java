public class E6 {
    public static void main(String[] args) {
        int[][] matriz = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println("El valor máximo del array es " + valor_maximo(matriz));
        System.out.println("El valor mínimo del array es " + valor_minimo(matriz));
    }
    public static int valor_maximo(int[][] matriz) {
        int max = matriz[0][0];
        for (int i = 0; i <= matriz.length-1; i++) {
            for (int j = 0; j <= matriz[0].length-1; j++) {
                if(matriz[i][j] > max)
                    max = matriz[i][j];
            }
        }
        return max;
    }
    public static int valor_minimo(int[][] matriz) {
        int min = matriz[0][0];
        for (int i = 0; i <= matriz.length-1; i++) {
            for (int j = 0; j <= matriz[0].length-1; j++) {
                if(matriz[i][j] < min)
                    min = matriz[i][j];
            }
        }
        return min;
    }
}
