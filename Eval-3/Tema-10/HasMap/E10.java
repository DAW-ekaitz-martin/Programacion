
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class E10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String[] palabra = sc.nextLine().split(" ");
        Map<String, Integer> contadorPalabras = new HashMap<>();
        for(int i = 0; i <= palabra.length-1; i ++) {
            if(contadorPalabras.containsKey(palabra[i])) {
                contadorPalabras.put(palabra[i], contadorPalabras.get(palabra[i]) +1);
            }
            else {
                contadorPalabras.put(palabra[i], 1);
            }
        }
        for(Map.Entry<String,Integer> entrada: contadorPalabras.entrySet()) {
            System.out.println(entrada.getKey() + " | " + entrada.getValue());
        }
    }
}
