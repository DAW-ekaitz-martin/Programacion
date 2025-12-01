public class E9 {
    public static void main(String[] args) {
        int[] n = new int[20];
        int[] n2 = ordenar(n.clone());

        for (int i = 0; i <= n2.length-1; i++) {
            System.out.print(n2[i]);
            if (i < n2.length-1)
                System.out.print(", ");
            else
                System.out.println();
        }
    }
    public static int[] ordenar(int[] n) {
        //Posiciones en las que he almacena el último número par/impar
        int cont_drc = 0;
        int cont_izq = 0;
        for (int i = 0; i <= n.length-1; i++) {
            int numero = (int)(Math.random() * 100);
            //System.out.println("DEBUG NUMERO=>" + numero);
            if (numero % 2 == 0) {
                n[cont_drc] = numero;
                cont_drc++;
            }
            else {
                n[n.length-1-cont_izq] = numero;
                cont_izq++;
            }
        }
        return n;
    }
}
