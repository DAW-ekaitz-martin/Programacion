import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class E14 {
    public static void main(String[] args) {
        char[] characters = {'g','t','l'};
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("caracteres.txt"));
            for(int i = 0; i <= characters.length-1; i++) {
                String charStr = String.valueOf(characters[i]+"\n");
                bw.write(charStr);
            }
            bw.close();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
