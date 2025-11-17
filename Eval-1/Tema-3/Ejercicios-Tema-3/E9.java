public class E9 {
    public static void main(String[] args) {
        int num = 1;
        int suma = 0;
        while (num <= 100) {
            if (num % 2 != 0) {
                suma += num;
            }
            num ++;
        }
        System.out.println("La suma de todos los impares es: " + suma);
    }
}
