import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int n = scanner.nextInt();

        System.out.print("Ingrese otro número: ");
        int n2 = scanner.nextInt();
        
        int mcd = mcd(n, n2);
        System.out.println("El mcd es: " + mcd);
        int mcm = mcm(n, n2);
        System.out.println("El mcm es: " + mcm);
        scanner.close();
    }

    public static int mcd(int n, int n2) {
        //Número más pequeño
        int n3;

        if (n < n2) {
            n3 = n;
        }
        else {
            n3 = n2;
        }
        for (int i = n3; i > 1; i--) {
            if (n % i == 0 && n2 % i == 0) {
                return i;
            }
        }
        return 1;
    }
    public static int mcm(int n, int n2) {
        int mcd = mcd(n,n2);
        //Número más grande
        int n3;

        if (n < n2) {
            n3 = n2;
        }
        else {
            n3 = n;
        }
        int mcm = 1;
        //MANERA 1
        /*for (int i = 1; i <= n3; i++) {
            int aux = n * i;
            //System.out.println("VALOR AUX=>" + aux);
            for (int j = 1; j <= n3; j++) {
                //System.out.println("VALOR n2=>" + n2*j);
                if (n2 * j == aux) {
                    mcm = aux;
                    return mcm;
                }
            }
        }
        return 1;*/

        //MANERA 2
        int i = 1;
        while (true) { 
            int c = mcd * i;
            if (c % n == 0 && c % n2 == 0) {
                //System.out.println("prueba " + c);
                mcm = c;
                break;
            }
            //System.out.println("El mcd es: " + mcd);
            i ++;
            
        }
        return mcm;
    }
}
