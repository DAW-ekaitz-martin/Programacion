import Parte_4.Coche;
import Parte_4.Persona;
public class E16 {
    public static void main(String[] args) {
        Coche mio = new Coche("Audi");
        Coche otro_coche = new Coche("Ferrari");
        Persona yo = new Persona("Ekaitz", 22, "Barakaldo");
        yo.aniadir_Coche(mio);
        yo.listarCoches();
        yo.aniadir_Coche(otro_coche);
        System.out.println("-----------");
        yo.listarCoches();

    }
}
