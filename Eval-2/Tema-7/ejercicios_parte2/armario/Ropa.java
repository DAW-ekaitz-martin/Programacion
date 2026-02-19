package armario;

public abstract class Ropa {
    String color;
    String talla;
    public Ropa(String color, String talla) {
        this.color = color;
        this.talla = talla;
    }
    public abstract void tipoDePrenda();
    public void mostrarInfo() {
        System.out.println("Talla: " + this.talla + ", Color: " + this.color);
    }
}
