import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class E3 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("personas.txt"));
            String linea;
            int i = 0;
            while((linea = br.readLine()) != null) {
                String dni;
                String nombre;
                int edad = -1;
                String[] temporal = linea.split(",");
                if(temporal.length == 3) {
                    dni = temporal[0];
                    nombre = temporal[1];
                    try {
                        edad = Integer.parseInt(temporal[2]);
                    }catch (NumberFormatException e) {
                    }
                    if(edad != -1)
                    System.out.println(nombre + " (" + dni + ") tiene " + edad + " años");
                }
                else {
                    System.out.println("La línea numero" + i + "no es válida");
                }
                i ++;
            }
            br.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } 
    }
}
