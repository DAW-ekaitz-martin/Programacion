
import java.util.ArrayList;
import java.util.Collections;

public class E9 {
    public static void main(String[] args) {
        ArrayList<String> cadenas = new ArrayList<>();
        char letra = 'E';
        for(int i = 0; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                cadenas.add(letra + "-"+j);
            }
            letra --;
        }
        System.out.println(cadenas);
        Collections.sort(cadenas, (c1, c2) -> {
            char[] c1Spliteado = c1.split("-");
        });
    }
}
