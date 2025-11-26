public class E2 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("El resultado es: " + suma(n));
    }
    public static int suma(int n) {
        if (n == 1) {
            return n;
        }
        return suma(n - 1) + n;
    }
}
