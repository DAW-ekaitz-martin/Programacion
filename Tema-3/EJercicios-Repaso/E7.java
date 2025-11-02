public class E7 {
    public static void main(String[] args) {
        int suma;
        double digit;
        int aux;
        int cont;
        for (int i = 100; i <= 999999; i++) {
            //Inicializo la suma a 0 y el valor de aux cada vez que cambie el valor de 'i' en cada iteración
            suma = 0;
            aux = i;
            //System.out.println("DEBUG aux=>" + aux);
            if (i >= 100 && i < 1000) {
                cont = 3;
            }
            else if (i >= 1000 && i < 10000) {
                cont = 4;
            }
            else if (i >= 10000 && i < 100000) {
                cont = 5;
            }
            else {
                cont = 6;
            }
            //Bucle para calcular el valor de  la suma de sus propios dígitos, elevados a la potencia del número de dígitos que tienen
            for (int k = 0; k < cont; k++) {
                digit = Math.pow((aux % 10), cont);
                suma += digit;
                aux /= 10;
                /*System.out.println("DEBUG DIGIT=>" + digit);
                System.out.println("DEBUG SUMA=>" + suma);
                System.out.println("DEBUG I=>" + i);*/
            }
            if (i == suma) {
                System.out.println("El número " + i + " cumple la condición de Armstrong");
            }
        }
    }
}
