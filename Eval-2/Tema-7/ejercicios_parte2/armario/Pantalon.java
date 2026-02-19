package armario;

public class Pantalon extends Ropa{
    public Pantalon(String color, String talla) {
        super(color, talla);
    }
    @Override
    public void tipoDePrenda() {
        System.out.println("Esta prenda es un pantalón");
    }
}
