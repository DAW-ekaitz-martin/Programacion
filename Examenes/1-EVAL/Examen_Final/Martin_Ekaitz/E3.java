public class E3 {
    public static void main(String[] args) {
        int p0 = 0;
        int p1 = 1;
        System.out.println("Los primeros 20 números de la sucesión de Pell son: ");
        System.out.println(p0);
        System.out.println(p1);
        //El bucle lo hago hasta 18, ya que los dos primeros números no es necesario calcularlos porque ya los sabemos
        for (int i = 1; i <= 18; i++) {
            int pn = 2 * p1 + p0; 
            System.out.println(pn);
            p0 = p1;
            p1 = pn;
        }
    }
}
