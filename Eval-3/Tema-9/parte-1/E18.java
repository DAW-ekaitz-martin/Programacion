
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class E18 {
    public static void main(String[] args) {
        String[] lineas = new String[0];
        try {
            BufferedReader br = new BufferedReader(new FileReader("invertir.txt"));
            String linea;
            int i = 0;
            while((linea=br.readLine()) != null) {
                lineas = Arrays.copyOf(lineas, lineas.length+1);
                lineas[i] = linea;
                i++;
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter("invertido.txt"));
            for(int j = lineas.length-1; j >= 0; j--) {
                bw.write(lineas[j]+"\n");
            }
            bw.close();
        } catch (IOException e) {
        }
    }
}
