
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class E8 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("nombres.txt"));
            String linea;
            int cont = 0;
            while((linea = br.readLine()) != null) {
                cont ++;
            }
            br.close();
            System.out.println("El archivo tiene " + cont + " lineas");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
