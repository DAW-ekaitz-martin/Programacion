import java.io.File;

public class E16 {
    public static void main(String[] args) {
        boolean existe = false;
        File fichero = new File("datos.txt");
        if(fichero.exists()) {
            existe = true;
        }
        if(existe) {
            System.out.println("El archivo datos.txt existe");
        }
        else {
            System.out.println("El archivo datos.txt NO existe");
        }
    }
}
