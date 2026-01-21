public class E14 {
    public static void main(String[] args) {
        Persona yo = new Persona("Ekaitz", 22, "Barakaldo");
        Coche coche_1 = new Coche("Audi", yo);
        Persona marcos = new Persona("Marcos", 22, "Bilbao");
        Coche coche_2 = new Coche("Seat", marcos);
        Persona enrique = new Persona("Enrique", 22, "San Sebastian");
        Coche coche_3 = new Coche("Ferrari", enrique);
        Coche[] mis_coches = new Coche[3];
        mis_coches[0] = coche_1;
        mis_coches[1] = coche_2;
        mis_coches[2] = coche_3;
        for (int i = 0; i <= 2; i++) {
            mis_coches[i].mostrarInformacion();
        }
    }
}
