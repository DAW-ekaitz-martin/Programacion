import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class E6 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("nombres.txt"));
            String linea;
            while((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            br.close();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
