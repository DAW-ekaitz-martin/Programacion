
import java.util.ArrayList;
import java.util.Collections;

public class E18 {
    public static void main(String[] args) {
        Jugador p1 = new Jugador("Ekaitz", 45,3,5);
        Jugador p2 = new Jugador("Mateo", 15,9,7);
        Jugador p3 = new Jugador("Gaizka", 17,14,5);
        Jugador p4 = new Jugador("Walid", 35,8,9);
        Jugador p5 = new Jugador("Brandon", 17,13,6);
        ArrayList<Jugador> jugadores = new ArrayList<>();
        jugadores.add(p1);
        jugadores.add(p2);
        jugadores.add(p3);
        jugadores.add(p4);
        jugadores.add(p5);
        System.out.println("ANTES DE ORDENAR");
        System.out.println(jugadores);
        Collections.sort(jugadores, (a1, a2) -> {
            if(a1.getPuntos() != (a2.getPuntos())) {
                return (a1.getPuntos()-a2.getPuntos())*-1;
            }
            else if (a1.getAsistencias() != (a2.getAsistencias())) {
                return (a1.getAsistencias()-a2.getAsistencias())*-1;
            }
            else {
                return (a1.getFaltas()-a2.getFaltas())*-1;
            }
        });
        System.out.println("ORDENADO");
        System.out.println(jugadores);
    }
}
