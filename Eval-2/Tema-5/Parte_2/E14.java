public class E14 {
    public static void main(String[] args) {
        String frase = "hola que hola tal ¿hola?";
        char[] array = frase.toCharArray();
        int contador_vocales = contar_vocales(array);
        System.out.println("La frase tiene " + contador_vocales + " vocales");
    }
    public static int contar_vocales(char[] array) {
        int contador_vocales = 0;
        for (int i = 0; i <= array.length-1; i++) {
            switch (array[i]) {
                case 'a', 'e', 'i', 'o', 'u' -> {
                    contador_vocales ++;
                }
            }
        }
        return contador_vocales;
    }
}
