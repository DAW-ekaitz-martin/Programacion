import java.util.InputMismatchException;
import java.util.Scanner;
public class E2 {
    public static void main(String[] args) {
        int[] ascensor = {0,1,2,3,4,5,6,7,8,9,10,11,12};
        int planta = ascensor[0];
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Ingrese la planta a la que quiere ir: ");
                String planta_str = scanner.nextLine();
                int nueva_planta = ascensor[Integer.parseInt(planta_str)];
                if(planta < nueva_planta) {
                   System.out.println("Subiendo..."); 
                }
                else if (planta > nueva_planta) {
                   System.out.println("Bajando..."); 
                }
                else {
                    System.out.println("Usted ya se encuentra en esta planta...");
                }
                planta = nueva_planta;
            }
            catch (IndexOutOfBoundsException e){
                System.out.println("Planta fuera de rango... Vuelva a introducir la planta");
            }
            catch (NumberFormatException e){
                System.out.println("El valor introducido no es un número");
            }
        }while(true);
    }
}
