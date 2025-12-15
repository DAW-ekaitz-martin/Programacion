public class E7 {
    public static void main(String[] args) {
        int[] n = {23, 17, 93, 11, 64, 36, 35};
        int[] n2 = ordenar(n.clone());
        for (int i = 0; i <= n2.length-1; i++) {
            System.out.print(n2[i]);
            if (i < n2.length-1)
                System.out.print(", ");
            else
                System.out.println();
        }
    }
    public static int[] ordenar(int[] n) {
        //Al poner el número más grande al final del todo en cada iteración, me puedo ahorrar comprobarlo en la siguiente, de ahí el  restarle "i" a "n.length-1". (n.length-1-i)
        for (int i = 0; i <= (n.length-1-i); i++) {
            for (int j = 0; j < n.length-1-i; j++){
                if (n[j] > n[j + 1]) {
                    n[j] = n[j] + n[j+1];
                    n[j+1] = n[j]-n[j+1];
                    n[j] = n[j]-n[j+1];
                }
                System.out.println("DEBUGG=> J:" + j);
            }

        }
        return n;
    }
}
