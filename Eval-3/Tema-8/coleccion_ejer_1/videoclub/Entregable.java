package videoclub;

public interface  Entregable {
    void prestar();
    void devolver();
    boolean isPrestado();
    boolean compareTo(Object a); 
}
