import java.util.Scanner;

public class E10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int n1 = scanner.nextInt();
        int aux;
        do {
            System.out.print("Ingrese su exponente: ");
            int exp = scanner.nextInt();
            aux = exp;
        }
        while (aux < 0);
        
        int resultado = potencia(n1, aux);
        System.out.println("El resultado es: " + resultado);
        scanner.close();
    }
    public static int potencia(int n1, int exp) {
        if (exp == 0) {
            return 1;
        }
        if (exp > 1 && exp % 2 == 0) {
            return potencia(n1*n1, exp/2);
        }
        else if (exp > 1 && exp % 2 != 0) {
            return n1 * potencia(n1, (exp-1));
        }
        else {
            return n1;
        }
    }
    /*public static int par(int n1, int exp, int resultado) {
        //En este if debo llegar a cero para no quedarme corto. Ejemplo: n1 = 2; exp=4 | En la primera llamada "exp = exp / 2", es decir, exp = 2. | En la segunda llamada "exp = exp / 2", es decir, exp = 1. Si no llego hasta "exp == 0" me quedo corto, ya que solo he multiplicado a n1 por si mismo 3 veces. Necesito una cuarta
        if (exp <= 0) {
            return resultado;
        }
        //No puedo poner "resultado += resultado * n1;" porque "resultado" vendría ya con el valor de "n1", por lo que el resultado siempre sería mayor de lo que debe ser"
        resultado = resultado * n1;
        System.out.println("N1=>: "+n1);
        System.out.println("EXP=>: "+exp);
        System.out.println("RESULTADO=>: "+resultado);

        return par(n1, (exp/2), resultado);
    }
    public static int impar(int n1, int exp, int resultado) {
        //En el primer calculo de resultado, uso dos veces "n1", entonces, si no quiero pasarme, no puedo llegar hasta cero, me tengo que quedar en 1. Ejemplo: n1= 2; exp= 3 | resultado = 2 * 2 | ya estaría usando el "2" dos veces, solo necesito usarlo 1 vez más. Si llegase hasta "exp == 0" usaría el "2" cuatro veces y no tres, que es lo que quiero.
        if (exp <= 1) {
            return resultado;
        }
        //No puedo poner "resultado += resultado * n1;" porque "resultado" vendría ya con el valor de "n1", por lo que el resultado siempre sería mayor de lo que debe ser"
        resultado = resultado * n1;
        System.out.println("N1=>: "+n1);
        System.out.println("EXP=>: "+exp);
        System.out.println("RESULTADO=>: "+resultado);
        return impar(n1, (exp - 1), resultado);
    }*/
}
