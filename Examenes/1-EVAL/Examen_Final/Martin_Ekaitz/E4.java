import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número par mayor que 2: ");
        int num = scanner.nextInt();
        
        //Bucle desde 2 hasta el número introducido
        for (int i = 2; i < num; i++) {
            //System.out.println("VALOR DE I=> " + i);
            boolean primo = true;
            //Compruebo si cada número es primo
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primo = false;
                }
            }
            //Si el numero es primo empiezo a buscar combinaciones de otros número primos
            if (primo) {
                //Compruebo si ese numero primo sumado dos veces es igual al numero inicial
                if (i + i == num) {
                    System.out.println("("+ i +", " + i + ")");
                }
                // Lo siguiente es ver si sumando "i" a alguno de los demas numeros hasta el numero introducido por el usuario es igual a ese numero
                //Compruebo si el siguiente numero es primo, pongo "i + 1" porque ya compruebo antes la suma de "i + i" 
                for (int k = i + 1; k < num; k++) {
                    boolean primo_2 = true;
                    //System.out.println("VALOR DE K=> " + k);
                    for (int l = 2; l < k; l++) {
                        //System.out.println("VALOR DE L=> " + l);
                        if (k % l == 0) {
                            primo_2 = false;
                        }
                    }
                    //Si el numero es primo compruebo la suma
                    if (primo_2) {
                        if (i + k == num) {
                            System.out.println("("+ i +", " + k + ")");
                        }
                    }
                }
            }
            
        }
        scanner.close();
    }
}
