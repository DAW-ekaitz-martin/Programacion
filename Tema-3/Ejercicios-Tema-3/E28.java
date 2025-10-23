import java.util.Scanner;
public class E28 {
    public static void main(String[] args) {
        int cont_persona = 0;
        int cont_cpu = 0;
        String eleccion_persona;
        for (int i = 0; i <= 2; i++) { 
            Scanner scanner = new Scanner(System.in);

            System.out.print("Piedra Papel o Tijeras 1, 2 y.... 3!: ");
            eleccion_persona = scanner.next();

            int num = (int)(Math.random() * 3);
            String eleccion_cpu;

            if (num == 0) {
                eleccion_cpu = "Piedra";
                System.out.println("Piedra");
            }
            else if (num == 1) {
                eleccion_cpu = "Papel";
                System.out.println("Papel");
            }
            else {
                eleccion_cpu = "Tijeras";
                System.out.println("Tijeras");
            }

            if (eleccion_persona.equals("Piedra") && eleccion_cpu.equals("Tijeras")) {
                cont_persona ++;
            }
            else if (eleccion_persona.equals("Papel") && eleccion_cpu.equals("Piedra")) {
                cont_persona ++;
            }
            else if (eleccion_persona.equals("Tijeras") && eleccion_cpu.equals("Papel")) {
                cont_persona ++;
            }
            else if (eleccion_persona.equals("Tijeras") && eleccion_cpu.equals("Piedra")) {
                cont_cpu ++;
            }
            else if (eleccion_persona.equals("Papel") && eleccion_cpu.equals("Tijeras")) {
                cont_cpu ++;
            }
            else if (eleccion_persona.equals("Piedra") && eleccion_cpu.equals("Papel")) {
                cont_cpu ++;
            }
            else {
                i --;
            }
        }
        System.out.println("PUNTUACIÓN FINAL=> CPU: " + cont_cpu + " | TU: " + cont_persona);
        if (cont_persona > cont_cpu) {
            System.out.println("Felicidades! Le has ganado a un trozo de plástico");
        }
        else {
            System.out.println("Cagaste! Espabila chaval");
        }
    }
}

