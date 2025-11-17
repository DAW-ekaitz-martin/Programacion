public class E2 {
    public static void main(String[] args) {
        int num = 28;
        int aux = num;
        int divisor = 2;

        System.out.println("Los divisores del "+ num +  " son: ");
        while (aux > 1) {
            if (aux % divisor == 0) {
                System.out.println(aux + "|" + divisor);
                //System.out.println("DIVISOR=> " + divisor);
                aux /= divisor;
                divisor = 2;
            }
            else {
                divisor ++;
            }
            
        }
        System.out.println(aux);

    }
}
