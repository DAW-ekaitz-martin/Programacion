import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class E6yE7 {
    public static void main(String[] args) {
        Alumno[] alumnos = new Alumno[0];
        try {
            BufferedReader br = new BufferedReader(new FileReader("alumnos2.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("erroresAlumnos.txt"));
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
                    bw.write("El alumno de la línea " + i+ " no dispone de toda la información necesaria");
                }
                i++;
            }
            bw.close();
            br.close();
            //E6
            /*for(int j = 0; j <= alumnos.length-1; j++) {
                System.out.println(alumnos[j].toString());
            }*/
            //E7
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese el dni que quiere buscar: ");
            String dniObjetivo = scanner.nextLine();
            boolean encontrado = false;
            for(int j = 0; j <= alumnos.length-1; j++) {
                if(alumnos[j].getDni().equals(dniObjetivo)) {
                    encontrado = true;
                    System.out.println(alumnos[j].toString());
                    break;
                }
                
            }
            if(!encontrado) {
                System.out.println("No encontrado");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
