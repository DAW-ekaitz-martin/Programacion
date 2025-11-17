import java.util.Scanner;
public class E21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        int num = scanner.nextInt();
        //Empiezo a comprobar números desde el 2(i = 2), ya que el número 1 no es primo, por lo que no será un factor que usaremos
        while (num > 1) {
            //Antes de volver a buscar el siguiente factor primo, inicializo (i = 2) para empezar a comprobar desde el más pequeño posible cada vez
            int i = 2;
            //Necesito comprobar si el factor más pequeño posible es primo
            while (i <= num) {
                int j = 1;
                int contador = 0;
                while (j <= i) {
                    if (i % j == 0) {
                    contador ++;
                    }
                    j++;
                }
                //En caso de que lo sea, lo muestro y divido el número. En caso contrario, sigo avanzando hasta encontrar un factor primo.
                if (contador == 2 && num % i == 0) {
                    System.out.println(i);
                    num /= i;
                }
                else {
                    i ++;
                }
            }
        }
    }
}

