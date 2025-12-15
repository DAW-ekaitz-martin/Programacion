public class E12 {
    public static void main(String[] args) {
        int[][] matriz = {{1,2,3}, {2,5,6}, {10,8,9}};
        //int[][] matriz = {{1,4}, {3,2}};
        if(punto_de_silla(matriz))
            System.out.println("La matriz tiene punto de silla");
        else
            System.out.println("La matriz NO tiene punto de silla");
    }
    public static boolean punto_de_silla(int[][] matriz) {
        boolean tiene_punto_de_silla = false;
        for (int i = 0; i <= matriz.length-1; i++) {
            for (int j = 0; j <= matriz[0].length-1; j++) {
                int num = matriz[i][j];
                boolean menor_de_la_fila = true;
                //Compruebo si es el menor de su fila
                for (int k = 0; k <= matriz[0].length-1; k++) {
                    if (num > matriz[i][k]) {
                        menor_de_la_fila = false;
                        break;
                    }
                    
                }
                System.out.println("NUMERO=>"+ num);
                System.out.println("MENOR DE LA FILA=>"+ menor_de_la_fila);
                //Pongo un if para que no compruebe que sea el mayor de la columna sin ser el menor de la fila.
                if(menor_de_la_fila) {
                    boolean mayor_de_la_columna = true;
                    for (int l = 0; l <= matriz.length-1; l++) {
                        if (num < matriz[l][j]) {
                            mayor_de_la_columna = false;
                            break;
                        }
                    }
                    System.out.println("MAYOR DE LA COLUMNA=>"+ mayor_de_la_columna);
                    if (mayor_de_la_columna && menor_de_la_fila) {
                        tiene_punto_de_silla = true;
                    }

                }  
            }
        }
        return tiene_punto_de_silla;
    }
}
