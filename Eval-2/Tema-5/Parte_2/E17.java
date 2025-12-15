import java.util.Scanner;
public class E17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una cadena de caracteres: ");
        String cadena = scanner.nextLine();
        char[] array = cadena.toCharArray();

        System.out.print("Ingrese el caracter que quiere buscar en la cadena: ");
        char caracter = scanner.nextLine().charAt(0);
        System.out.println("El caracter "+ caracter+ " aparece " + buscar_caracter(array, caracter) + " veces en la cadena.");
        scanner.close();
    }
    public static int buscar_caracter(char[] array, char caracter) {
        int contador = 0;
        for (int i = 0; i <= array.length-1; i++) {
            if (array[i] == caracter)
                contador ++;
        }
        return contador;
    }
}
