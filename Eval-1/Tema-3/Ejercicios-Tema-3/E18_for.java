public class E18_for {
    public static void main(String[] args) {
        for (int h = 0; h <= 23 ; h++) {
            for (int m = 0; m < 60; m ++) {
                for (int s = 0; s < 60; s++) {
                    System.out.println(h + ":" + m + ":" + s);
                }
            }
        }
    }
}
