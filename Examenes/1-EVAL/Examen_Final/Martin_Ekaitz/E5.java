public class E5 {
    public static void main(String[] args) {
        int n = 100;
        int resto;
        String resultado = "";
        String str;
        while (n >= 1) {
            resto = n % 2;
            str = resto + "";
            resultado = str + resultado;
            n /= 2;
        }
        System.out.println("Resultado=> " + resultado);
    }

}
