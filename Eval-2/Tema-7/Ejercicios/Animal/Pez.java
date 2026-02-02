package Animal;
public class Pez extends Animal{
    String tipoDeAgua;

    public Pez(String nombre, String tipoDeAgua, int edad) {
        super(nombre,edad);
        this.tipoDeAgua = tipoDeAgua;
    }
    public void nadar() {
        System.out.println("El pez está nadando");
    }

}
