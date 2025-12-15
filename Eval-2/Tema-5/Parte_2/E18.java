public class E18 {
    public static void main(String[] args) {
        String cadena = "Holaa quee taaaal";
        char[] array = cadena.toCharArray();
        repeticion(array);
    }
    public static void repeticion(char[] array) {
        char caracter = array[0];
        int contador_1 = 0;
        for (int i = 0; i <= array.length-1; i ++) {
            char caracter_2 = array[i];
            int contador_2 = 0;
            for (int j = 0; j <= array.length-1; j++) {
                if (caracter_2 == array[j])
                contador_2 ++;
            }
            if (contador_1 < contador_2) {
                contador_1 = contador_2;
                caracter = caracter_2;
            }
            
            
        }
        System.out.println("El caracter que más se repite es la : " + caracter);
        System.out.println("Se repite: " + contador_1 + " veces");
    }
}
