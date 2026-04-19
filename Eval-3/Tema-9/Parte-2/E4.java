import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class E4 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("ventas.txt"));
            String linea;
            double total = 0;
            while((linea = br.readLine())!= null) {
                String nombre;
                int unidades = -1;
                double precioUni = -1;
                String[] temporal = linea.split(";");
                if(temporal.length == 3) {
                    nombre = temporal[0];
                    try {
                        unidades = Integer.parseInt(temporal[1]);
                        if(temporal[2].contains(",")) {
                            temporal[2] = temporal[2].replace(",", ".");
                        }
                        precioUni = Double.parseDouble(temporal[2]);
                    } catch(NumberFormatException e) {}
                    if (unidades != -1 && precioUni != -1) {
                        double precioLinea = unidades*precioUni;
                        total += precioLinea;
                        System.out.println("Producto: " + nombre + " " + unidades + " unidades " + String.format("%.2f", precioLinea));
                    }
                }
            }
            br.close();
            System.out.println("PRECIO TOTAL: " + String.format("%.2f",total));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
    }
}
