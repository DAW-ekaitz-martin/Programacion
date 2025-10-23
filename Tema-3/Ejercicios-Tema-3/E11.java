public class E11 {
    public static void main(String[] args) {
        int num = 1;
        while (num <= 9) {
            for (int i = 0; i <= 10; i ++) {
                System.out.println(num +" x " + i + " = " + num * i);
            }
            num ++;
        }
    }
}
