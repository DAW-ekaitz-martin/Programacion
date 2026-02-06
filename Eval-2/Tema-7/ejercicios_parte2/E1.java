import inventario.*;
import persona.Estudiante;
import vehiculo.*;
public class E1 {
    public static void main(String[] args) {
        Estudiante ekaitz = new Estudiante("DAW", "Ekaitz", 22);
        Coche coche = new Coche("Urus");
        Bicicleta bicicleta = new Bicicleta("Mountain bike");
        System.out.println("PRESENTACIÓN DEL ALUMNO");
        System.out.println(ekaitz.presentarse());
        System.out.println("METODOS ACELERAR DE COCHE Y BICICLETA");
        coche.acelerar();
        bicicleta.acelerar();
        //E4
        System.out.println("INFORMACIÓN DEL TELEFONO MÓVIL");
        TelefonoMovil mi_movil = new TelefonoMovil("Xiaomi", 100, "Poco 3Pro", 350.45, 1);
        double total_movil = mi_movil.calcularImpuesto() + mi_movil.getPrecio();
        System.out.println("El precio total del producto es: " + total_movil + " $");
        System.out.println(mi_movil.mostrarDetalles());
        System.out.println("INFORMACIÓN DEL PORTÁTIL");
        Portatil mi_portatil = new Portatil("Asus", 2, 800, "Intel i5", 24);
        double total_portatil = mi_portatil.calcularImpuesto() + mi_portatil.getPrecio();
        System.out.println("El precio total del producto es: " + total_portatil + " $");
        System.out.println(mi_portatil.mostrarDetalles());
        
        System.out.println("ARRAY DE PRODUCTOS");
        Producto[] productos = new Producto[10];
        productos[0] = mi_movil;
        productos[1] = mi_portatil;
        double total_inventario = 0;
        for (int i = 0; i < 2; i++) {
            total_inventario += productos[i].calcularImpuesto() + productos[i].getPrecio();
        }
        System.out.println("Valor total del inventario: " + total_inventario + "$");

        //E5
    }
}

