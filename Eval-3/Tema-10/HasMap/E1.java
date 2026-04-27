
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Map<String, String> agenda = new HashMap<>();
        boolean finalizar = false;
        do { 
            Scanner scanner = new Scanner(System.in);
            System.out.println("Escriba:");
            System.out.println("1-Para añadir un contacto");
            System.out.println("2-Para mostrar la agenda contactos");
            System.out.println("3-Consultar el contacto de una persona");
            System.out.println("4-Para finalizar el programa");
            System.out.print("Que acción desea realizar:");
            int eleccion = scanner.nextInt();
            scanner.nextLine();

            switch (eleccion) {
                case 1:
                    System.out.print("Nombre de contacto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Número de telefono: ");
                    String numero = scanner.nextLine();
                    agenda.put(nombre,numero);
                    break;
                case 2: 
                    for(Map.Entry<String, String> entrada: agenda.entrySet()) {
                        System.out.println("-" + entrada.getKey() + ":" + entrada.getValue());
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del contacto a buscar: ");
                    String aBuscar = scanner.nextLine();
                    if(agenda.containsKey(aBuscar)) {
                        System.out.println("El numero de " + aBuscar + " es: " + agenda.get(aBuscar));
                    }
                    else {
                        System.out.println("El contacto no se encuentra en la agenda");
                    }
                    break;
                case 4: 
                    finalizar = true;
                    break;
            }
        } while (!finalizar);
    }
}
