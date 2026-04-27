public class Producto implements Comparable<Producto>{
    String nombre, categoria;
    public Producto(String nombre, String categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getNombre() {
        return nombre;
    }
    @Override
    public String toString() {
        return this.nombre + ", Categoría: " + this.nombre;
    }
    @Override
    public int compareTo(Producto producto) {
        return this.nombre.compareTo(producto.getNombre());
    }
}
