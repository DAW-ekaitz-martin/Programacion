public class E2 {
    public static void main(String[] args) {
        String cadena;
            try {
                cadena = null;
                System.out.println(cadena.length());
            }
            catch (NullPointerException e){
                System.out.println("La cadena está vacía");
            }
    }
}
