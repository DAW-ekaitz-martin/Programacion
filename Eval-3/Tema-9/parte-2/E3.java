
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class E3 {
    public static void main(String[] args) {
        try {
            BufferedReader br =  new BufferedReader(new FileReader("personas.txt"));
            String linea;
            int i = 0;
            while((linea = br.readLine()) != null) {
                String[] lineaSpliteada = linea.split(",");
                if(lineaSpliteada.length != 3) {
                    System.out.println("La línea " + i + " no tiene la longitud correcta.");
                }
                else if (Integer.parseInt(lineaSpliteada[2]) < 0 || Integer.parseInt(lineaSpliteada[2]) > 120) {
                    System.out.println("La edad de " + lineaSpliteada[1] + " con dni " + lineaSpliteada[0] + " no es válida.");
                }
                else {
                    System.out.println(lineaSpliteada[1] + "(" + lineaSpliteada[0] + ") tiene " + lineaSpliteada[2] + " años");
                }
                i++;
            }
            br.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
