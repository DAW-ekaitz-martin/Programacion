import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class E9 {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("numeros.txt"));
            for(int i = 0; i <= numeros.length-1; i++) {
                String numeroStr = String.valueOf(numeros[i]+"\n");
                bw.write(numeroStr);
            }
            bw.close();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
