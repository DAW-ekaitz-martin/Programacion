public class E9 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            //Para no cambiar el valor del numero y poder mostrarlo al final
            int aux = i;
            //Contador para saber cuantos divisores tiene en total
            int cont_general = 0;
            //Contador para saber cuantos divisores son primos
            int cont_primos = 0;
            //Inicializo el divisor cada vez que cambie de numero, ya que quiero empezar por el mas pequeño siempre para poder descomponerlo
            int divisor = 2;
            while (aux != 1) {
                /*System.out.println("DEBUGG NUMERO antes de dividir=> " + aux);
                System.out.println("DEBUGG DIVISOR=> " + divisor);
                System.out.println("DEBUGG MODULO=> " + aux % divisor);*/
                if (aux % divisor == 0) {
                    //Contador para saber cuantos divisores tiene el divisor del propio numero, si solo hay 2, es primo 
                    int cont = 0;
                    for (int k = 1; k <= divisor; k++) {
                        if (divisor % k == 0) {
                            cont ++;
                        }
                    }
                    //Si el divisor del numero, solo tiene dos divisores, es primo, asi que añado 1 al contador de divisores primos del numero que estamos descomponiendo
                    if (cont == 2) {
                        cont_primos ++;
                    }
                    aux /= divisor;
                    divisor = 2;
                    //Necesito saber cuantos factores tiene el número, ya que si el número de factores totales y el número de factores primos es distinto, el numero no es semiprimo
                    cont_general ++;
                    /*System.out.println("DEBUGG NUMERO DESPUÉS DE DIVIDIR=> " + aux);
                    System.out.println("DEBUGG CONTADOR GENERAL=> " + cont_general);
                    System.out.println("DEBUGG CONTADOR PRIMOS=> " + cont_primos);*/

                }
                else {
                    //System.out.println("DEBUG ENTRAS A SUMAR DIVISOR ");
                    divisor ++;
                }
                
            }
            // La característica para que un número sea semiprimo es que solo tenga dos factores(divisores) y los dos sean primos
            if (cont_primos == 2 && cont_general == 2) {
                System.out.println("EL número " + i + " es SEMIprimo");
            }
        }
    }
}
