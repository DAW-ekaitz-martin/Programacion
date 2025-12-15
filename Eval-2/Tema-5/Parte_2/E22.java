public class E22 {
    public static void main(String[] args) {
       String cadena =  "Organización de las Naciones Unidas";
       char[] array = cadena.toCharArray();

       System.out.println("El acrónimo de '" + cadena + "' es:");
       acronimo(array);
       System.out.println("");
    }
    public static void acronimo(char[] array) {
        for (int i = 0; i <= array.length-1; i++) {
            if (array[i] >= 65 && array[i] <= 'Z') {
                System.out.print(array[i]);
            }
        }
    }
}
