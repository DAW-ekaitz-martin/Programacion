import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E12 {
    public static void main(String[] args) {
        try {
            boolean contiene = false;
            BufferedWriter bw = new BufferedWriter(new FileWriter("documento.txt"));
            bw.write("Java\n");
            bw.write("jAva\n");
            bw.close();
            BufferedReader br = new BufferedReader(new FileReader("documento.txt"));
            String linea;
            while((linea = br.readLine()) != null) {
                if(linea.contains("Java")) {
                    contiene = true;
                }
            }
            br.close();
            if(contiene) {
                System.out.println("El documento contiene la palabra Java");
            }
            else {

                System.out.println("El documento NO contiene la palabra Java");
            }
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
