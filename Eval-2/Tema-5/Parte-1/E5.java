public class E5 {
    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 5};
        int[]n2 = new int[5];
        for (int i = 0; i <= 4; i ++) {
            if (n[i] % 2 != 0) {
                n2[i] = n[i] + 1;
            }
            else {
                n2[i] = n[i];
            }
        }
        System.out.println("Vector 1");
        for (int i = 0; i <= 4; i++) {
            System.out.println("posición " + i + ": " + n[i]);
        }
        System.out.println("Vector 2");
        for (int i = 0; i <= 4; i++) {
            System.out.println("posición " + i + ": " + n2[i]);
        }
        /*for (int i = 0; i <= 4; i ++) {
            n2[i] = n[i];
            if (n2[i] % 2 != 0) {
                n2[i] = n2[i] + 1;
            }
        }
        System.out.println("Vector 1");
        for (int i = 0; i <= 4; i++) {
            System.out.println("posición " + i + ": " + n[i]);
        }
        System.out.println("Vector 2");
        for (int i = 0; i <= 4; i++) {
            System.out.println("posición " + i + ": " + n2[i]);
        }*/
    }
}
