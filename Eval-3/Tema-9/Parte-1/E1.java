import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class E1 {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("datos.txt"));
            bw.close();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
