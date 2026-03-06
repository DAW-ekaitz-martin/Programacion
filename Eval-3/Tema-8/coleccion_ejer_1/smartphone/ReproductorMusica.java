package smartphone;

public interface ReproductorMusica {
    void iniciar();
    void pausar();
    void detener();
    default void siguiente() {
        System.out.println("Siguiente canción del Reproductor de música");
    }
}
