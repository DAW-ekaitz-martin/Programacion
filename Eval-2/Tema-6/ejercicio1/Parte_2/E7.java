public class E7 {
    public static void main(String[] args) {
        Persona yo = new Persona("Ekaitz",22);//Va a dar error porque en el E7 me pide añadir el atributo direción que ahora no tiene.
        yo.mostrarInformacion();
        yo.cambiarNombre("Hola");
        yo.mostrarInformacion();
    }
}
