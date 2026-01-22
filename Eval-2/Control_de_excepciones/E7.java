import java.util.Scanner;

public class E7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1,2,3,4,5,6,7};
        boolean posicion_correcta = false;
        do { 
            try {
                System.out.print("Ingrese la posición a la que quiere accceder: ");
                int posicion = scanner.nextInt() - 1;
                if (posicion < 0) {
                    throw new IllegalArgumentException ("La posición introducida es negativa");
                }
                System.out.println(array[posicion]);
                posicion_correcta = true;
            } catch (ArrayIndexOutOfBoundsException error) {
                System.out.println(error.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("El acceso al array ha sido comprobado");
            }
            
        
        } while (!posicion_correcta);
    }
}
