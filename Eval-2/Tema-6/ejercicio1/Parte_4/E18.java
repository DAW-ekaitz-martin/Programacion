public class E18 {
    public static void main(String[] args) {
        Coche mio = new Coche("Audi");
        Coche coche_2 = new Coche("Ferrari");
        Coche coche_3 = new Coche("Audi");
        Persona yo = new Persona("Ekaitz", 22, "Barakaldo");
        yo.aniadir_Coche(mio);
        yo.aniadir_Coche(coche_2);
        yo.aniadir_Coche(coche_3);
        for (int i = 0; i < yo.numero_de_coches; i++) {
            if (yo.lista_coches[i].esDeMarca("Audi"))
                System.out.println(yo.lista_coches[i].marca);
        }
    }
}

