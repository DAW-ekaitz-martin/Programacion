
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class E7 {
    public static void main(String[] args) {
        try {
            
            BufferedWriter bw = new BufferedWriter(new FileWriter("nombres.txt", true));
            bw.write("Hao");
            bw.close();
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
