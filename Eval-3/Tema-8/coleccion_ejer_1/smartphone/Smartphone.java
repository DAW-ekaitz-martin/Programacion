package smartphone;
import dispositivo_movil.*;
public class Smartphone implements Radio, ReproductorMusica, GPS{
    @Override
    public void iniciarRadio() {
        System.out.println("Radio iniciada.");
    }
    @Override
    public void detenerRadio() {
        System.out.println("Radio detenida.");
    }
    @Override
    public void iniciar() {
        System.out.println("Reproductor de Música iniciado.");
    }
    @Override
    public void pausar() {
        System.out.println("Reproductor de Música pausado.");
    }
    @Override
    public void detener() {
        System.out.println("Reproductor de Música detenido.");
    }
    @Override
    public void siguiente() {
        ReproductorMusica.super.siguiente();//Así elijo a cual de los dos métodos de la interfaz(que se llaman igual) llamo.
    }
    @Override
    public void obtenerCoordenadas() {
        System.out.println("Obteniendo coordenadas...");
        
        System.out.println("El usuario se encuentra en las coordenadas: 40.4168, -3.7038");
    }
}
