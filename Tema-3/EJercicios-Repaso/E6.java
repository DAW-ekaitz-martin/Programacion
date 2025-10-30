
public class E6 {
    public static void main(String[] args) {
        int n = 8;
        double resultado = 0;
        for (int i = 1; i <= n; i++) {
            resultado = (double)i / (i + 1);
        }
        System.out.println("El resultado de la serie es: " + resultado);
    }
}
