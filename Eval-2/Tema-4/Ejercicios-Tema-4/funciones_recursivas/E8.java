import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int n1 = scanner.nextInt();
        int resultado = suma(n1);
        System.out.println("La suma es: " + resultado);
        scanner.close();
    }
    public static int suma(int n1) {
        if (n1 < 9) {
            return n1; //Aquí n1 vale el único dígito que queda después de ir quitandole el último dígito al número, y lo suma a lo anterior
        }
        return suma(n1/10) + n1%10;//No necesito  ninguna variable para ir sumando las veces que resto, al hacer "n1%10" al rellamar a la función voy sumando el último dígito
    }
    public static int digit(int n1, int suma) {
        if (n1 <= 9) {
            return suma + n1;
        }
        suma += n1%10;
        return digit((n1/10), suma);
    }

}
