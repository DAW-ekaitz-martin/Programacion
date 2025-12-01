public class E4 {
    public static void main(String[] args) {
        int[] n = {1,2,3,4,5,6,7,8,9,10};
        int n2 = suma_impar(n.clone());
        for (int i = 0; i <= (n.length-1); i++) {
            System.out.print(n[i]);
            if (i <= n.length-1) {
                System.out.print(", ");
            }
            else {
                System.out.println();
            }
        }
    }
    public static int suma_impar(int[] n) {
        int suma = 0;
        for (int i = 0; i <= n.length-1; i++) {
            if(i % 2 != 0) {
                suma += n[i];
            }
        }
        return suma;
    }

}
