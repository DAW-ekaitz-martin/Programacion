package biblioteca;

public class Revista extends Publicacion implements Prestable{
    boolean prestado = false;
    int numero;
    public Revista(int codigo, int anio_publicacion, String titulo, int numero) {
        super(titulo, codigo, anio_publicacion);
        this.numero = numero;
    }
    @Override
    public void prestar() {
        if (!this.prestado) {
            this.prestado = true;
            System.out.println("La revista ha sido prestada");
        }
        else {
            System.out.println("La revista ya está prestada, deberá ser devuelta antes de prestarla otra vez");
        }
    }
    @Override
    public void devolver() {
        if (this.prestado) {
            this.prestado = false;
            System.out.println("La reista ha sido devuelta");
        }
        else {
            System.out.println("La revista no está prestada, por lo que no puede ser devuelta...");
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
