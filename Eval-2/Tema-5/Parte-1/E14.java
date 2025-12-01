public class E14 {
    public static void main(String[] args) {
        int[] n = {31, 2, 45, 107, 5};
        for (int i = (n.length-1); i > 0 ; i--) {
            n[i] = n[i] + n[i - 1];
            n[i - 1] = n[i] - n[i - 1];
            n[i] = n[i] - n[i - 1];
        }
        // En caso de querer mover los números hacia la izquierda:
        /*for (int i = 0; i < (n.length-1); i++) {
            n[i] = n[i] + n[i + 1];
            n[i + 1] = n[i] - n[i + 1];
            n[i] = n[i] - n[i + 1];
        }*/
        
        for (int i = 0; i <= (n.length-1); i++) {
            System.out.print(n[i]);
            if (i < (n.length-1))
                System.out.print(", ");
            if (i == (n.length-1))
                System.out.println("");
        }
    }
}
