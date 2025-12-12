public class E5 {
    public static void main(String[] args) {
        int[][] matriz = {{1,2,3}, {3,4,5}, {6,7,8}};
        int[][] matriz_2 = {{1,2,3}, {3,4,5}, {6,7,8}};
        if(iguales(matriz, matriz_2))
            System.out.println("Las matrices son iguales");
        else
            System.out.println("Las matrices NO son iguales");
    }
    public static boolean iguales(int[][] matriz, int[][] matriz_2) {
        boolean iguales = true;
        for (int i = 0; i <= matriz.length-1; i++) {
            for (int j = 0; j <= matriz[0].length-1; j++) {
                if (matriz[i][j] != matriz_2[i][j]) {
                    iguales = false;
                    break;
                }
            }
        }
        return iguales;
    }
}
