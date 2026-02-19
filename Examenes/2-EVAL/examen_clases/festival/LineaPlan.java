package festival;
public class LineaPlan {
    Concierto concierto;
    int numero_de_entradas;

    public LineaPlan(Concierto concierto, int numero_entradas) {
        this.concierto = concierto;
        this.numero_de_entradas = numero_entradas;
    }

    /**
     * Devuelve la cantidad a pagar por ese concierto
     * @param precio El precio por entrada
     * @param numero_de_entradas El número de entradas
     * @return Devuelve el costo de todas las entradas
     */
    public double subtotal(double precio, int numero_de_entradas) {
        return precio * numero_de_entradas;
    }
}
