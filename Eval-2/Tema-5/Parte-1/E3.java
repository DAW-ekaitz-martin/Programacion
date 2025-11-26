public class E3 {
    public static void main(String[] args) {
        int [] n = {7, 8, 9, 10, 7};
        int suma = 0;
        for (int i= 0; i <= 4; i++) {
            suma += n[i];
        }
        int resultado = suma / n.length;
        System.out.println("La media es: " + resultado);
    }
}
