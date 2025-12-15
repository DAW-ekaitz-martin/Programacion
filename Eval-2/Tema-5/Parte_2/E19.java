public class E19 {
    public static void main(String[] args) {
        String cadena = "HoLa qUe tAl";
        char[] array = cadena.toCharArray();
        array = toupper(array);
        System.out.println("ANTES");
        System.out.println(cadena);
        System.out.println("Después");
        for (int i = 0; i <= array.length-1; i++) {
            System.out.print(array[i]);
            if (i != array.length-1)
                System.out.print(", ");
            else
                System.out.println("");
        }
    }
    public static char[] toupper(char[] array) {
        for (int i = 0; i <= array.length-1; i++) {
            if (array[i] >= 97 && array[i] <= 122)
                //Es resta, porque las mayúscula vienen antes que las minúsculas
                array[i] -= 32;
        }
        return array;
    }
}
