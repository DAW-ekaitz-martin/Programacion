package plataforma;

public interface Ofertable {
    String getTitulo();
    String getProfesor();
    int duracionHoras();
    double precio();
    default double valorPorHora() {
        return precio()/duracionHoras();
    }
    default boolean recomendable() {
        if (valorPorHora() < 15) {
            return true;
        }
        return false;
    }

}
