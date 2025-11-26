public class E8 {
    public static void main(String[] args) {
        int[] n = new int[10];
        int i = 0;
        int j = 2;
        while (i <= (n.length-1)) {
            while (j <= 100) {
                if (j % 2 == 0) {
                    n[i] = j;
                    j ++;
                    break;
                }
                j++;
            }
            System.out.println(n[i]);
            i++;
        }


    }
}
