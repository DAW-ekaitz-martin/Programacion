
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class E9 {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("numeros.txt"));
            for(int numero:numeros) {
                String numeroStr = String.valueOf(numero);
                bw.write(numeroStr+"\n");
            }
            bw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
