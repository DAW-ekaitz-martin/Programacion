import java.util.ArrayList;
import java.util.Collections;

public class E10 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Ekaitz Martin");
        nombres.add("Enrique Diaz");
        nombres.add("Marcelo Diaz");
        nombres.add("Nacho Iglesias");
        

        System.out.println("ANTES DE ORDENARLO");
        System.out.println(nombres);
        Collections.sort(nombres, (n1, n2) -> {
            String[] n1Split = n1.split(" ");
            String[] n2Split = n2.split(" ");
            if (n1Split[1] != n2Split[1]) {  
                return n1Split[1].compareTo(n2Split[1]);
            }
            else {
                return n1Split[0].compareTo(n2Split[0]);
                
            }
        });
        System.out.println("DESPUÉS DE ORDENARLO");
        System.out.println(nombres);
    }
}
