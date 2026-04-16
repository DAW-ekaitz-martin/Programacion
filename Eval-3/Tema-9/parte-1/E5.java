
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class E5 {
    public static void main(String[] args) {
        String[] nombres = {"Ekaitz", "Brandon", "Mateo", "Gaizka", "Walid"};
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("nombres.txt"));
            for(String nombre : nombres) {
                bw.write(nombre+"\n");
            }
            bw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
