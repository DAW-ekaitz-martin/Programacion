public class E2 {
    public static void main(String[] args) {
        int[] n = {1,2,3,4,5};
        int[] n2 = invertir(n.clone());
        for (int i = 0; i <= (n2.length-1); i++) {
            System.out.print(n2[i]);
            if (i < n2.length-1) {
                System.out.print(", ");
            }
            else {
                System.out.println();
            }
        }
    }
    public static int[] invertir(int[] n) {
        for (int i = 0; i < n.length/2; i++) {
            n[i] = n[i] + n[n.length-1 - i];
            n[n.length-1 - i] = n[i] - n[n.length-1 - i];
            n[i] = n[i] - n[n.length-1 - i];
        }
        return n;
    }
}
