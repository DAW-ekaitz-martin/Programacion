package armario;

public class Camiseta extends Ropa{
    public Camiseta(String color, String talla) {
        super(color, talla);
    }
    @Override
    public void tipoDePrenda() {
        System.out.println("Esta prenda es una camiseta");
    }
}
