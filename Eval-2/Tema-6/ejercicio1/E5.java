public class E5 {
    public static void main(String[] args) {
        Persona[] array_personas = new Persona[3];
        Persona yo = new Persona("Ekaitz", 22);
        Persona mateo = new Persona("Mateo", 18);
        Persona aritz = new Persona("Aritz", 20);
        array_personas[0] = yo;
        array_personas[1] = mateo;
        array_personas[2] = aritz;

        for (int i = 0; i <= array_personas.length-1; i++) {
            array_personas[i].mostrarInformacion();
        }
    }
}
