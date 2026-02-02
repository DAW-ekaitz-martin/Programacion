package Tienda;

public class LineaCarrito {
    Producto producto;
    int unidades;
    
    public LineaCarrito(Producto producto, int unidades) {
        this.producto = producto;
        this.unidades = unidades;
    }
    @Override
    public String toString() {
        return this.producto + ", unidades: " + this.unidades;
    }
}
