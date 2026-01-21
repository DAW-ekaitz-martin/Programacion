public class E12 {
    public static void main(String[] args) {
        Persona yo = new Persona("Ekaitz", 22, "Barakaldo");
        Coche mi_coche = new Coche("Seat", yo);
        mi_coche.mostrarInformacion();
    }
}
