import  java.util.Scanner;
public class E1_b {
    public static void main(String[] args) {
      // 0,75/0,75
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Introduce un número: ");
      int n = scanner.nextInt();

      int suma = 0;

      for (int i = 1; i <= n; i++) {
        int factorial = 1;
        for (int j = 1; j <= i; j ++) { //Se puede hacer mucho más eficiente
            factorial *= j;
        }
        if(i % 2 == 0) {
            suma -= factorial;
        }
        else {
            suma += factorial;
        }
      }
      System.out.println("La suma total es de: " + suma);
      scanner.close();
    }
}
