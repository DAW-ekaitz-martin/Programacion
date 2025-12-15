public class E15 {
    public static void main(String[] args) {
        String cadena_1 = "Hola que tal";
        String cadena_2 = "Hola que tal";
        char[] array_1 = cadena_1.toCharArray();
        char[] array_2 = cadena_2.toCharArray();
        if (iguales(array_1, array_2))
            System.out.println("Las cadenas son iguales");
        else
            System.out.println("Las cadenas son distintas");
    }
    public static boolean iguales(char[] array_1, char[] array_2) {
        boolean iguales = true;
        for (int i = 0; i <= array_1.length-1; i++) {
            if (array_1[i] != array_2[i]) {
                iguales = false;
                break;
            }
        }
        return iguales;
    }
}
