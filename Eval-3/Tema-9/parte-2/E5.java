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
            int i = 1;
            while((linea = br.readLine()) != null) {
                String[] temporal = linea.split(",");
                if(temporal.length == 3) {
                    if(temporal[1].contains("@") && temporal[2].length() == 9) {
                        bw1.write(temporal[0]+", "+temporal[1]+", "+temporal[2]+"\n");
                    }
                    else {
                        if(!temporal[1].contains("@")) {
                            bw2.write(temporal[0]+", "+temporal[1]+", "+temporal[2]+ "=> El mail no contiene @\n");
                        }
                        else if (temporal[2].length() != 9) {
                            bw2.write(temporal[0]+", "+temporal[1]+", "+temporal[2]+ "=> El número de teléfono no contiene 9 dígitos\n");
                        }
                    }
                }
                else {
                    bw2.write("La linea " + i + " no contiene toda la información.\n");
                }
                i++;
            }
            br.close();
            bw1.close();
            bw2.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
