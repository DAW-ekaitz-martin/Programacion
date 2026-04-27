import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class E8 {
    public static void main(String[] args) {
        Alumno[] alumnos = new Alumno[0];
        
        try {
            BufferedReader br = new BufferedReader(new FileReader("alumnos2.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("erroresEjercicio8.txt"));
            String linea;
            int i = 1;
            while((linea = br.readLine()) != null) {
                String[] temporal = linea.split(",");
                if(temporal.length == 3) {
                    Alumno alumno = new Alumno(temporal[0], temporal[1], temporal[2]);
                    alumnos = Arrays.copyOf(alumnos, alumnos.length+1);
                    alumnos[alumnos.length-1] = alumno;
                }
                else {
                    bw.write("El alumno de la línea " + i+ " no dispone de toda la información necesaria\n");
                }
                i++;
            }
            br.close();
            BufferedReader br2 = new BufferedReader(new FileReader("notas2.txt"));
            String linea2;
            while((linea2 = br2.readLine()) != null) {
                String[] temporal = linea2.split(",");
                boolean dniEncontrado = false;
                for(int j = 0; j <= alumnos.length-1; j++) {
                    if(alumnos[j].getDni().equals(temporal[0])) {
                        dniEncontrado = true;
                        alumnos[j].addNota(Double.parseDouble(temporal[2]));
                    }
                }
                if (!dniEncontrado) {
                    bw.write("El dni " + temporal[0] + " no aparece en el archivo de alumnos\n");
                }
            }
            br2.close();
            bw.close();
            for(int j = 0; j <= alumnos.length-1; j++) {
                int contadorNotas = 0;
                double media = 0;
                for(int k = 0; k <= alumnos[j].getNotas().length-1; k++) {
                    media += alumnos[j].getNotas()[k];
                    contadorNotas ++;
                }
                media /= contadorNotas;
                System.out.println("La nota media del alumno " + alumnos[j].getNombre() + " es " + String.format("%.2f",media));
                if (contadorNotas < 3) {
                    System.out.println("El alumno " + alumnos[j].getNombre() + " tiene menos de 3 notas registradas");
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
