public class E3 {
    public static void main(String[] args) {
        //1,5/1,5
        for (int i = 2; i <= 100; i++) {
            int gemelo = i + 2;
            int cont_i = 0;
            int cont_gemelo = 0;
            for (int j = 1; j <= i; j ++) {
                if (i % j == 0) {
                    cont_i ++;
                }
            }
            if (cont_i == 2) {
                for (int k = 1; k <= gemelo; k++) { //podría hacerse más eficiente guardando el anterior primo y viendo si distan 2 unidades
                    if (gemelo % k == 0) {
                        cont_gemelo ++;
                    }
                }
                if (cont_gemelo == 2) {
                    System.out.println("("+ i +", " + gemelo + ")");
                }
            }
        }
    }
}
