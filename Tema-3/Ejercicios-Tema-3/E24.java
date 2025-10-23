public class E24 {
    public static void main(String[] args) {
        int n = 5;

        int valor = 0;
        
        int k = 0;
        while (valor <= n) {
            int espacios = n - k;
            while (espacios > 0) {
                System.out.print(" ");
                espacios --;
            }
            k ++;

            int i = 1;
            int j = valor - 1;
            while (i <= valor) {
                System.out.print(i);
                i ++;
            }
            while (j >= 1) {
                System.out.print(j);
                j--;
            }
            valor ++;
            System.out.print("\n");
        }
        
    }
}
