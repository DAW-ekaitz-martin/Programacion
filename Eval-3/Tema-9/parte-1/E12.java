import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class E12 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("saludo.txt"));
            String linea;
            boolean contiene = false;
            while((linea = br.readLine())!= null) {
                if (linea.contains("Java") || linea.contains("Java ")|| linea.contains(" Java") || linea.contains(". Java") || linea.contains(", Java") || linea.contains("Java.")) {
                    contiene = true;
                }
            }
            br.close();
            if(contiene) {
                System.out.println("El archivo contiene la palabra Java");
            }
            else {
                System.out.println("El archivo NO contiene la palabra Java");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
