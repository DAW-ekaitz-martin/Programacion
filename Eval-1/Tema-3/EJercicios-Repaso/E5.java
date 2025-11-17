import java.util.Scanner;
public class E5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String respuesta_2;
        int num = 0;
        int suma = 0;
        int aux = 0;
        int mayor = 0;
        int cont = 0;

        do { 
            System.out.println("Ingrese 'a' para generar números aleatorios entre 5 y 100.");
            System.out.println("Ingrese 'b' para mostrar el mayor ");
            System.out.println("Ingrese 'c' para mostrar el promedio");
            System.out.println("Ingrese 'd' si desea salir");

            System.out.print("Ingrese la acción que desea realizar: ");
            String respuesta = scanner.nextLine();
            respuesta_2 = respuesta;
            if (respuesta.equals("a")) {
                num = (int)( 5 + Math.random() * 100);
                System.out.println("El número aleatorio generado es: " + num);
                if (aux > num) {
                    mayor = aux;
                }
                else {
                    mayor = num;
                }
                aux = num;
                suma += num;
                cont ++;
                
            }
            else if (respuesta.equals("b")) {
                System.out.println("El número más grande es: " + mayor);
            }
            else if (respuesta.equals("c")) {
                double promedio = suma / cont;
                System.out.println("El promedio es de: " + promedio);
            }

        } while (!respuesta_2.equals("d"));
        
    }
}
