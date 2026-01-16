public class E15 {
    public static void main(String[] args) {
        int[][] matriz = {{2, 4, 40}, {1, 1, 15}};
    }
    public static int[][] dividir(int[][] matriz) {
        for (int i = 1; i<= matriz.length-1; i++) {
            for(int j = 0; j <= matriz[0].length-1; j++) {
                //Divido entre sí mismo al primer elemento para tener un 1 en la ecuación de abajo
                matriz[i][j] = matriz[i][j] / matriz[1][0];
            }
        }
        return matriz;
    }
    //Ahora multiplico matriz[1][0] por matriz[0][0] para quitarme una incógnita
    public static int[][] multiplicar(int[][] matriz) {
        for (int i = 1; i<= matriz.length-1; i++) {
            for(int j = 0; j <= matriz[0].length-1; j++) {
                matriz[i][j] = matriz[i][j] * matriz[0][0];
            }
        }
        return matriz;
    }
    //Ahora resto los elementos de las dos filas
    public static int[][] restar(int[][] matriz) {
        for (int i = 1; i<= matriz.length-1; i++) {
            for(int j = 0; j <= matriz[0].length-1; j++) {
                matriz[i][j] = matriz[i][j] - matriz[0][j];
            }
        }
        return matriz;
    }
}
