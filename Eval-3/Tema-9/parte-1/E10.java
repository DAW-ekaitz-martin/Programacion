import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class E10 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("numeros.txt"));
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
