public class E2 {
    public static void main(String[] args) {
        //Bien, 1,25/1,5
        int num = 28;
        int aux = num;
        int divisor = 2;

        System.out.println("Los divisores del "+ num +  " son: ");
        while (aux > 1) {
            if (aux % divisor == 0) {
                System.out.println(aux + "|" + divisor);
                //System.out.println("DIVISOR=> " + divisor);
                aux /= divisor;
                divisor = 2; /* Esto no es necesario. Probarás con el 2 tantas veces como puedas, y sólo pasas al siguiente
                cuando ya no puedes volver a dividir entre 2.                Volver al 2 lo hace más ineficiente. */
            }
            else {
                divisor ++;
            }
            
        }
        System.out.println(aux);

    }
}
