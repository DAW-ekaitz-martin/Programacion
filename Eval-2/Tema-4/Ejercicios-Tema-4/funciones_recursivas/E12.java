import java.util.Scanner;

public class E12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese un número: ");
        int b = scanner.nextInt();
        int resultado = multiplicar(a, b);
        System.out.println("El resultado es: " + resultado);
        scanner.close();
    }
    public static int multiplicar(int a, int b) {
        //Antes de encontrar un "a" que sea impar, no necesito guardar los valores de "b"
        if (impar(a)) {
            int suma = 0;
            return suma(a, b, suma);
        }
        //Si los primeros números "a" son pares, sigo dividiendo hasta dar con uno impar, entonces ahí empezare a contabilizar la suma
        return multiplicar((a /2), (b * 2));
    }
    public static boolean impar(int a) {
        if (a % 2 != 0) {
            return true;
        }
        return false;
    }
    public static int suma(int a, int b, int suma) {
        //Una vez que encuentro el primer "a" impar, entramos a esta función
        if (a < 1) {
            return suma;
        }
        //Pero necesito un if para comprobar que el valor actual de "a" es impar para sumar "b", ya que una vez que encontramos un "a" impar, no necesariamente tienen que ser impares los siguientes valores de "a" hasta que ésta valga 1. Así evito sumar los valores de "b" cuando "a" sea par
        if (impar(a)) {
            suma += b;
        }
        /*System.out.println("El VALOR DE A: " + a);
        System.out.println("El VALOR DE b: " + b);
        System.out.println("El VALOR DE SUMA: " + suma);*/
        return suma((a/2), (b*2), suma);
    }
}
