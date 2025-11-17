import java.util.Scanner;

public class E4_while {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int num = scanner.nextInt();

        int suma = 0;
        int contador = 0;
        //Meto un if previo, porque sino el programa empieza a funcionar incluso con un número menor de 0 y da resultados raros.
        if (num >= 0) {
            while (num >= 0) {
                suma += num;
                contador ++;
                System.out.print("Ingrese un número: ");
                num = scanner.nextInt();
            }
            double media = (double)suma / (double)contador;
            System.out.println("La media aritmetica es de: " + media);
        }
        else {
            System.out.print("El primer valor ya es menor de 0, así que no se calculará la media");
        }
        
        scanner.close();
    }

    
}
