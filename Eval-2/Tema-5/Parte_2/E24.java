import java.util.Scanner;
public class E24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cadena = "Otorrinolaringologo";
        char[] cadena_a_adivinar = cadena.toCharArray();
        char[] progreso_jugador = new char[cadena.length()];
        //Todas las letras minúsculas, menos dolores de cabeza
        tolower_array(cadena_a_adivinar);
        //Voy a permitir 7 fallos
        char[] cadena_de_fallos = new char[7];
        System.out.println("Bienvenido al juego del ahorcado");
        System.out.println("Dispondrá de 7 intentos fallidos antes de que se acabe el juego para adivinar la palabra");
        int fallos = 0;
        do {
            System.out.print("Ingrese una letra: ");
            char caracter = scanner.nextLine().charAt(0);
            tolower_character(caracter);
            if(comprobar_char(cadena_a_adivinar, caracter)) {
                System.out.println("ACERTASTE!");
                System.out.println("PROGRESO:");
                añadir_char(cadena_a_adivinar, progreso_jugador, caracter);
                for (int i = 0; i <= progreso_jugador.length-1; i++) {
                    System.out.print(progreso_jugador[i]);
                    //Evitar que me imprima coma si no hay una letra después
                    if (i < progreso_jugador.length-1)
                        System.out.print(", ");
                    else
                        System.out.println("");
                }
            }
            else {
                System.out.println("FALLASTE");
                cadena_de_fallos[fallos] = caracter;
                System.out.println("LETRAS QUE NO SE ENCUENTRAN EN LA CADENA:");
                for (int i = 0; i <= cadena_de_fallos.length-1; i++) {
                    System.out.print(cadena_de_fallos[i]);
                    //Evitar que me imprima coma si no hay una letra después
                    if (i < cadena_de_fallos.length-1)
                        System.out.print(", ");
                    else
                        System.out.println("");
                }
                fallos ++;
            }
            if (ganador(progreso_jugador, cadena_a_adivinar)) {
                System.out.println("HAS GANADO, FELICIDADES!:");
                break;
            }
        } while (fallos < 7);
        
        if (fallos == 7) 
            System.out.println("LO SIENTO, PERDISTE");
    }
    public static boolean ganador(char[] progreso_jugador, char[] cadena_a_adivinar) {
        boolean ganador = true;
        for (int i = 0; i<= progreso_jugador.length-1; i++) {
            if (progreso_jugador[i] != cadena_a_adivinar[i]) {
                ganador = false;
                break;
            }
        }
        return ganador;
    }
    public static char[] tolower_array(char[] array) {
        for (int i = 0; i <= array.length-1; i++) {
            if (array[i] >= 65 && array[i] <= 90)
                //Es suma, porque las mayúscula vienen antes que las minúsculas
                array[i] += 32;
        }
        return array;
    }
    public static char tolower_character(char character) {
        if (character >= 65 && character <= 90)
            //Es suma, porque las mayúscula vienen antes que las minúsculas
            character += 32;
        return character;
    }
    public static boolean comprobar_char(char[] cadena_a_adivinar, char cadena) {
        boolean caracter_en_la_cadena = false;
        for (int i = 0; i <= cadena_a_adivinar.length-1; i++) {
            if (cadena == cadena_a_adivinar[i]) {
                caracter_en_la_cadena = true;
                break;
            }
                
        }
        return caracter_en_la_cadena;
    }
    public static char[] añadir_char(char[] cadena_a_adivinar, char[] progreso_jugador, char cadena) {
        for (int i = 0; i <= cadena_a_adivinar.length-1; i++) {
            if (cadena == cadena_a_adivinar[i]) {
            progreso_jugador[i] = cadena;
            }
        }
        return progreso_jugador;
    }
}
