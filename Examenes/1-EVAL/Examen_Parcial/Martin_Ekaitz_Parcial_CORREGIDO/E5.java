import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        /*Perfecto. Nota del ejercicio: 1,5/1,5. Lee los comentarios, hay una cosa importante aunque no lo he puntuado negativamente (esta vez).
         */
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese la puntuación de la Viabilidad Técnica: ");
        int vt = scanner.nextInt();
        System.out.print("Ingrese el valor de la Rentabilidad Potencial: ");
        int rp = scanner.nextInt();

        System.out.print("Ingrese el valor del Impacto Social: ");
        int ip = scanner.nextInt();

        Scanner scan = new Scanner(System.in); //¿Por qué creas otro scanner?
        System.out.print("Ingrese el valor del nivel de riesgo (alto o bajo): ");
        String nr = scanner.next();

        int suma = vt + rp + ip;

        if (nr.equals("bajo") && vt >= 8 && rp >= 9) { //bien
            System.out.println("Aprobación directa. En base a la regla 1");

        }
        else if(nr.equals("alto") || suma < 15) { //bien
            System.out.println("Rechazo directo. En base a la regla 2");
        }
        else if (vt <= 4 && ip >= 7) { // bien
            System.out.println("Revision especial. En base a la regla 3");
        }
        else if (suma / 3 >= 7) { //la condición está bien, pero cuidado: suma es un int, que lo divides entre 3. Eso te va a truncar el número.
            // En este caso no afecta al resultado (si te lo trunca a 7, sigue siendo cierta la condición), pero en la mayoría de contextos puede suponer
            // un problema. SE SOLUCIONA COMBIRTIENDO SUMA A DOUBLE
            System.out.println("Aprobada condicional. En base a la regla 4");
        }
        else { 
            System.out.println("Rechazada. En base a la regla 5");
        }
        scanner.close();
        //scan.close(); también, aunque no sé por qué lo creaste
    }
}
