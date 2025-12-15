import java.util.Scanner;
public class E10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una cadena de texto: ");
        String respuesta = scanner.nextLine();

        char[] array = new char[respuesta.length()];
        array = respuesta.toCharArray();
        System.out.println(array);
        array = adelantar(array);
        System.out.println(array);
        scanner.close();
    }
    public static char[] adelantar(char[] array) {
        for (int i = 0; i <= array.length-1; i++) {
            for (int j = 0; j < 5; j++) {
                if (array[i] > 'z')
                    array[i] = 'a';
                else if (array[i] > 'Z' && array[i] < 'a')
                    array[i] = 'A';
                array[i] = (char)(array[i] + 1);
            }
        }
        return array;
    }
}
