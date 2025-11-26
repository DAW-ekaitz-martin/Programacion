public class E1 {
    public static void main(String[] args) {
        int n = 6;
        naturales(n);
    }
    public static void naturales(int n) {
        if (n == 1) {
            System.out.println("1");
        }
        else {
            System.out.println(n);
            naturales(n - 1);
        }
    }
}
