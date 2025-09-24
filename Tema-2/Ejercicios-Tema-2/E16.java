import java.util.Scanner;

public class E16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int PESO_VOTO_EMPLEADO = 1;
        final int PESO_VOTO_JEFE = 3;
        final int PESO_VOTO_DIRECTOR = 5;

        int cont_propuesta_1 = 0;
        int cont_propuesta_2 = 0;
        int cont_propuesta_3 = 0;

        System.out.println("Ingrese el número de la propuesta que quiere apoyar.");

        System.out.print("Voto del empleado: ");
        int voto_empleado = scanner.nextInt();

        if (voto_empleado < 1 || voto_empleado > 3) {
            System.out.println("Voto inválido");
        }
        else if (voto_empleado  == 1) {
            cont_propuesta_1 += PESO_VOTO_EMPLEADO;
        }
        else if (voto_empleado == 2) {
            cont_propuesta_2 += PESO_VOTO_EMPLEADO;
        }
        else {
            cont_propuesta_3 += PESO_VOTO_EMPLEADO;
        }

        System.out.print("Voto del jefe: ");
        int voto_jefe = scanner.nextInt();

        if (voto_jefe < 1 || voto_jefe > 3) {
            System.out.println("Voto inválido");
        }
        else if (voto_jefe  == 1) {
            cont_propuesta_1 += PESO_VOTO_JEFE;
        }
        else if (voto_jefe == 2) {
            cont_propuesta_2 += PESO_VOTO_JEFE;
        }
        else {
            cont_propuesta_3 += PESO_VOTO_JEFE;
        }

        System.out.print("Voto del director: ");
        int voto_director = scanner.nextInt();

        if (voto_director < 1 || voto_director > 3) {
            System.out.println("Voto inválido");
        }
        else if (voto_director  == 1) {
            cont_propuesta_1 += PESO_VOTO_DIRECTOR;
        }
        else if (voto_director == 2) {
            cont_propuesta_2 += PESO_VOTO_DIRECTOR;
        }
        else {
            cont_propuesta_3 += PESO_VOTO_DIRECTOR;
        }

        System.out.println("RECUENTO DE VOTOS");
        System.out.println("Propuesta 1 => " + cont_propuesta_1 + " puntos");
        System.out.println("Propuesta 2 => " + cont_propuesta_2 + " puntos");
        System.out.println("Propuesta 3 => " + cont_propuesta_3 + " puntos");

        if (cont_propuesta_1 > cont_propuesta_2 && cont_propuesta_1 > cont_propuesta_3) {
            System.out.println("La propuesta ganadora ha sido la propuesta 1.");
        }
        else if (cont_propuesta_2 > cont_propuesta_1 && cont_propuesta_2 > cont_propuesta_3) {
            System.out.println("La propuesta ganadora ha sido la propuesta 2.");
        }
        else if (cont_propuesta_3 > cont_propuesta_1 && cont_propuesta_3 > cont_propuesta_2) {
            System.out.println("La propuesta ganadora ha sido la propuesta 3.");
        }
        else {
            System.out.println("Debido a que se ha dado un empate, ganará la propuesta apoyada por el jefe de sección");

            if (voto_jefe == 1) {
                System.out.println("La propuesta ganadora ha sido la propuesta 1.");

            }
            else if (voto_jefe == 2) {
                System.out.println("La propuesta ganadora ha sido la propuesta 2.");

            }
            else if (voto_jefe == 3) {
                System.out.println("La propuesta ganadora ha sido la propuesta 3.");

            }
        }
        scanner.close();
    }
}
