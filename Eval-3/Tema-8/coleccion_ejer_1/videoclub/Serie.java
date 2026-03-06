package videoclub;

public class Serie implements Entregable{
    String titulo, genero, creador;
    int numeroTemporadas;
    boolean prestado;
    public Serie() {
        this.titulo = null;
        this.creador = null;
        this.genero = null;
        this.prestado = false;
        this.numeroTemporadas = 3;
    }
    public Serie(String titulo, String genero, String creador, int numTemporadas) {
        this.titulo = titulo;
        this.genero = genero;
        this.creador = creador;
        this.numeroTemporadas = numTemporadas;
    }
    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        this.genero = "Indefinido";
        this.prestado = false;
        this.numeroTemporadas = 3;
    }
    //Getters
    public String getTitulo() {
        return this.titulo;
    }
    public String getGenero() {
        return this.genero;
    }
    public String getCreador() {
        return this.creador;
    }
    public int getNumTemporadas() {
        return this.numeroTemporadas;
    }
    //Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setCreador(String creador) {
        this.creador = creador;
    }
    public void setNumTemporadas(int temporadas) {
        this.numeroTemporadas = temporadas;
    }
    @Override 
    public String toString() {
        return "Titulo: " + this.titulo + ", Número de temporadas: " + this.numeroTemporadas + ", Genero: " + this.genero + ", Creador: " + this.creador + ", Prestado: " + this.prestado;
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
        if (a instanceof Serie) {
            Serie serie = (Serie) a;
            if (this.numeroTemporadas > serie.numeroTemporadas) {
                //System.out.println("El numero de temporadas de la serie " + this.titulo + " es mayor a la de " + serie.titulo);
                return true;
            }
            else if (this.numeroTemporadas < serie.numeroTemporadas){
                //System.out.println("El numero de temporadas de la serie " + serie.titulo + " es mayor a la de " + this.titulo);
                return false;
            }
            else {
                //System.out.println("Las series tienen el mismo número de temporadas");
                return false;
            }
        }
        else {
            //System.out.println("El objeto recibido como parametro no es una serie");
            return false;
        }
    }
}
