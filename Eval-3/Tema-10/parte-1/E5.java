
import java.util.ArrayList;

public class E5 {
    public static void main(String[] args) {
        ArrayList<String> listaDeEspera = new ArrayList<>();
        listaDeEspera.add("Alejandro");
        listaDeEspera.add("Pablo ");
        listaDeEspera.add("Manuel");
        listaDeEspera.add("Álvaro ");
        listaDeEspera.add("Adrián ");
        listaDeEspera.add("David ");
        listaDeEspera.add("Mario ");
        listaDeEspera.add("Enzo ");
        listaDeEspera.add("Diego ");
        listaDeEspera.add("Marcos ");
        for(int i = 0; i <= 3; i++) {
            System.out.println("ESTADO ACTUAL DE LA LISTA:");
            System.out.println(listaDeEspera);
            int posicion = (int)(Math.random() * 10) + 1;
            listaDeEspera.add(posicion, "Ekaitz");
            System.out.println("Los elementos se ha desplazado");
            System.out.println("ESTADO ACTUAL DE LA LISTA DESPUES DE LA INSERCIÓN:");
            System.out.println(listaDeEspera);
        }
    }
}
