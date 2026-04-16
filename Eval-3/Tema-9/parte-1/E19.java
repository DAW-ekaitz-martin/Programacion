
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class E19 {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("enumerado.txt"));
            for (int i = 1; i <= 5; i++) {
                bw.write(i + "- Frase numero " + i+"\n");
            }
            bw.close();
        } catch (IOException e) {
        }
    }
}
