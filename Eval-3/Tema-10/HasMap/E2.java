
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Map<String, String> diccionario = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        boolean finalizar = false;
        diccionario.put("hi","hola");
        diccionario.put("bye","adios");
        diccionario.put("how","como");
        diccionario.put("where","donde");
        do {
            System.out.print("Ingrese la palabra que quiere buscar(f para finalizar el programa): ");
            String palabra = scanner.nextLine();
            if(diccionario.containsKey(palabra)) {
                System.out.println("La traducción de la palabra " + palabra + " es " + diccionario.get(palabra));
            }
            else if(palabra.equals("f")) {
                finalizar = true;
            }
            else {
                System.out.println("La palabra no se encuentra en el diccionario");
            }
        } while(!finalizar);
        

    }
}
