public class E29 {
    public static void main(String[] args) {

        for (int i = 1; i <= 30000; i++) {
            int suma_i = 0;
            for (int j= 1; j < i ; j++) {
                if (i % j == 0) {
                    
                    suma_i += j;
                }
            }
            for (int k = i + 1; k <= 30000; k++) {
                int suma_k = 0;
                for (int l = 1; l < k; l++) {
                    if (k % l == 0) {
                        suma_k += l;
                    }
                }
                if (suma_i == k && suma_k == i) {
                    System.out.println("Para amigo: " + i + " ; " + k);
                }
            }
        }
    }
}
