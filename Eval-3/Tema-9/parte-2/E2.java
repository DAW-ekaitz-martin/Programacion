
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E2 {
    public static void main(String[] args) {
        String[][] alumnos = new String[4][];
        String[][] notas = new String[4][];
        try {
            BufferedReader br = new BufferedReader(new FileReader("alumnos.txt"));
            BufferedReader br2 = new BufferedReader(new FileReader("notas.txt"));
            String linea;
            String linea2;
            int i = 0;
            while((linea=br.readLine()) != null) {
                alumnos[i] = linea.split(",");
                i++;
            }
            i = 0;
            while((linea2=br2.readLine()) != null) {
                notas[i] = linea2.split(",");
                i++;
            }
            br.close();
            br2.close();
            BufferedWriter bwIncidencias = new BufferedWriter(new FileWriter("incidencias.txt"));
            for(int j = 0; j <= alumnos.length-1; j++) {
                boolean aparece = false;
                for(int k = 0; k <= notas.length-1; k++) {
                    if (alumnos[j][0].equals(notas[k][0])) {
                        aparece = true;
                    }
                }
                if(!aparece)
                    bwIncidencias.write("El id " + alumnos[j][0] + " no aparece en los dos archivos");
            }
            bwIncidencias.close();
            BufferedWriter bw = new BufferedWriter(new FileWriter("informe.txt"));
            for(int j = 0; j <= notas.length-1; j++) {
                for(int k = 0; k <= alumnos[0].length-1; k++) {
                    bw.write(alumnos[j][k]);
                    bw.write(", ");
                }
                double mediaNotas = 0;
                int cant_notas = 0;
                boolean apto = true;
                for(int l = 1; l <= notas[0].length-1; l++) {
                    if(Integer.parseInt(notas[j][l]) < 3) {
                        apto = false;
                    }
                    mediaNotas += Integer.parseInt(notas[j][l]);
                    cant_notas ++;
                }
                mediaNotas/=cant_notas;
                if(mediaNotas <= 5) {
                    apto = false;
                }
                bw.write(String.valueOf(mediaNotas));
                bw.write(", ");
                if(apto) {
                    bw.write("APTO");
                }
                else {
                    bw.write("NO APTO");
                }
                bw.write("\n");
            }
            bw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
