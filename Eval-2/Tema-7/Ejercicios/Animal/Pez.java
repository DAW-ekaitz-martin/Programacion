package Animal;
public class Pez extends Animal{
    String tipoDeAgua;

    public Pez(String nombre, String tipoDeAgua, int edad) {
        super(nombre,edad);//El ejercicio 11 se refiere a esto.
        this.tipoDeAgua = tipoDeAgua;
    }
    public void nadar() {
        System.out.println("El pez está nadando");
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + ", tipo de agua: " + this.tipoDeAgua;
    }
}
