public class E1 {
    public static void main(String[] args) {
        int[] n = new int[49];
        for (int i = 0; i < n.length-1; i++) {
            n[i] = i+1;
        }
        //n = primitiva(n);
        for (int i = 0; i <= (n.length-1); i++) {
            System.out.print(n[i]);
            if (i < n.length-1) {
                System.out.print(", ");
            }
            else {
                System.out.println("");
            }
        }
    }
    /*public static int[] primitiva(int[] n) {
        for (int i = 0; i <= (n.length-1); i++) {
            n[i] = (int)(1 + Math.random()*49);
            for (int j = 0; j < i; j++)
            {
                if (n[i] == n[j]) {
                    n[i] = (int)(1 + Math.random()*49);
                    break;
                }
            }
        }
        return n;
    }*/
   //De manera más eficiente:
   public static int[] primitiva(int[] n) {
        for (int i = 0; i <= (n.length-1); i++) {
            n[i] = (int)(1 + Math.random()*49);
            for (int j = 0; j < i; j++)
            {
                if (n[i] == n[j]) {
                    n[i] = (int)(1 + Math.random()*49);
                    break;
                }
            }
        }
        return n;
}
