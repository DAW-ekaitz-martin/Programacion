import java.util.Scanner;
public class E4 {
    public static void main(String[] args) {

        /* El ejercicio está perfecto, salvo las anotaciones que te hago.
         * 
         * Nota del ejercicio: 1,5/1,5
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero entero entre el 0 y el 10000: ");
        int num = scanner.nextInt();

        double raiz = Math.sqrt(num);
        System.out.println("RAIZZ==>>" + raiz);

        int redondeo = (int) raiz; //bien, pero aquí estamos truncando (y es lo que realmente hay que hacer), no redondeando
        System.out.println(redondeo);
        double valor_decimal = raiz - redondeo;
        System.out.println("Valor decimal==>>" + valor_decimal);

        if (num > 0 && num <= 10000) { //podría ser 0, pero no lo tengo en cuenta
            if (raiz != (int)raiz) { // (int)raiz es tu variable redondeo, podrías aprovecharla...
                System.out.println("La raíz cuadrada NO es un número entero");
                if (valor_decimal < 0.5) {
                    System.out.println("La propiedad decimal de la raíz cuadrada es pequeña(menor de 0.5)");
                }
                else {
                    System.out.println("La propiedad decimal de la raíz cuadrada es grande(mayor de 0.5)");
                }

            }
            else {
                System.out.println("La raíz cuadrada SI es un número entero");
            }
            if (raiz < 5) {
                System.out.println("La raíz cuadrada es pequeña(menor de 5)");
            }
            else if (raiz >= 5 && raiz < 20) {
                System.out.println("La raíz cuadrada es mediana(es igual a 5 o menor a 20)");
            }
            else {
                System.out.println("La raíz cuadrada es grande(mayor a 20)");
            }
        }
        else {
            System.out.println("El numero ingresado está fuera de rango");
        }
        scanner.close();
    }
}
