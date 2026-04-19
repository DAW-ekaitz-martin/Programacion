import java.io.File;

public class E15 {
    public static void main(String[] args) {
        File fichero = new File("archivo_a_borrar.txt");
        if(fichero.exists()) {
            fichero.delete();
        }
        else {
            System.out.println("El archivo no existe");
        }
    }
}
