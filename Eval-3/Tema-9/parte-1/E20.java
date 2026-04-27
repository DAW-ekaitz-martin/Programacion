import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class E20 {
    public static void main(String[] args) {
        try {
            boolean iguales = true;
            BufferedReader br = new BufferedReader(new FileReader("comparacion1.txt"));
            BufferedReader br2 = new BufferedReader(new FileReader("comparacion2.txt"));
            String linea;
            String linea2;
            while((linea = br.readLine())!= null && (linea2 = br2.readLine())!= null)  {
                if(!linea.equals(linea2)) {
                    iguales = false;
                }
            }
            br.close();
            if(iguales) {
                System.out.println("Los archivos son iguales");
            }
            else {
                System.out.println("Los archivos son distintos");
            }
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
        
    }
}
