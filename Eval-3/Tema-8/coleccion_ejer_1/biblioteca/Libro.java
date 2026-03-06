package biblioteca;

public class Libro extends Publicacion implements Prestable{
    boolean prestado = false;
    public Libro(int codigo, int anio_publicacion, String titulo) {
        super(titulo, codigo, anio_publicacion);
    }
    @Override
    public void prestar() {
        if (!this.prestado) {
            this.prestado = true;
            System.out.println("El libro ha sido prestado");
        }
        else {
            System.out.println("El libro ya está prestado, debe ser devuelto antes de prestarlo otra vez");
        }
    }
    @Override
    public void devolver() {
        if (this.prestado) {
            this.prestado = false;
            System.out.println("El libro ha sido devuelto");
        }
        else {
            System.out.println("El libro no está prestado, por lo que no puede ser devuelto...");
        }
    }
    @Override
    public boolean prestado() {
        if(this.prestado) {
            return true;
        }
        return false;
    }
}
