import Garaje.Garaje;
import Vehiculos.Coche;
public class E23 {
    public static void main(String[] args) {
        Coche mi_coche = new Coche("Audi", "A3");
        Coche mi_coche_2 = new Coche("Seat", "Panda");
        Coche mi_coche_3 = new Coche("Lamborghini", "Urus");
        Garaje mi_garaje = new Garaje(0);
        mi_garaje.aniadirCoches(mi_coche);
        mi_garaje.aniadirCoches(mi_coche_2);
        mi_garaje.aniadirCoches(mi_coche_3);
        mi_garaje.mostrarCoches();
        
    }
}
