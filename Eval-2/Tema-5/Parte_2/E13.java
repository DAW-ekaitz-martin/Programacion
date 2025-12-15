public class E13 {
    public static void main(String[] args) {
        String palabra_a_buscar = "hola";
        char[] array_a_buscar = palabra_a_buscar.toCharArray();
        String frase = "hola que hola tal ¿hola?";
        char[] array = frase.toCharArray();
        int veces = contador(array_a_buscar, array);
        System.out.println("La frase se repite " + veces + " veces");
    }
    public static int contador(char[] array_a_buscar, char[] array) {
        int contador = 0;
        for (int i = 0; i <= array.length-1; i++) {
            if (array[i] == array_a_buscar[0]) {
                boolean igual = true;
                for (int j = 0; j <= array_a_buscar.length-1; j++) {
                    if (array[i + j] != array_a_buscar[j]) {
                        igual = false;
                        break;
                    }
                }
                if(igual)
                    contador++;
            }
        }
        return contador;
    }
}
