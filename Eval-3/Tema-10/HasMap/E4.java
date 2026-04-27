import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        Map<String, Integer> inventario = new HashMap<>();
        boolean finalizar = false;
        do { 
            Scanner scanner = new Scanner(System.in);
            System.out.println("Escriba:");
            System.out.println("1-Para añadir un producto");
            System.out.println("2-Para mostrar el inventario");
            System.out.println("3-Modificar la cantidad de un producto");
            System.out.println("4-Para finalizar el programa");
            System.out.print("Que acción desea realizar:");
            int eleccion = scanner.nextInt();
            scanner.nextLine();

            switch (eleccion) {
                case 1:
                    System.out.print("Nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Cantidad: ");
                    int numero = scanner.nextInt();
                    inventario.put(nombre,numero);
                    break;
                case 2: 
                    for(Map.Entry<String, Integer> entrada: inventario.entrySet()) {
                        System.out.println("-" + entrada.getKey() + ":" + entrada.getValue());
                    }
                    break;
                case 3:
                    System.out.print("El nombre del producto: ");
                    String aBuscar = scanner.nextLine();
                    System.out.print("La nueva cantidad: ");
                    int cantidad = scanner.nextInt();
                    if(inventario.containsKey(aBuscar)) {
                        inventario.put(aBuscar,cantidad);
                    }
                    else {
                        System.out.println("El producto no se encuentra en el inventario");
                    }
                    break;
                case 4: 
                    finalizar = true;
                    break;
            }
        } while (!finalizar);
    }
}
