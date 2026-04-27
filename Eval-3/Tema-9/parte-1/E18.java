import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class E18 {
    public static void main(String[] args) {
        try {
            String[] lineas = new String[0];
            BufferedReader br = new BufferedReader(new FileReader("invertir.txt"));
            String linea;
            while((linea = br.readLine())!= null) {
                lineas = Arrays.copyOf(lineas, lineas.length+1);
                lineas[lineas.length-1] = linea;
            }
            br.close();
            BufferedWriter bw = new BufferedWriter(new FileWriter("invertido.txt"));
            for(int i = lineas.length-1; i >= 0; i--) {
                bw.write(lineas[i]+"\n");
            }
            bw.close();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
        
    }
}
