package reproductor_musica;

public interface ReproductorMusica extends Reproductor{
    default void siguiente() {
        System.out.println("Siguiente canción del Reproductor de Música");
    }
}
