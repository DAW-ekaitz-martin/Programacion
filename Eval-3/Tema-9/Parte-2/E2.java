import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class E2 {
    
    public static void main(String[] args) {
        int[] ids = new int[0];
        String[] nombres = new String[0];
        String[] grupos = new String[0];
        try {
            BufferedReader br = new BufferedReader(new FileReader("alumnos.txt"));
            String linea;
            int i = 0;
            while((linea = br.readLine()) != null) {
                String[] temporal = linea.split(";");
                ids = Arrays.copyOf(ids, ids.length+1);
                ids[i] = Integer.parseInt(temporal[0]);

                nombres = Arrays.copyOf(nombres, nombres.length+1);
                nombres[i] = temporal[1];

                grupos = Arrays.copyOf(grupos, grupos.length+1);
                grupos[i] = temporal[2];
                i++;
            }
            br.close();
            String[][] notas = new String[ids.length][2];
            BufferedReader br2 = new BufferedReader(new FileReader("notas.txt"));
            BufferedWriter bw1 = new BufferedWriter(new FileWriter("incidencias.txt"));
            String linea2;
            while((linea2 = br2.readLine()) != null) {
                String[] temporal = linea2.split(";");
                boolean idExistente = false;
                for(int j = 0; j <= ids.length-1; j++) {
                    double media = 0;
                    boolean apto = true;
                    int num_notas = 0;
                    if(ids[j] == Integer.parseInt(temporal[0])) {//cojo el id del array ids porque en el array de notas no lo tengo
                        idExistente = true;
                        for(int k = 1; k <= temporal.length-1; k ++) { //resto dos porque descuento temporal[0] que equivale al id
                            if(Double.parseDouble(temporal[k]) < 3) {
                                apto = false;
                            }
                            media += Double.parseDouble(temporal[k]);
                            num_notas ++;
                        }
                        media /= num_notas;
                        if(media < 5) {
                            apto = false;
                        }
                        notas[j][0] = String.valueOf(media);
                        notas[j][1] = String.valueOf(apto);
                    }
                }
                
                //Si no sale del bucle con el boolean en true es que no se ha encontrado el id
                if(!idExistente) {
                    bw1.write("El id " + temporal[0] + " no aparece en ambos archivos");
                }
            }
            bw1.close();
            br2.close();
            BufferedWriter bw2 = new BufferedWriter(new FileWriter("informe.txt"));
            for(int j = 0; j <= nombres.length-1; j++) {
                bw2.write(nombres[j]+";"+grupos[j]+";"+notas[j][0]+",");
                if(notas[j][1].equals("true")) {
                    bw2.write("APTO\n");
                }
                else {
                    bw2.write(" NO APTO\n");
                }
            }
            bw2.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}