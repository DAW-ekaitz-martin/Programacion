import java.util.Scanner;

public class E15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca el precio de producto: ");
        int num = scanner.nextInt();

        double descuento = num * 0.10;
        double precio_con_descuento = num - descuento;

        String resultado = num >= 50 ? "El precio final es de " + precio_con_descuento + " euros": "El precio final es de " + num + " euros";

        System.out.println(resultado);

        scanner.close();
    }
}
