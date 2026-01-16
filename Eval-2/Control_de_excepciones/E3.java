import java.util.Scanner;
public class E3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean fuera;
        do {
            try {
                fuera = false;
                int[] array = {1,2,3,4,5};
                System.out.print("Introduzca la posición del array que quiere mostrar por pantalla: ");
                int posicion = scanner.nextInt();
                System.out.println("La el contenido es: " + array[posicion]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Accediste a una posición fuera del array");
                fuera = true;
            } 
        }
        while(fuera);
        
    }
}
