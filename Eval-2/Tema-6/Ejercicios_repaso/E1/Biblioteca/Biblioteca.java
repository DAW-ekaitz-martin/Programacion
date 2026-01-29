package Biblioteca;
import Libro.Libro;
public class Biblioteca {
    String nombre;
    int cant_libros = 0;
    Libro[] libros = new Libro[5];
    
    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }
    public void altaLibros(Libro libro) {
       this.libros[this.cant_libros] = libro;
       this.cant_libros ++;
    }
    public void mostrarDisponibles() {
        for (int i = 0; i < this.cant_libros; i++) {
            if (this.libros[i].getDisponible()) {
                System.out.println(this.libros[i]);
            }
        }
    }
    public void mostrarNoDisponibles() {
        for (int i = 0; i < this.cant_libros; i++) {
            if (!this.libros[i].getDisponible()) {
                System.out.println(this.libros[i]);
            }
        }
    }
}
