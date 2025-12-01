public class E4 {
    public static void main(String[] args) {
        int [] n = new int[10];
        int mayor = 0;
        for (int i = 0; i <= (n.length-1); i ++) {
            n[i] =(int)( 1 + Math.random() * 100);
            if (n[i] > mayor) {
                mayor = n[i];
            }
            System.out.println(n[i]);
        }
        System.out.println("El número más grande es el " + mayor);
    }
}
