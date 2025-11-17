public class E23 {
    public static void main(String[] args) {
        int y = 0;

        int color = 0;
        while (y < 8) {
            int x = 0;
            //Como voy a escribir dos caracteres cada iteración, el bucle será hasta 4, no 8.
            while (x < 4) {
                //Determinar el comienzo de la fila anterior con la variable "color".
                if (color == 0) {
                    System.out.print("X");
                    System.out.print("-");
                    //Si es la última columna, pasamos a la siguiente
                    if (x == 3) {
                        System.out.print("\n");
                    }
                    x ++;
                }

                else if (color == 1) {
                    System.out.print("-");
                    System.out.print("X");
                    if (x == 3) {
                        System.out.print("\n");
                    }
                    x ++;
                }
            }
            //Cambiar la variable de comienzo cada vez que se pinte una línea.
            if (color == 0) {
                color = 1;
            }
            else {
                color = 0;
            }
            y ++;
        }
    }
}
