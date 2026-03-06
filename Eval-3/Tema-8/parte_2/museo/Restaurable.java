package museo;

public interface Restaurable {
    int estado();
    double costeRestauracion();
    default boolean necesitaRestauracion() {
        if (estado() < 40) {
            return true;
        }
        return false;
    }
}
