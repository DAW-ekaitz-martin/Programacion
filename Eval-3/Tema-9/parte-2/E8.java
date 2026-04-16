import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class E8 {
    public static void main(String[] args) {
        Alumno[] alumnos = new Alumno[0];
        int cant_alumnos = 0;
        int cant_notas = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("alumnos2.txt"));
            String linea, linea2;
            while((linea = br.readLine()) != null) {
                String dni,nombre,apellidos;
                String[] lineaSpliteada = linea.split(",");
                dni = lineaSpliteada[0];
                nombre = lineaSpliteada[1];
                apellidos = lineaSpliteada[2];
                alumnos = Arrays.copyOf(alumnos, alumnos.length+1);
                Alumno alumno = new Alumno(dni, nombre, apellidos);
                alumnos[cant_alumnos] = alumno;
                cant_alumnos ++;
            }
            while((linea2 = br.readLine()) != null) {
                //Voy a meter las notas en el array, y luego meterlas en el array de notas de cada alumno
                String dni,asignatura;
                int[] notas = new int[0];
                String[] lineaSpliteada = linea.split(",");
                dni = lineaSpliteada[0];
                asignatura = lineaSpliteada[1];
                //Recorro el array alumnos y si encuentro el dni le añado las notas.
                for(int i = 0; i <= alumnos.length-1; i++) {
                    for(int j = 0; j <= alumnos.length-1; j++) {
                        if(lineaSpliteada[0].equals(alumnos[j].getDNI())){ 
                            for(int k = 2; k <= 4; k++) {
                                notas = Arrays.copyOf(notas, notas.length+1);
                                notas[cant_notas] = Integer.parseInt(lineaSpliteada[i]);
                            }
                        } 
                    }
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
