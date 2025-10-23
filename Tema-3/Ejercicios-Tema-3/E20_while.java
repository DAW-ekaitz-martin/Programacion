public class E20_while {
    public static void main(String[] args) {
        int num = 0;

        while (num <= 30000) {
            int suma = 0;
            int i = 1;
            while (i < num) {
                if (num % i == 0) {
                    suma += i;
                }
                i ++;
            }
            if (num == suma) {
                System.out.println(num);
            }
            num ++;
        }
    }
    
}
