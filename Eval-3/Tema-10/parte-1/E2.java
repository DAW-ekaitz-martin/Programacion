import java.util.ArrayList;
import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        ArrayList<Double> notas = new ArrayList<>();
        boolean finalizarPrograma = false;
        Scanner scanner = new Scanner(System.in);
        double totalNotas = 0;
        //Añadir productos
        do { 
            System.out.print("Nota a ingresar(0-10): ");
            String nota = scanner.nextLine();
            try {
                if(nota.equals("fin")) {
                    finalizarPrograma = true;
                }
                else {
                    double notaDouble = Double.parseDouble(nota);
                    if(notaDouble >= 0 && notaDouble <= 10) {
                        notas.add(notaDouble);
                        totalNotas += notaDouble;
                    }
                    else {
                        System.out.println("La nota debe ser entre 0 y 10");
                    }
                }
            } catch (Exception e) {
                System.out.println("El valor ingresado no es un número");
            }
        } while (!finalizarPrograma);
        double media = totalNotas / notas.size();
        double max = notas.get(0);
        double min = notas.get(0);

        for (int i = 0; i <= notas.size()-1; i++) {
            if(notas.get(i) > max) {
                max = notas.get(i);
            }
            else if (notas.get(i) < min) {
                min = notas.get(i);
            }
        }
        System.out.println("La media de las notas es: " + media);
        System.out.println("La nota más alta de las notas es: " + max);
        System.out.println("La nota más baja de las notas es: " + min);
    }
}
