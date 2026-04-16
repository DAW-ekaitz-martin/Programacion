import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class E7 {
    public static void main(String[] args) {
        ArrayList<String> palabras = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean finalizarProgama = false;
        //Añadir productos
        do { 
            System.out.print("Palabra a ingresar: ");
            String palabra = scanner.nextLine();
            if(palabra.equals("fin")) {
                finalizarProgama = true;
            }
            else {
                palabras.add(palabra);
            }
        } while(!finalizarProgama);
        System.out.println("ARRAYLIST ANTES DE ORDENARLO:");
        System.out.println(palabras);
        Collections.sort(palabras, (s1, s2) -> {
            if(s1.length() != s2.length()) {
                return s1.length() - s2.length();// orden por longitud. Lo que pasa aquí es: El Collections.sort tiene por detras un compareTo, el cual puede devolver 3 opciones: 0 si los paramteros son iguales, un numero mayor a 0 si el primer parametro es más grande que el segundo, y un numero menor a 0 si el primer parametro es más pequeño que el segundo. Entonces, cuando hacemos s1.length() - s2.length() el resultado  puede ser positivo o negativo(ya que en el condicional me aseguro que no pueden ser iguales, por lo que es imposible que sea 0) y en base al resultado(si es negativo, s2 es más largo, por lo que se ordenara el s1 antes del s2 porque es en orden ascendente) lo ordena. En caso de que s1 y s2 sean iguales lo ordeno por orden alfabetico (que es lo que hace compareTo de manera natural, por eso lo uso en el else) que es lo que pide el ejercicio
            }
            else {
                return s1.compareToIgnoreCase(s2);// orden alfabetico
            }
        });
        System.out.println("ARRAYLIST DESPUES DE ORDENARLO:");
        System.out.println(palabras);
    }
}
