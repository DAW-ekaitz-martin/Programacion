public class E17 {
    public static void main(String[] args) {
        Coche mio = new Coche("Audi");
        Persona yo = new Persona("Ekaitz", 22, "Barakaldo");
        yo.mostrarInformacion();
        yo.aniadir_Coche(mio);
        yo.mostrarInformacion();
    }
}
