import java.util.Scanner;

public class E26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Ingrese el valor del primer número : ");
        int num_1 = scanner.nextInt();

        System.out.print("Ingrese el valor del primer número : ");
        int num_2 = scanner.nextInt();

        int stop = 1;
        
        int resto = 0;
        // CEl algoritmo de Euclide se mntiene hasta que el resto es cero.
        while (stop != 0) {
            //Como me interesa quedarme con el resto anterior a cero, solo lo calculare cuando no sea cero
            if (num_1 % num_2 != 0) {
                resto = num_1 % num_2;
            }
            //Cuando sí lo sea,  ya puedo salir del bucle porque ya tengo el ultimo resto antes de cero.
            else {
                stop = 0;
            }
            //Aqui hgo los cambios necesarios para poder seguir sacando el resto de manera dinámica
            num_1 = num_2;
            num_2 = resto;
        }
        scanner.close();
    }
}
