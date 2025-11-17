public class E34 {
    public static void main(String[] args) {
        final int LIMITE = 10000000;
        int dentro = 0;
        for (int i = 0; i <= LIMITE; i++) {
            double x = Math.random();
            double y = Math.random();
            if (Math.pow(x,2) + Math.pow(y,2) <= 1){
                dentro ++;
            }
        }
        double pi = (double)4 * (double)dentro / LIMITE;
        System.out.println("El valor de PI es: " + pi);

        

    }
}
