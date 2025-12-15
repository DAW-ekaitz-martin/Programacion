public class E16 {
    public static void main(String[] args) {
        String cadena_1 = "Hola que tal";
        String cadena_2 = "Hola que tal";
        char [] array_cadena_1 = cadena_1.toCharArray();
        char [] array_cadena_2 = cadena_2.toCharArray();
        char[] array_general = new char[cadena_1.length() + cadena_2.length()];
        array_general = juntar_arrays(array_general, array_cadena_1, array_cadena_2);
        for (int i = 0; i <= array_general.length-1; i++) {
            System.out.print(array_general[i]);
            if (i != array_general.length-1)
                System.out.print(", ");
            else
                System.out.println("");
        }
    }
    public static char[] juntar_arrays(char[] array_general, char [] array_cadena_1, char [] array_cadena_2) {
        int i = 0;
        int j = 0;
        while (i <= array_general.length-1) {
            while (j <= array_cadena_1.length-1) {
                array_general[i] = array_cadena_1[j];
                i++;
                j++;
            }
            j = 0;
            while (j <= array_cadena_2.length-1) {
                array_general[i] = array_cadena_2[j];
                i++;
                j++;
            }
        }
        return array_general;
    }
}
