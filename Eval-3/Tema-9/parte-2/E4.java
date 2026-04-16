import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class E4 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("ventas.txt"));
            String linea;
            int i = 0;
            double importeTotal = 0;
            while((linea = br.readLine())!= null) {
                double importeLinea = 0;
                String[] lineaSpliteada = linea.split(";");
                importeLinea = Double.parseDouble(lineaSpliteada[1].replace(',', '.'))* Double.parseDouble(lineaSpliteada[2].replace(',', '.'));
                importeTotal += importeLinea;
                String lineaFormateda = String.format("%.2f", importeLinea);
                System.out.println(lineaSpliteada[0] + ", " + lineaSpliteada[1] + " unidades, Precio unitario: " + lineaSpliteada[2] + " Precio total: " + lineaFormateda);
                i++;
            }
            String importeTotalFormateado = String.format("%.2f", importeTotal);
            System.out.println("Importe total: " + importeTotalFormateado);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
