import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        //1,5/2. Mucho cuidado con los números negativos. Se indica: 
        //"Los valores negativos no deben ser tenidos en cuenta, se deberá mostrar error y pedir que se escanee un nuevo producto."
        Scanner scanner = new Scanner(System.in);
        final int DESCUENTO = 5;

        System.out.print("Es usted nuevo cliente?(Pulse 1 si lo es, en caso contrario pulse 2): ");
        int respuesta = scanner.nextInt();
        boolean new_client = false;
        if (respuesta == 1) {
            new_client = true;
        }
        double precio = 0;
        double aux = 0;
        int igual = 1;
        double total = 0;
        int descuento_3x2 = 0;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.print("Ingrese el precio de su producto: ");
            precio = scan.nextDouble();
            total += precio;
            System.out.println("TOTAL=>" + total);
            if (precio >= 2) {
                if (precio == aux) {
                    igual ++;
                    if (igual == 3) {
                        total -= precio;
                        descuento_3x2 ++;
                        igual = 0;
                        System.out.println("DESCUENTO DE 3X2 APLICADO; NUEVO TOTAL=>" + total);
                    }
                }
                else {
                    igual = 1;
                }
                aux = precio;
            }
        } while (precio != 0);
        if (new_client == true) {
            total -= DESCUENTO;
        }
        double compra_gratis = (1 + Math.random() * 100000);
        if ((int)total == (int)compra_gratis) {
            System.out.println("Felicidades, la compra le ha salido gratis");
        }
        else {
            
            if (new_client == true) {
                System.out.println("Le hemos aplicado un descuento de 5 euros por ser nuevo cliente."); 
            }
            if (descuento_3x2 != 0) {
                System.out.println("Le hemos aplicado " + descuento_3x2 + " descuentos de 3x2 en sus productos iguales."); //¿cuánto ha sido el descuento total?
            }
            
            if (total > 0) {
                System.out.println("El precio de su compra es de: " + total);
            }
            else {
                System.out.println("Debido a los descuentos, su compra le ha salido gratis.");
            }

            
        }
    }
}
