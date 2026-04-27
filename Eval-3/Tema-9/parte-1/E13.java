import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E13 {
    public static void main(String[] args) {
        try {
            int cont = 0;
            BufferedWriter bw = new BufferedWriter(new FileWriter("texto.txt"));
            bw.write("Me encanta la programación, no solo por programar sino tambien por la programación\n");
            bw.close();
            BufferedReader br = new BufferedReader(new FileReader("texto.txt"));
            String linea;
            while((linea = br.readLine()) != null) {
                while(linea.contains("programación")) {
                    cont ++;
                    int indice = linea.indexOf("programación") + 11; //Para coger la siguiente posición a la que acaba la palabra programación
                    linea = linea.substring(indice, linea.length());

                }
            }
            br.close();
            System.out.println("La palabra programación se repite " + cont + " veces");
        }
         catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

