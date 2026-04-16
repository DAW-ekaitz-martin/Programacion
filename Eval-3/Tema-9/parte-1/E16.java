import java.io.File;
public class E16 {
    public static void main(String[] args) {
        File fichero = new File("datos.txt");
        System.out.println(fichero.exists());
    }
}
