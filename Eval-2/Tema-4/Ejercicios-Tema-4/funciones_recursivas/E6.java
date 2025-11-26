import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese otro número: ");
        int num2 = scanner.nextInt();

        int num_menor = 0;
        if (num1 < num2) {
            num_menor = num1;
        }
        else {
            num_menor = num2;
        }
        //int resultado = mcd(num1, num2, num_menor);
        //System.out.println("El mcd de " + num1 + " y " + num2 + " es: " + resultado)
        int euclides = euclides(num1, num2);
        System.out.println("El mcd de " + num1 + " y " + num2 + " es: " + euclides);
        scanner.close();
    }
    public static int mcd(int num1, int num2, int num_menor) {
        if(num1 % num_menor == 0 && num2 % num_menor == 0 ) {
            return num_menor;
        }
        return mcd(num1, num2, (num_menor - 1));
    }

    //Otra manera de hacerlo, Con euclides

    public static int euclides(int a, int b) {
        if (b == 0) {
            return a;
        }
        int r = a % b;
        if (r == 0) {
            return b;
        }
        return euclides(b, r);
    }
}
