import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {

        //Muy bien. 2,5/3
        Scanner scanner = new Scanner(System.in);
        final double DANIO_BASE = 10; //int 

        double ps_charizard = 250; //enteros
        double ps_mi_pokemon = 250;

        while (ps_charizard > 0 && ps_mi_pokemon > 0) {
            System.out.print("Ingrese su siguiente ataque: ");
            String ataque = scanner.next();
            double ataque_mi_pokemon = 0;
            if (ataque.equals("Terremoto")) { //mejor con switch
                ataque_mi_pokemon = DANIO_BASE * 0; //no hagas las operaciones dos veces, aprovecha esta variable
                ps_charizard -= (DANIO_BASE * 0); //limítate a poner aquí el multiplicador, lo común fuera del if/else
                System.out.println("Le has hecho un daño de : " + ataque_mi_pokemon + " puntos");
            }
            else if (ataque.equals("Hoja_afilada")) {
                ataque_mi_pokemon = DANIO_BASE * 0.5;
                ps_charizard -= (DANIO_BASE * 0.5);
                System.out.println("Le has hecho un daño de : " + ataque_mi_pokemon + " puntos");
            }
            else if (ataque.equals("Cuchillada")) {
                ataque_mi_pokemon = DANIO_BASE * 1;
                ps_charizard -= (DANIO_BASE * 1);
                System.out.println("Le has hecho un daño de : " + ataque_mi_pokemon + " puntos");
            }
            else if (ataque.equals("Rayo")) {
                ataque_mi_pokemon = DANIO_BASE * 1.5;
                ps_charizard -= (DANIO_BASE * 1.5);
                System.out.println("Le has hecho un daño de : " + ataque_mi_pokemon + " puntos");
            }
            else if (ataque.equals("Avalancha")) {
                ataque_mi_pokemon = DANIO_BASE * 2;
                ps_charizard -= (DANIO_BASE * 2);
                System.out.println("Le has hecho un daño de : " + ataque_mi_pokemon + " puntos");
            }
            else {
                System.out.print("Ingrese su siguiente ataque: "); //no funciona si vuelves a introducir otro incorrecto
                ataque = scanner.next();
            }
            if (ps_charizard <= 0) { //muy bien evaluado
                System.out.println("PS CHARIZARD=> 0");
                break;
            }
            else {
                System.out.println("PS CHARIZARD=> " + ps_charizard);
            }
            System.out.println("Es el turno de Charizard");
            int danio_charizard = (int)(10 + Math.random() * 15);
            ps_mi_pokemon -= danio_charizard;
            System.out.println("Charizard te ha dañado con " + danio_charizard);
            if (ps_mi_pokemon <= 0) {
                System.out.println("PS MI POKEMON=> 0");
                break;
            }
            else {
                System.out.println("PS MI POKEMON=> " + ps_mi_pokemon);
            }
        }
        if (ps_charizard > 0) {
            System.out.println("El ganador del combate ha sido Charizard");
        }
        else {
            System.out.println("El ganador del combate ha sido tu pokemon");
        }
    }
}
