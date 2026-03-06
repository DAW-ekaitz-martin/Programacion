package almacen;

public interface Fragil {
    int nivelFragilidad();
    default boolean requiereEmbalajeEspecial() {
        if (nivelFragilidad() >= 3) {
            return true;
        }
        return false;
    }
}
