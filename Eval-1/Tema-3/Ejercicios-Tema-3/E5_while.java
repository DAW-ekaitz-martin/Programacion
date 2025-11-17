import java.util.Scanner;

public class E5_while {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int num = scanner.nextInt();

        double suma=0;
        int contador = 0;

        //Meto un if previo, porque sino el programa empieza a funcionar incluso con un múltiplo de 10 y da resultados raros.
        if (num % 10 != 0) {
            while (num % 10 != 0) {
                suma += num;
                contador++;
                System.out.print("Ingrese un número: ");
                num = scanner.nextInt();

            }
            double media = suma / contador;
            System.out.print("El valor de la media aritmética es : " + media);
        }
        else {
            System.out.print("El valor introducido ya es múltiplo de 10, por lo que no se calculará la media.");
        }
        
        
    
        scanner.close();
    }
}
