public class E20 {
    public static void main(String[] args) {
        String cadena = "Hola que tal";
        char[] array_1 = cadena.toCharArray();
        char[] array_2 = new char[array_1.length];
        array_2 = invertir(array_1, array_2);
        System.out.println("ANTES");
        System.out.println(cadena);
        System.out.println("Después");
        for (int i = 0; i <= array_2.length-1; i++) {
            System.out.print(array_2[i]);
            if (i != array_2.length-1)
                System.out.print(", ");
            else
                System.out.println("");
        }
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
