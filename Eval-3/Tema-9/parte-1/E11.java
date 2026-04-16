
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E11 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("nombres.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("copia_nombres.txt"));
            String linea;
            while((linea = br.readLine()) != null) {
                bw.write(linea+"\n");
            }
            bw.close();
            br.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
