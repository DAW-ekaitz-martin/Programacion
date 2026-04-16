
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ejercicioSplit {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("datos.txt"));
            String linea;
            String[][] matriz = new String[30][];
            int i = 0;
            while((linea=br.readLine()) != null) {
                String[] array = linea.split(",");
                matriz[i] = array;
                i++;
            }
            br.close();
            for (int j = 0; j <= matriz.length-1; j++) {
                for(int k = 0; k <= matriz[0].length-1; k++) {
                    if(matriz[j] != null) {
                        System.out.print(matriz[j][k]);
                    }
                }
                System.out.println("");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
