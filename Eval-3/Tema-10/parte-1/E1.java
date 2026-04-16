
import java.util.ArrayList;
import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        ArrayList<String> listaDeLaCompra = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        //Añadir productos
        while (true) { 
            System.out.print("Producto a ingresar: ");
            String producto = scanner.nextLine();
            if(producto.equals("fin")) {
                break;
            }
            else {
                listaDeLaCompra.add(producto);
            }
        }
        for(int i = 0; i <= listaDeLaCompra.size()-1; i++) {
            System.out.println(listaDeLaCompra.get(i));
        }
        //Buscar productos y contar las veces presentes
        System.out.print("Ingrese el producto que quiere buscar: ");
        String producto = scanner.nextLine();
        int cont = 0;
        boolean contiene = false;
        
        if(listaDeLaCompra.contains(producto)) {
            contiene = true;
            for(int i = 0; i <= listaDeLaCompra.size()-1; i++) {
                if(listaDeLaCompra.get(i).equals(producto)) {
                    cont ++;
                    System.out.println("El producto se encuentra en la posición " + i);
                }
            }
        }
        if(contiene) {
            System.out.println("El producto '" + producto + "' se repite " + cont + " veces");
        }
        else {
            System.out.println("El producto no se encuentra en la lista");
        }
        //Buscar productos y contar las veces presentes
        System.out.print("Ingrese el producto que quiere eliminar: ");
        String productoAEliminar = scanner.nextLine();
        if(listaDeLaCompra.contains(productoAEliminar)) {
            listaDeLaCompra.remove(productoAEliminar);
        }
        else {
            System.out.println("El producto introducido no se encuentra en la lista");
        }
        System.out.println("LISTA FINAL:");
        for(int i = 0; i <= listaDeLaCompra.size()-1; i++) {
            System.out.println(listaDeLaCompra.get(i));
        }
        System.out.println("Longitud de la lista: " + listaDeLaCompra.size());
    }
}
