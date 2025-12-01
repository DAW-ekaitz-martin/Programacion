public class E1 {
    public static void main(String[] args) {
        int[] n = new int[49];
        for (int i = 0; i <= n.length-1; i++) {
            n[i] = i+1;
        }
        int[] n2 = new int[6];
        primitiva(n, n2);
        for (int i = 0; i <= (n2.length-1); i++) {
            System.out.print(n2[i]);
            if (i < n2.length-1) {
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
   public static int[] primitiva(int[] n, int[] n2) {
        for (int i = 0; i <= (n2.length-1); i++) {
            //La forma más eficiente es haciendo que el número generado de manera aleatoria sea la posición del array "n", no el número que quiero ingresar en "n2".
            //EL número a ingresar en el array "n2" es el que se encuentre el la posición random del array "n"
            int posicion = (int)(1 + Math.random()*((n.length-1)-i));
            //Añadimos al array "n2" el valor que se encuentra en la posición random del array "n".
            n2[i] = n[posicion];
            //Importante cambiar las posiciones en el array "n", ya que al ir poniendolos en la última posición del array "n" y al ir restando el rango de posiciónes posibles del random(restando "i"), me aseguro que el número que acaba de salir no lo vuelva a hacer
            //Ya que lo pongo en la última posición(n[48]) y resto "i" al rango posible del random(ahora será de n[0] a n[47] porque he restado una posición posible), al encontrarse el número que acaba de salir en última posición, me aseguro de que no vuelve a salir
            n[posicion] = n[posicion] + n[(n.length-1)-i];
            n[n.length-1] = n[posicion] - n[(n.length-1)-i];
            n[posicion] = n[posicion] - n[(n.length-1)-i];
        }
       return n2;
    }
}
