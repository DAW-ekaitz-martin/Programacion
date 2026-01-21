public class E13 {
    public static void main(String[] args) {
        Persona yo = new Persona("Ekaitz", 22, "Barakaldo");
        Coche mi_coche = new Coche("Seat", yo);
        Persona otra_persona = new Persona("Nacho", 18, "Bilbao");
        mi_coche.mostrarInformacion();
        mi_coche.cambiarPropietario(otra_persona);
        System.out.println("-------------");
        mi_coche.mostrarInformacion();
    }
}
