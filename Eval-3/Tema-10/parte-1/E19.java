import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class E19 {
    public static void main(String[] args) {
        ArrayList<Contacto> contactos = new ArrayList<>();
        boolean finalizar = false;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese:\n1-Para añadir contacto.\n2-Para mostrar la lista ordenada\n3-Para eliminar un contacto por nombre exacto.\n$-Para finalizar el programa\nSu eleccion: ");
            int eleccion = sc.nextInt();
            sc.nextLine();
            switch(eleccion) {
                case 1 -> {
                    System.out.print("Nombre del contacto: ");
                    String nombre = sc.nextLine();
                    System.out.print("Email del contacto: ");
                    String email = sc.nextLine();
                    System.out.print("Teléfono del contacto: ");
                    int telefono = sc.nextInt();
                    sc.nextLine();
                    Contacto contacto = new Contacto(nombre, email, telefono);
                    contactos.add(contacto);
                }
                case 2 -> {
                    Collections.sort(contactos, (c1, c2) -> {
                        return c1.compareTo(c2);
                    });
                    System.out.println("LISTA ORDENADA");
                    System.out.println(contactos);
                }
                case 3 -> {
                    System.out.print("Nombre del contacto: ");
                    String nombre = sc.nextLine();
                    for(int i = 0; i <= contactos.size()-1; i++) {
                        if(contactos.get(i).getNombre().equals(nombre)) {
                            contactos.remove(i);
                        }
                    }
                }
                case 4 -> {
                    finalizar = true;
                    System.out.println("Programa finalizado");
                }
            }
        } while(!finalizar);

    }
}
