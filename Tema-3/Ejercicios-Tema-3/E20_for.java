public class E20_for {
    public static void main(String[] args) {
        for (int i = 0; i <= 30000; i++) {
            //Recorro desde 0 hasta el número que estoy comprobando para sacar sus factores
            int suma = 0;
            for (int j = 1; j < i; j++)
            {
                if (i % j == 0) {
                    suma += j;
                }
            }
            if (suma == i) {
                System.out.println(i);
            }
        }
    }
}
