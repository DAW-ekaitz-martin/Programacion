import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class E20 {
    public static void main(String[] args) {
        try {
            BufferedReader br1 = new BufferedReader(new FileReader("diferencias1.txt"));
            BufferedReader br2 = new BufferedReader(new FileReader("diferencias2.txt"));
            String linea1;
            String linea2;
            int i = 0;
            while((linea1=br1.readLine()) != null || (linea2=br2.readLine()) != null) {
                if (!linea1.equals(linea2=br2.readLine())) {
                    System.out.println("La linea " + i + " de cada archivo son diferentes" );
                }
                i++;
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
