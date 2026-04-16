
import java.util.ArrayList;
import java.util.Arrays;
public class E6 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= 20; i ++) {
            numeros.add(i);
        }
        //Para usar el toArray con un ArrayList el array resultante debe ser del mismo tipo que el ArrayList (Integer, String, Double...), pero no double, int...
        Integer[] num = numeros.toArray(new Integer[0]);
        int contPares = 0;
        for(int i = 0; i <= num.length-1; i++) {
            if(num[i] % 2 == 0) {
                contPares ++;
            }
        }
        numeros.removeIf(number -> number %2 == 0);
        System.out.println("ARRAYLIST:");
        System.out.println(numeros);
        //Los arrays se pueden imprimir con el metodo toString sin necesidad de recorrerlo elemento a elemento
        System.out.println("ARRAY:");
        System.out.println(Arrays.toString(num));
    }
}
