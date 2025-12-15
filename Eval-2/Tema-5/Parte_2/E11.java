public class E11 {
    public static void main(String[] args) {
        char[] array = {'h', ' ', 'o', 'l', ' ', 'a'};
        char[] array2 = new char[array.length];
        System.out.println(array);
        array2 = eliminar(array, array2);
        System.out.println(array2);
    }
    public static char[] eliminar(char[] array, char[] array2) {
        for (int i = 0; i <= array.length-1; i++) {
            if (array[i] != ' ') {
                array2[i] = array[i];
            }
        }
        return array2;
    }
}
