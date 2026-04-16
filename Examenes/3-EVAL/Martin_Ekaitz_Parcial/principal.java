import app.*;
import java.util.Scanner;
import model.*;
public class principal {
    public static void main(String[] args) {
        GestionAlquiler panelVehiculos = new GestionAlquiler();
        Coche c1 = new Coche("Ferrari", "Carrera", 3000, 4);
        Moto m1 = new Moto("Vespa", "A34", 220, 3);
        boolean finalizar = false;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("PANEL DE GESTION DE VEHICULOS");
            System.out.println("PULSE: ");
            System.out.println("1-Para añadir un vehiculo");
            System.out.println("2-Para listar los vehiculos disponibles");
            System.out.println("3-Eliminar vehiculo");
            System.out.println("4-Mostrar normas de revision");
            System.out.println("5-Mostrar condiciones de seguro");
            System.out.println("6-Salir");
            System.out.print("Elección: ");
            int eleccion = scanner.nextInt();
            switch (eleccion) {
                case 1 -> {
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Marca del vehiculo: ");
                    String marca = sc.nextLine();
                    System.out.print("Modelo del vehiculo: ");
                    String modelo = sc.nextLine();
                    System.out.print("Precio del vehiculo: ");
                    double precio = sc.nextDouble();
                    System.out.print("Meses de alquiler: ");
                    int meses = sc.nextInt();
                    System.out.print("Tipo de vehiculo (1 si es un coche o 2 si es una moto): ");
                    int tipo = sc.nextInt();
                    if (tipo == 1) {
                        Coche coche = new Coche(marca, modelo, precio, meses);
                        panelVehiculos.addVehiculo(coche);
                    }
                    else if (tipo == 2) {
                        Moto moto = new Moto(marca, modelo, precio, meses);
                        panelVehiculos.addVehiculo(moto);
                    }

                    break;
                }
                case 2 -> {
                    System.out.println("LISTA DE VEHICULOS");
                    panelVehiculos.listarVehiculos();
                }
                case 3 -> {
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Ingrese LA POSICION del vehiculo que quiere eliminar: ");
                    int posicion = sc.nextInt();
                    panelVehiculos.eliminarVehiculo(posicion);
                }
                case 4 -> {
                    //He creado una moto y un coche para simpre tener disponible la llamada a la funcion 'mostrarNormasRevision()' incluso si no hay vehiculos en el array
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Tipo de vehiculo cuyas normas de revision quiere conocer(1 si es un coche o 2 si es una moto): ");
                    int tipo = sc.nextInt();
                    if (tipo == 1) {
                        System.out.println(c1.mostrarNormasRevision());
                    }
                    else if (tipo == 2) {
                        System.out.println(m1.mostrarNormasRevision());
                    }
                }
                case 5 -> {
                    //He creado una moto y un coche para simpre tener disponible la llamada a la funcion 'mostrarCondicionesSeguro()' incluso si no hay vehiculos en el array
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Tipo de vehiculo cuyas condiciones de seguro quiere conocer(1 si es un coche o 2 si es una moto): ");
                    int tipo = sc.nextInt();
                    if (tipo == 1) {
                        System.out.println(c1.mostrarCondicionesSeguro());
                    }
                    else if (tipo == 2) {
                        System.out.println(m1.mostrarCondicionesSeguro());
                    }
                }
                case 6 -> {
                    System.out.println("Hasta pronto");
                    finalizar = true;
                }
            }

        } while (!finalizar);
    }
}
