import Parte_5.Autor;
import Parte_5.Libro;
public class E22 {
    public static void main(String[] args) {
        Autor yo = new Autor("Ekaitz", 22);
        Libro mi_libro = new Libro("Luna de pluton", 20.99, yo);
        System.out.println("INFORMACIÓN DEL LIBRO: ");
        System.out.println("Titulo: " + mi_libro.getTitulo());
        System.out.println("Precio: " + mi_libro.getPrecio());
        System.out.println("Autor: " + yo.getNombre());
    }
}
