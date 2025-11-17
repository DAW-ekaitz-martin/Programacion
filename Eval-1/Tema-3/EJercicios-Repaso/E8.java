import java.util.Scanner;
public class E8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número del intervalo: ");
        int a = scanner.nextInt();

        System.out.print("Ingrese el segundo número del intervalo(mayor que el primero): ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("EL segundo núemro introducido es mayor que el primero. Lea bien las instrucciones.");
        }
        else {
            //Comprobar si el número es feliz
            
            for (int i = a; i <= b; i++) {
                int num = i;
                int suma;
                int aux = num;
                boolean feliz = true;
            
                while (num != 1) {
                    // Por cada iteración al número, me interesa resetear 'suma'
                    suma = 0;
                    while (aux > 9) {
                        suma += Math.pow(aux % 10, 2);
                        aux /=10;
                    }
                    // Debido a la condición del while, siempre va a quedar un número en la recámara que debo sumar
                    suma += Math.pow(aux, 2);
                    aux = suma;
                    //Compruebo si cada vez que sumo los dígitos del número al cuadrado, entra en el ciclo de infelices
                    switch (aux) {
                        case 4, 16, 37, 58, 89, 145, 42, 20 -> {
                            feliz = false;
                        }
                    }
                    //Si entra en el ciclo de infelices, se acabó, no es feliz 
                    if (feliz == false) {
                        break;
                    }
                    // Si no cae en el ciclo en el ciclo de infelices, seguimos en el juego
                    else {
                        num = aux;
                    }
                }
                // No quiero que cuando un número sea infeliz, se imprima también el mensaje. Así que compruebo el boolean 'feliz'
                if (feliz)
                System.out.println("El número " + i + " es FELIZ");
            }
        }
        scanner.close();
    }
}
