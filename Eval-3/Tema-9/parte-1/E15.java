
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class E15 {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("archivo_a_borrar.txt"));
            bw.write("Holas");
            bw.close();
            File fichero = new File("archivo_a_borrar.txt");
            if (fichero.exists()) {
                fichero.delete();
            }
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        
    }
}
