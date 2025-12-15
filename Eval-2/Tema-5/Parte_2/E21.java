public class E21 {
    public static void main(String[] args) {
        String cadena = "Anita lava la tina";
        char[] array_1 = cadena.toCharArray();
        char[] array_2 = new char[array_1.length];
        array_2 = invertir(array_1, array_2);
        //Para quitarme de líos, convierto las dos cadenas todo a mayúsculas, así evito errores de case sensitive
        array_1 = toupper(array_1);
        array_2 = toupper(array_2);
        for (int i = 0; i <= array_1.length-1; i++) {
            System.out.print(array_1[i]);
            if (i != array_1.length-1)
                System.out.print(", ");
            else
                System.out.println("");
        }
        for (int i = 0; i <= array_2.length-1; i++) {
            System.out.print(array_2[i]);
            if (i != array_2.length-1)
                System.out.print(", ");
            else
                System.out.println("");
        }
        if (palindroma(array_1, array_2))
            System.out.println("La cadena es palindroma");
        else 
            System.out.println("La cadena NO es palindroma");
    }
    public static boolean palindroma(char[] array_1, char[] array_2) {
        boolean palindromo = true;
        int i = 0;
        int j = 0;
        while (i <= array_1.length-1) {
            //Ignoro espacios, si me encuentro alguno, adelanto posición
            while (array_1[i] == 32)
                i ++;
            while (array_2[j] == 32)
                j++;
            if (array_1[i] != array_2[j]) {
                palindromo = false;
                break;
            }
            i++;
            j++;
        }
        return palindromo;
    }
    public static char[] toupper(char[] array) {
        for (int i = 0; i <= array.length-1; i++) {
            if (array[i] >= 97 && array[i] <= 122)
                //Es resta, porque las mayúscula vienen antes que las minúsculas
                array[i] -= 32;
        }
        return array;
    }
    public static char[] invertir(char[] array_1, char[] array_2) {
        int i = array_1.length-1;
        int j = 0;
        while (j <= array_2.length-1) {
            array_2[j] = array_1[i];
            i--;
            j++;
        }
        return array_2;
    }
}
