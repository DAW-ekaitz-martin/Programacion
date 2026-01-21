import Parte_4.Coche;
import Parte_4.Persona;
public class E20 {
    public static void main(String[] args) {
        Coche mio = new Coche("Audi", 2022);
        Coche coche_2 = new Coche("Ferrari", 2013);
        Coche coche_3 = new Coche("Audi", 2025);
        Persona yo = new Persona("Ekaitz", 22, "Barakaldo");
        yo.aniadir_Coche(mio);
        yo.aniadir_Coche(coche_2);
        yo.aniadir_Coche(coche_3);
        if (yo.tieneCochesAntiguos()) {
            System.out.println("Esta persona si tiene coches antiguos");
        }
        else
           System.out.println("Esta persona no tiene coches antiguos"); 
    }
}
