
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();
        String[] fraseSpliteada = frase.split(" ");
        ArrayList<String> frases = new ArrayList<>();
        //Almacenar las palabras en el ArrayList
        for(int i = 0; i <= fraseSpliteada.length-1; i++) {
            frases.add(fraseSpliteada[i]);
        }
        //Eliminar palabras
        frases.removeIf(palabra -> palabra.length() < 3 || palabra.contains("x"));
        //Ordenar el ArrayList alfabeticamente
        Collections.sort(frases); //Modifica el array original
        System.out.println("El resultado final es " + frases);
        System.out.println("El ArrayList contiene " + frases.size() + " palabras");
    }
}
