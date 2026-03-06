package smartphone;

public interface Radio {
    void iniciarRadio();
    void detenerRadio();
    default void siguiente() {
        System.out.println("Siguiente emisora de Radio");
    }
}
