import java.util.Scanner;
public class E3 {
    public static void main(String[] args) {

        /* Muy bien definidas las constantes. 
         * 
         * Mira los comentarios que te he puesto. Está bien, pero con algunos fallos.
         * 
         * Nota del ejercicio: 1,4/2
         */
        Scanner scanner = new Scanner(System.in);

        final int LAT_MIN = -90; // Latitud minima
        final int LAT_MAX = 90; // Latitud maxima

        final int LONG_MIN = -180; // Longitud minima
        final int LONG_MAX = 180; // Longitud maxima

        System.out.print("Ingrese el valor de la latitud: ");
        int lat = scanner.nextInt(); //double... es un número real

        System.out.print("Ingrese el valor de la longitud: ");
        int longitud = scanner.nextInt(); //double

        if ((lat >= LAT_MIN && lat <= LAT_MAX) && (longitud >= LONG_MIN && longitud <= LONG_MAX)) { //bien
            System.out.println("Las coordenadas son geográficamente válidas");
            if (lat == 0) {
                System.out.println("Se encuentra en el Ecuador");
                System.out.println("Zonas Intertropicales");
            }
            else if (lat > 0 && lat <= 90) { //bien. Sabes que lat <= 90, porque ya has validado que está en el rango adecuado. Así que con lat>0 sería suficiente
                System.out.println("Hemisferio Norte");
                if (lat >= 0 && lat <= 23.4) { //bien
                    System.out.println("Zonas Intertropicales");
                }
                else if (lat > 23.4 && lat <= 66.6) { //no se incluye el 66.6, pero no lo tengo en cuenta en la corrección
                    System.out.println("Zonas Templadas");
                }
                else {
                    System.out.println("Zonas Polares");
                }
            }
            else if (lat < 0 && lat >= -90) { //si entra aquí, siempre será Zona Polar.... 
                System.out.println("Hemisferio Sur");
                if (lat <= 0 && lat >= 23.4) { //esto nunca se cumple.  
                    System.out.println("Zonas Intertropicales");
                }
                else if (lat < 23.4 && lat >= 66.6) { //esto nunca se cumple. Creo que se te han olvidado los signos negativos
                    System.out.println("Zonas Templadas");
                }
                else { 
                    System.out.println("Zonas Polares");
                }
            }
            if (longitud == 0) { //bien
                System.out.println("Meridiano de Greenwich");
            }
            else if (longitud > 0) {
                System.out.println("Hemisferio Este");
            }
            else if (longitud < 0) {
                System.out.println("Hemisferio Oeste");
            }
        }
        else { 
            System.out.print("Las coordenadas no son geográficamente válidas");
        }
        scanner.close();
    }
}
