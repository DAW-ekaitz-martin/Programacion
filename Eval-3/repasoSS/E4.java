import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        int[][] fechas = new int[3][3];
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Ingrese una fecha(DD/MM/AAAA): ");
            String fecha = scanner.nextLine();
            String[] fechaSpliteada = fecha.split("/");
            int[] fechaCasteada = new int[3];
            boolean formatoCorrecto = true;
            for(int j = 0; j <= 2; j++) {
                try {
                    fechaCasteada[j] = Integer.parseInt(fechaSpliteada[j]);
                } catch (NumberFormatException e) {
                    formatoCorrecto = false;
                    System.out.println("El formato de la fecha no es válida");
                }
            }
            if(formatoCorrecto) {
                fechas[i] = fechaCasteada;
                i++;
            }
        } while (i < 3);
        scanner.close();
        int[] fechaMayor = new int[3];
        for(int j = 0; j <= fechas.length-1; j++) {
            if(fechaMayor[fechaMayor.length-1] < fechas[j][fechas.length-1]) {
                fechaMayor = fechas[j];
            }
            else if (fechaMayor[fechaMayor.length-1] == fechas[j][fechas.length-1]) {
                if(fechaMayor[fechaMayor.length-2] < fechas[j][fechas.length-2]) {
                    fechaMayor = fechas[j];
                }
                else if (fechaMayor[fechaMayor.length-2] == fechas[j][fechas.length-2]) {
                    if(fechaMayor[fechaMayor.length-3] < fechas[j][fechas.length-3]) {
                        fechaMayor = fechas[j];
                    }
                }
            }
        }
        System.out.println("La fecha más grande es: "+ fechaMayor[0]+"/"+fechaMayor[1]+"/"+fechaMayor[2]);
    }
}
