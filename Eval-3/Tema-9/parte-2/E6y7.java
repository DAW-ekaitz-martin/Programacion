import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class E6y7 {
    public static void main(String[] args) {
        Alumno[] alumnos = new Alumno[0];
        int cant_alumnos = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("Alumnos2.txt"));
            String linea;
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
            br.close();
            //E6
            /*for(int i = 0; i<= alumnos.length-1; i++) {
                System.out.println(alumnos[i].toString());
            }*/
            //E7
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduce un dni: ");
            String dni = scanner.nextLine();
            boolean encontrado = false;
            for(int i = 0; i<= alumnos.length-1; i++) {
                if(dni.equals(alumnos[i].getDNI())) {
                    System.out.println(alumnos[i].toString());
                    encontrado = true;
                    break;
                }
            }
            if(!encontrado) {
                System.out.println("No encontrado");
            }
            scanner.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
