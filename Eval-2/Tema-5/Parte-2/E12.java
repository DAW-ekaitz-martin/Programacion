public class E12 {
    public static void main(String[] args) {
        String frase = "hola que tal";
        char[] array = frase.toCharArray();
        int cont_palabras = contar_palabras(array);
        System.out.println("La frase tiene " + cont_palabras + " palabras");
    }
    public static int contar_palabras(char[] frase) {
        int cont_palabras = 0;
        if (frase[0] != ' ')
                cont_palabras++;
        for (int i = 0; i <= frase.length-1; i++) {
            if (frase[i] == ' ') {
                cont_palabras ++;
            }
        }
        return cont_palabras;
    }
}
