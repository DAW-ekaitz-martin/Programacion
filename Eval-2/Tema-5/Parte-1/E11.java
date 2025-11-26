public class E11 {
    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 5};
        boolean ascendente = true;
        for (int i = 1; i <= (n.length-1); i++) {
            if (n[i] <= n[i-1]) {
                ascendente = false;
                break;
            }
        }
        if (ascendente) {
            System.out.println("El array está en orden ascendente");
        }
        else {
            System.out.println("El array NO está en orden ascendente");
        }
    }
}
