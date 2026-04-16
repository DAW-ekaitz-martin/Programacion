import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E13 {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("texto.txt"));
            bw.write("programación, programación programación, programación");
            bw.write("\n");
            bw.write("Programación\n");
            bw.write("programación\n");
            bw.close();
            BufferedReader br = new BufferedReader(new FileReader("texto.txt"));
            String linea;
            int cont= 0;
            boolean contiene = false;
            while((linea = br.readLine())!= null) {
                while (linea.contains("programación")) {
                    int pos = linea.indexOf("programación") + 11;
                    linea = linea.substring(pos, linea.length());
                    contiene = true;
                    cont ++;
                }
            }
            br.close();
            if(contiene) {
                System.out.println("El archivo contiene la palabra programación " + cont + " veces");
            }
            else {
                System.out.println("El archivo NO contiene la palabra progrmación");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
