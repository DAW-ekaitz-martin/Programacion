import java.util.Scanner;

public class E7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int n1 = scanner.nextInt();

        System.out.print("Ingrese otro número: ");
        int n2 = scanner.nextInt();
        int resultado = cociente(n1, n2);
        System.out.println("El cociente es: " + resultado);
        scanner.close();
    }
    /**
        Esta función calcula el cociente de un número mediante restas
        @param n1 El primer parámetro es el dividendo
        @param n2 El segundo parámetro es el divisor
        @return La función devuelve un entero que equivale al cociente de la función
     */
    public static int cociente(int n1, int n2) {
        if (n1 < n2) {
            return 0;
        }
        return cociente(n1-n2, n2) + 1;//No necesito  ninguna variable para ir sumando las veces que resto, al hacer "+1" al rellamar a la función se van acumulando
    }
    /*public static int cociente(int n1, int n2) {
        int cont = 0;
        if (n1 >= n2) {
            cont = contador(n1, n2, cont);
        }
        return cont;
        
    }
    public static int contador(int n1, int n2, int cont) {
        if (n1 < n2) {
            return cont;
        }
        System.out.println("N1 es: " + n1);
        System.out.println("N2 es: " + n2);
        System.out.println("El contador es: " + cont);
        return contador((n1-n2), n2, (cont + 1));
    }*/
}