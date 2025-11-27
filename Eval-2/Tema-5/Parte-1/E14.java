public class E14 {
    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 5};
        for (int i = 0; i <= (n.length-1); i++) {
            int aux = n[i + 1];
            if (i < (n.length-1)) {
                n[i + 1] = n[i];
                 
            }
            if (i == 4) {
                n[0] = n[i];
            }
        }
        for (int i = 0; i <= (n.length-1); i++) {
            System.out.print(n[i]);
            if (i < (n.length-1))
                System.out.print(", ");
        }
    }
}
