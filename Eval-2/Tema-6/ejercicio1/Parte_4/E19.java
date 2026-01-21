import Parte_4.Coche;
public class E19 {
    public static void main(String[] args) {
        Coche mio = new Coche("Audi", 2022);
        Coche coche_2 = new Coche("Ferrari", 2013);
        Coche coche_3 = new Coche("Audi", 2025);
        Persona yo = new Persona("Ekaitz", 22, "Barakaldo");
        yo.aniadir_Coche(mio);
        yo.aniadir_Coche(coche_2);
        yo.aniadir_Coche(coche_3);
        for (int i = 0; i < yo.numero_de_coches; i++) {
            if (yo.lista_coches[i].esAntiguo()) {
                System.out.println(yo.lista_coches[i].marca);
            }
        }
    }
}
