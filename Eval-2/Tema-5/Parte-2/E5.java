public class E5 {
    public static void main(String[] args) {
        int[] n = new int[100];
        int [] n2 = primos(n.clone());
        for (int i = 0; i <= n2.length-1; i++) {
            System.out.print(n2[i]);
            if (i < n2.length-1)
                System.out.print(", ");
            else
                System.out.println();
        }
    }
    public static int[] primos(int[] n) {
        int num = 2;
        //Hay que recorrer todas la posiciones del array
        for (int i = 0; i <= n.length-1; i++) {
            //Tengo que generar suficientes números como para encontrar 100 números primos(seguro que se puede hacer más eficiente)
            for (int k = num; k <= 1000000; k++) {
                //Inicializo la variable aqui para que siempre parta en true, sino, a la que encuentre un número que no sea primo, se quedaría en falso de por vida.
                boolean primo = true;
                //Compruebo que sea primo
                for (int j = 2; j < k; j++) {
                    if (k % j == 0) {
                        primo = false;
                        break;
                    }
                }
                //Para no perder el último número que he comprobado, lo guardo en una variable externa, sino tendría que empezar desde el 2 cada vez que encuentre un primo.
                if (primo) {
                    n[i] = k;
                    //K + 1 porque sino estaría comprobando el número 2 de por vida.
                    num = k + 1;
                    break;
                }
            }
        }
        return n;
    }
}
