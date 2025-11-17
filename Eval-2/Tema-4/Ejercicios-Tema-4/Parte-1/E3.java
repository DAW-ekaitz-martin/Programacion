import java.util.Scanner;
public class E3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la unidad de medida a la que quiere convertir (celsius o fahrenheit): ");
        String respuesta = scanner.nextLine();

        System.out.print("Ingrese la cantidad de grados a convertir: ");
        double grados = scanner.nextDouble();
        double resultado = conversion(respuesta, grados);
        System.out.println("Resultado: " + resultado);
        
        scanner.close();
    }
    public static double conversion(String respuesta, double grados) {
        
        if (respuesta.equalsIgnoreCase("fahrenheit")) {
            double fahrenheit = grados * (9/5) + 32;
            return fahrenheit;
        }
        else if (respuesta.equalsIgnoreCase("celsius")) {
            double celsius = (grados - 32) / 1.8;
            return celsius;
        }
        else {
            double por_defecto = -999;
            return por_defecto;
        }
        
        
    } 
}
