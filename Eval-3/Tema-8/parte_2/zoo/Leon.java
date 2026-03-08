package zoo;

public class Leon implements Comible {
    private String tipoAnimal, tipoComida;
    private int racion;

    public Leon(String tipoAnimal, String tipoComida, int racion) {
        this.tipoAnimal = tipoAnimal;
        this.tipoComida = tipoComida;
        this.racion = racion;
    }
    @Override
    public int racionDiaria() {
        return this.racion;
    }
    @Override
    public String tipoComida() {
        return this.tipoComida;
    }
    @Override
    public String toString() {
        return "Tipo de Animal: " + this.tipoAnimal + ", Tipo de Comida: " + this.tipoComida + ", Racion: " + this.racion + "gr";
    }
}
