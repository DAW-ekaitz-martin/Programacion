package reproductor_musica;

public class SmartPhone implements ReproductorMusica{
    @Override
    public void iniciar() {
        System.out.println("Iniciar");

    }
    @Override
    public void pausar() {
        System.out.println("Pausar");

    }
    @Override
    public void detener() {
        System.out.println("Detener");

    }
}
