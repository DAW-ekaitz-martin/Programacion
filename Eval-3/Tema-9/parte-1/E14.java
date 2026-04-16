import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class E14 {
    public static void main(String[] args) {
        char[] array = {'h', 'o', 'l', 'a'};
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("caracteres.txt"));
            for (int i = 0; i <= array.length-1; i++) {
                bw.write(array[i]+"\n");
            }
            bw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
    }
}
