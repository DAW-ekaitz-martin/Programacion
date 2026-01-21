import Parte_5.Producto;
public class E21 {
    public static void main(String[] args) {
        Producto mi_producto = new Producto("Móvil", 29.99);
        System.out.println(mi_producto.getNombre());
        System.out.println(mi_producto.getPrecio() + " euros");

    }
}
