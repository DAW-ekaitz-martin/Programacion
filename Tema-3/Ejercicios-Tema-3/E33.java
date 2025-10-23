public class E33 {
    public static void main(String[] args) {
        //El radio del círculo
        final int RADIO = 10;
        //A la hora de calcular la media lo haré dividiendo el total de pasos entre 100 iteraciones que se han llevado acabo
        final int ITERACIONES = 100;
        int i = 0;
        int suma_pasos = 0;
        while (i < ITERACIONES) {
            //Esta variable registrará el movimiento del borracho
            int pasos = 0;
            int x = 0;
            int y = 0;

            double distancia = 0;
            //La dirección a la que dará cada paso
            while (distancia < RADIO) {
                int paso = (int)(Math.random() * 4);
                switch (paso) {
                    case 0 -> {
                        x ++; // derecha
                    }
                    case 1 -> {
                        x --; // izquierda
                    }
                    case 2 -> {
                        y ++; //arriba
                    }
                    case 3 -> {
                        y --; // abajo
                    }
                }
                pasos ++;
                distancia = Math.sqrt(Math.pow(x,2)+ Math.pow(y,2));  
            }
            suma_pasos += pasos;
            i ++;
        }
        double total_pasos = (double)suma_pasos / ITERACIONES;
        System.out.println("El borracho ha necesitado una media de " + total_pasos + " pasos para salir del círculo");
    }
}
