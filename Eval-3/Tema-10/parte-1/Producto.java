public class Producto implements Comparable<Producto>{
    int codigo;
    String nombre;
    double precio;
    public Producto(String nombre, int codigo, double precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
    }
    public int getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return precio;
    }
    @Override
    public String toString() {
        return this.nombre + ", Codigo: " + this.codigo + ", Precio: " + this.precio +"$";
    }
    @Override
    public int compareTo(Producto producto) {
        return this.codigo - producto.getCodigo();
    }
}
