import java.util.ArrayList;
import java.util.Collections;

public class E17 {
    public static void main(String[] args) {
        Libro p1 = new Libro("The subtle art of not giving a fuck", "Mark Manson", 2013);
        Libro p2 = new Libro("The art of war", "Sun Tzu", -350);
        Libro p3 = new Libro("Invicto", "Marcos Vázquez", 2015);
        Libro p4 = new Libro("Los pilares de la tierra", "Ken FOllet", 2003);
        Libro p5 = new Libro("Hábitos Atomicos", "James CLear", 2013);
        ArrayList<Libro> libro = new ArrayList<>();
        libro.add(p1);
        libro.add(p2);
        libro.add(p3);
        libro.add(p4);
        libro.add(p5);
        System.out.println("ANTES DE ORDENAR");
        System.out.println(libro);
        //Por Autor
        Collections.sort(libro, (a1, a2) -> {
            return a1.getAutor().compareTo(a2.getAutor());
        });
        System.out.println("ORDENADO POR AUTOR");
        System.out.println(libro);
        //Por titulo
        Collections.sort(libro, (a1, a2) -> {
            //Ordenar por titulo
            return a1.getTitulo().compareTo(a2.getTitulo());
        });
        System.out.println("ORDENADO POR TITULO");
        System.out.println(libro);
        //Por año
        Collections.sort(libro, (a1, a2) -> {
            if(a1.getAnio() != a2.getAnio()) {
                return (a1.getAnio()-a2.getAnio()) *-1;
            }
            else {
                return a1.getAutor().compareTo(a2.getAutor());
            }
        });
        System.out.println("ORDENADO POR ANIO DESC Y SINO POR AUTOR ASC");
        System.out.println(libro);
    }
}
