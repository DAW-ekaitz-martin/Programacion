import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E5 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("usuarios.txt"));
            BufferedWriter bw1 = new BufferedWriter(new FileWriter("validos.txt"));
            BufferedWriter bw2 = new BufferedWriter(new FileWriter("invalidos.txt"));
            String linea;
            while((linea = br.readLine()) != null) {
                String[] lineaSpliteada = linea.split(",");
                if(!lineaSpliteada[1].contains("@")) {
                    bw2.write(linea + ". Motivo del fallo: El gmail no tiene @\n");
                }
                else if (lineaSpliteada[2].length() != 9) {
                    bw2.write(linea + ". Motivo del fallo: El numero de telefono no tiene 9 digitos\n");
                }
                else {
                    bw1.write(linea+"\n");
                }
            }
            bw1.close();
            bw2.close();
            br.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
