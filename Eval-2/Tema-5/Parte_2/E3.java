public class E3 {
    public static void main(String[] args) {
        int numero_a_comprobar = 4;
        int[] n = {5,6,4,4,9};
        int[] n2 = ocurrencia(n.clone(), numero_a_comprobar);
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
    public static int[] ocurrencia(int[] n, int numero) {
        for (int i = 0; i <= n.length-1; i++) {
            if (n[i] == numero)
                n[i] = 0;
        }
        return n;
    }
}
