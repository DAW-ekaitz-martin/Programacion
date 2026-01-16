public class E2 {
    public static void main(String[] args) {
        //int[][] matriz = {{1,1,1,1}, {0,1,1,1}, {0,0,1,1}, {0,0,0,1}};
        int[][] matriz = {{1,0,0,0},{1,1,0,0},{1,1,1,0},{1,1,1,1}};
        if (triangular_superior(matriz))
            System.out.println("La matriz es triangular superior");
        else {
            if (triangular_inferior(matriz))
                System.out.println("La matriz es triangular inferior");
            else
                System.out.println("La matriz no es ni triangular superior ni inferior");
        }
            
    }
    public static boolean triangular_superior(int[][] matriz) {
        boolean triangular_superior = true;
        for (int i = 1; i <= matriz.length-1; i++) {//Empiezo desde 1 porque la primera fila no me interesa, deben ser todos distintos de cero.
            for (int j = 0; j < i; j++) { // 
                if (matriz[i][j] != 0)
                    triangular_superior = false;
            }
        }
        return triangular_superior;
    }
    public static boolean triangular_inferior(int[][] matriz) {
        boolean triangular_inferior = true;
        for (int i = matriz.length-2; i >= 0 ; i--) {//Empiezo desde 1 porque la primera fila no me interesa, deben ser todos distintos de cero.
            for (int j = matriz[0].length-1; j > i; j--) { // 
                if (matriz[i][j] != 0)
                    triangular_inferior = false;
            }
        }
        return triangular_inferior;
    }
}
