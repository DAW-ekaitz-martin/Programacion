
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E17 {
    public static void main(String[] args) {
        String[] palabras = {"hola", "que", "tal"};
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("palabras.txt"));
            for (int i = 0; i <= palabras.length-1; i++) {
                bw.write(palabras[i]+"\n");
            }
            bw.close();
            BufferedReader br = new BufferedReader(new FileReader("palabras.txt"));
            String fila;
            while((fila = br.readLine()) != null) {
                System.out.println(fila);
            }
            br.close();
        } catch (IOException e) {
        }
    }
}
