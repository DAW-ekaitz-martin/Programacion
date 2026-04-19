import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class E3 {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("multilinea.txt"));
            bw.write("¡Hola, mundo!\n");
            bw.write("¡Hola, mundo!\n");
            bw.write("¡Hola, mundo!\n");
            bw.close();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
