public class E23 {
    public static void main(String[] args) {
        String cadena = "Hyla que twl";
        char[] array_1 = cadena.toCharArray();
        String cadena_2 = "Hola que tal";
        char[] array_2 = cadena_2.toCharArray();
        char[] array_3 = eliminar_repetidos(array_1, array_2);
        for (int h = 0; h <= array_3.length-1; h++) {
            System.out.print(array_3[h]);
            if (h != array_3.length-1)
                System.out.print(", ");
            else
                System.out.println("");
        }
    }
    public static char[] eliminar_repetidos(char[] array_1, char[] array_2) {
        char[] array_3 = new char[array_1.length];
        int j = 0;
        while (j <= array_1.length-1) {
            boolean aparece = false;
            int k = 0;
            while (k <= array_2.length-1) {
                if (array_1[j] == array_2[k]) {
                    aparece = true;
                    break;
                }
                k++;
            }
            //Si no aparece lo meto en el nuevo array.
            if (!aparece) {
                array_3[j] = array_1[j];
            }
            j++;
        }
        return array_3;
    }
}
