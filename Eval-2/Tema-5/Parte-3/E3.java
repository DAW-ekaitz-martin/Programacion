public class E3 {
    public static void main(String[] args) {
        int[][] matriz = {{1,2,3}, {3,4,5}, {6,7,8}};
        imprimir_matriz(matriz);
        int[] diagonal_principal = guardar_diagonal_principal(matriz);
        System.out.println("DIAGONAL PRINCIPAL");
        imprimir_array(diagonal_principal);
        int[] diagonal_secundaria= guardar_diagonal_secundaria(matriz);
        System.out.println("DIAGONAL SECUNDARIA");
        imprimir_array(diagonal_secundaria);
        

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
    public static void imprimir_array(int[] array) {
        for (int i = 0; i <= array.length-1; i++) {
            System.out.print(array[i]); 
            if (i < array.length-1)//Ahora mismo da igual si poner "j < matriz.length-1" o "j < matriz[0].length-1", ya que tiene el mismo numero de filas que de columnas, pero en otras ocasiones, lo que me interesa es el número de columnas.
                System.out.print(", ");
            else
                System.out.println();
            
        }
    }
    public static int[] guardar_diagonal_principal(int[][] matriz) {
        int posicion = 0;
        int i = 0;
        int j = 0;
        int[] diagonal = new int[matriz[0].length];
        while(i <= matriz.length-1) {
            while (j <= matriz[0].length-1) {
                diagonal[posicion] = matriz[i][j];
                break;
            }
            posicion ++;
            i ++;
            j++;
        }
        return diagonal;
    }
    public static int[] guardar_diagonal_secundaria(int[][] matriz) {
        int posicion = 0;
        int i = 0;
        int j = matriz[0].length-1;
        int[] diagonal = new int[matriz[0].length];
        while(i <= matriz.length-1) {
            while (j >= 0) {
                diagonal[posicion] = matriz[i][j];
                break;
            }
            posicion ++;
            i ++;
            j--;
        }
        return diagonal;
    }
}
