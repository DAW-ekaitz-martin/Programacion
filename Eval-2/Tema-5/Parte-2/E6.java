public class E6 {
    public static void main(String[] args) {
        long[] n = new long[21];
        for (int i = 0; i <= n.length-1; i++) {
            n[i] = factorial(i);
            System.out.print(n[i]);
            if (i < n.length)
                System.out.print(", ");
            else
                System.out.println();
        }
    }
    public static long factorial(int numero) {
        if (numero == 0)
            return 1;
        if (numero == 1)
            return 1;
        return factorial(numero-1)*numero;
    }
}
