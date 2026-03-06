package almacen;

public interface Perecedero {
    int diasParaCaducar();
    default boolean urgente() {
        if (diasParaCaducar() <= 2) {
            return true;
        }
        return false;
    }
}
