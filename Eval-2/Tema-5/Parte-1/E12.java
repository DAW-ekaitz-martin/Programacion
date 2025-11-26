public class E12 {
    public static void main(String[] args) {
        int[] fibovector = new int[20];
        int a = 0;
        int b = 1;
        fibovector[0] = a;
        fibovector[1] = b;
        for (int i = 2; i <= (fibovector.length - 1); i++) {
            fibovector[i] = a + b;
            a = b;
            b = fibovector[i];
        }
        for (int i = 0; i <= (fibovector.length - 1); i++) {
            System.out.println(fibovector[i]);
        }
    }
}
