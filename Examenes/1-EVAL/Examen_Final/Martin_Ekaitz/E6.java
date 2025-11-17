public class E6 {
    public static void main(String[] args) {
        int longitud = 1;

        while (longitud <= 30) {
            int caidas = 0;
            for (int i = 1; i <= 10000; i++) {
                int posicion = 0;
                int pasos = 0;
                while (pasos < longitud) {
                    int direccion = (int)(Math.random() * 3);
                    if (direccion == 0) {
                        posicion ++;
                    }
                    else if (direccion == 1) {
                        posicion --;
                    }
                    //Si no sale el 2, significa que ha dado un paso recto
                    pasos ++;
                    if (posicion > 2 || posicion < -2) {
                        caidas ++;
                        break;
                    }
                }  
                //System.out.println("INTENTO " + i);
                //System.out.println("Número de caidas hasta el momento: " + caidas);
            }
            double probilidad = (double) caidas / 10000;
            System.out.println("CON LONGITUD: " + longitud);
            System.out.println("La probabilidad de caerse es de: " + probilidad);
            if (probilidad < 0.5) {
                longitud ++;
            }
            else {
                System.out.println("La longitud experimental es: " + longitud);
                break;
            }
        }
        
    }
}
