public class E10 {
    public static void main(String[] args) {
        int[] n = {-2, 3, 4, -7, -9, 5, 9, 0};
        int contador_positivos = 0;
        int contador_negativos = 0;
        for (int i = 0; i <= (n.length-1); i++) {
            if (n[i] < 0) {
                contador_negativos ++;
            }
            else if (n[i] > 0) {
                contador_positivos ++;
            }
        }
        System.out.println("Hay " + contador_positivos + " números positivos");
        System.out.println("Hay " + contador_negativos + " números negativos");
    }
}
