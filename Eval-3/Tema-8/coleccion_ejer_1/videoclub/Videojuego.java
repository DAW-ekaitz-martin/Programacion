package videoclub;

public class Videojuego implements Entregable{
    String titulo, genero, compania;
    int horasEstimadas;
    boolean prestado;
    public Videojuego() {
        this.horasEstimadas = 10;
        this.prestado = false;
    }
    public Videojuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.horasEstimadas = 10;
        this.compania = "Creador anónimo";
        this.prestado = false;
    }
    public Videojuego(String titulo, String genero, String compania, int horasEstimadas) {
        this.titulo = titulo;
        this.genero = genero;
        this.compania = compania;
        this.horasEstimadas = horasEstimadas;
    }
    //Getters
    public String getTitulo() {
        return this.titulo;
    }
    public String getGenero() {
        return this.genero;
    }
    public String getCompania() {
        return this.compania;
    }
    public int getHorasEstimadas() {
        return this.horasEstimadas;
    }
    //Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setCompania(String compania) {
        this.compania = compania;
    }
    public void setHorasEstimadas(int horas) {
        this.horasEstimadas = horas;
    }
    @Override 
    public String toString() {
        return "Titulo: " + this.titulo + ", Horas estimadas: " + this.horasEstimadas + ", Genero: " + this.genero + ", Creador: " + this.compania + ", Prestado: " + this.prestado;
    }
    @Override
    public void prestar() {
        this.prestado = true;
    }
    @Override
    public void devolver() {
        this.prestado = false;
    }
    @Override
    public boolean isPrestado() {
        return this.prestado;
    }
    @Override
    public boolean compareTo(Object a) {
        if (a instanceof Videojuego) {
            Videojuego videojuego = (Videojuego) a;
            if (this.horasEstimadas > videojuego.horasEstimadas) {
                //System.out.println("El numero de temporadas de la videojuego " + this.titulo + " es mayor a la de " + videojuego.titulo);
                return true;
            }
            else if (this.horasEstimadas < videojuego.horasEstimadas){
                //System.out.println("El numero de temporadas de la videojuego " + videojuego.titulo + " es mayor a la de " + this.titulo);
                return false;
            }
            else {
                //System.out.println("Las videojuegos tienen el mismo número de temporadas");
                return false;
            }
        }
        else {
            //System.out.println("El objeto recibido como parametro no es una videojuego");
            return false;
        }
    }
}
