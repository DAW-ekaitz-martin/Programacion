import java.util.Scanner;
public class E9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double SALDO_DISPONIBLE = 1000;
        boolean retirado = false;
        do { 
            try {
                System.out.print("Ingrese el importe a retirar: ");
                double retiro = scanner.nextDouble();
                if (retiro < 0) {
                    throw new IllegalArgumentException ("La cantidad introducida es negativa");
                }
                else if(retiro > SALDO_DISPONIBLE) {
                    throw new IllegalArgumentException ("La cantidad introducida excede el saldo disponible");
                }
                retirado = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("La operación de reintegro ha sido validada");
            }
        } while (!retirado);
        
        

    }
}
