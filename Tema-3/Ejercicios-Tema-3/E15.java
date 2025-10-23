public class E15 {
    public static void main(String[] args) {
        int contador = 0;
        for (int i = 1; i <= 1000; i++) {
            
            for (int j = 1; j <= 1000; j++) {
                if (i % j == 0) {
                    contador ++;
                }
            }
            if (contador == 2) {
                System.out.print(i + ", ");
            }
            contador = 0;
        }
    }
}
