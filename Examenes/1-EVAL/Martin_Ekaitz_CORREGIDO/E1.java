import java.util.Scanner;
public class E1 {
    public static void main(String[] args) {

        /* El ejercicio está muy bien. Como sugerencia, podrías verificar que num está en el rango de partida. También deberías
        empezar a comentar tus códigos.

        Nota del ejercicio: 1,5/1,5
         */
        Scanner scanner = new Scanner(System.in);

        final int NUMERO_COMPROBACION = 23;

        System.out.print("Ingrese las 8 cifras de su DNI: ");
        int num = scanner.nextInt();

        int resto = num % NUMERO_COMPROBACION;
        //System.out.println("DEBUG RESTO => " + resto);

        switch (resto) {
            case 0 -> {
                System.out.println("La letra correspondiente del DNI " + num + " es: T");
                break;
            }
            case 1 -> {
                System.out.println("La letra correspondiente del DNI " + num + " es: R");
                break;
            }
            case 2 -> {
                System.out.println("La letra correspondiente del DNI " + num + " es: W");
                break;
            }
            case 3 -> {
                System.out.println("La letra correspondiente del DNI " + num + " es: A");
                break;
            }
            case 4 -> {
                System.out.println("La letra correspondiente del DNI " + num + " es: G");
                break;
            }
            case 5 -> {
                System.out.println("La letra correspondiente del DNI " + num + " es: M");
                break;
            }
            case 6 -> {
                System.out.println("La letra correspondiente del DNI " + num + " es: Y");
                break;
            }
            case 7 -> {
                System.out.println("La letra correspondiente del DNI " + num + " es: F");
                break;
            }
            case 8 -> {
                System.out.println("La letra correspondiente del DNI " + num + " es: P");
                break;
            }
            case 9 -> {
                System.out.println("La letra correspondiente del DNI " + num + " es: D");
                break;
            }
            case 10 -> {
                System.out.println("La letra correspondiente del DNI " + num + " es: X");
                break;
            }
            case 11 -> {
                System.out.println("La letra correspondiente del DNI " + num + " es: B");
                break;
            }
            case 12 -> {
                System.out.println("La letra correspondiente del DNI " + num + " es: N");
                break;
            }
            case 13 -> {
                System.out.println("La letra correspondiente del DNI " + num + " es: J");
                break;
            }
            case 14 -> {
                System.out.println("La letra correspondiente del DNI " + num + " es: Z");
                break;
            }
            case 15 -> {
                System.out.println("La letra correspondiente del DNI " + num + " es: S");
                break;
            }
            case 16 -> {
                System.out.println("La letra correspondiente del DNI " + num + " es: Q");
                break;
            }
            case 17 -> {
                System.out.println("La letra correspondiente del DNI " + num + " es: V");
                break;
            }
            case 18 -> {
                System.out.println("La letra correspondiente del DNI " + num + " es: H");
                break;
            }
            case 19 -> {
                System.out.println("La letra correspondiente del DNI " + num + " es: L");
                break;
            }
            case 20 -> {
                System.out.println("La letra correspondiente del DNI " + num + " es: C");
                break;
            }
            case 21 -> {
                System.out.println("La letra correspondiente del DNI " + num + " es: K");
                break;
            }
            case 22 -> {
                System.out.println("La letra correspondiente del DNI " + num + " es: E");
                break;
            }
        }
        scanner.close();
    }
}
