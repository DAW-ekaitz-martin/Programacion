import java.util.Scanner;

public class E5_do_while {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int num = scanner.nextInt();

        double suma = 0;
        double contador = 0;
        //Meto un if previo, porque sino el programa pide dos numeros y calcula la media incluso con un múltiplo de 10 y da su resultado.
        if (num % 10 != 0){
            do { 
                suma += num;
                    contador ++;
                System.out.print("Ingrese un número: ");
                num = scanner.nextInt();
                
            } while (num % 10 != 0);

            double media = suma / contador;
            System.out.print("La media aritmética es de: " + media);
        }
        else {
            System.out.print("El numero " + num +  " ya es multiplo de 10, por lo que no se calculará la media.");
        }
        
        scanner.close();
    }
}
