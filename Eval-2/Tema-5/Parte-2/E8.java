import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca el valor objetivo: ");
        int objetivo = scanner.nextInt();
        int[] n = {1, 2, 3, 4, 5, 6, 7};
        encontrar_objetivo(n.clone(), objetivo);
        scanner.close();
    }
    
    public static void encontrar_objetivo(int [] n, int objetivo) {
        boolean encontrado = false;
        int longitud = n.length;
        int posicion = redondeo((double)longitud/2);
        //El bucle hay que hacerlo tantas veces como se pueda dividir la longitud entre 2. Si la longitud es 4, se podrá dividir por 2 dos veces
        for (int i = 0; i <= n.length/2; i++) {
            System.out.println("DEBUGG LONGITUD => " + longitud);
            System.out.println("DEBUGG POSICIÓN => " + posicion);
            System.out.println("DEBUGG VALOR N[POSICION] => " + n[posicion]);
            if (n[posicion] == objetivo) {
                encontrado = true;
                System.out.println("El número se encuentra en la posición " + posicion + " del array");
                break;
            }
            else if (objetivo > n[posicion]) {
                System.out.println("Es mayor");
                //Es necesario redondear la division entre 2, porque sino al truncarlo me va a buscar una posición antes de lo que es la mitad de la longitud
                longitud = redondeo((double)longitud/2);
                if (longitud <= 1)
                    posicion = posicion + 1;
                else
                    posicion = redondeo((double)longitud/2) + posicion;
            }
            else if (objetivo < n[posicion]) {
                System.out.println("Es menor");
                longitud = redondeo((double)longitud/2);
                if (longitud <= 1)
                    posicion = posicion - 1;
                else
                    posicion = posicion - redondeo((double)longitud/2);
            }
            System.out.println("DEBUGG LONGITUD => " + longitud);
            System.out.println("DEBUGG POSICIÓN => " + posicion);
            System.out.println("DEBUGG VALOR N[POSICION] => " + n[posicion]);    
        }
        if (!encontrado) {
            System.out.println("El número NO se encuentra en el array");
        }
        
    }
    public static int redondeo(double n) {
        if (n > (int)n) {
            return (int)n + 1;
        }
        else 
            return (int)n;
    }
}
