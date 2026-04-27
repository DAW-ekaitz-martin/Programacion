import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class E5 {
    public static void main(String[] args) {
        String[] nombres = {"Ekaitz", "Mateo","Gaizka","Walid"};
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("nombres.txt"));
            for(int i = 0; i <= nombres.length-1; i++) {
                bw.write(nombres[i]+"\n");
            }
            bw.close();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
