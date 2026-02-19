package transporte_publico;

public class BilleteSencillo extends TituloTransporte{
    boolean valido = true;
    public BilleteSencillo(int numero, double precio, String zona) {
        super(numero, precio, zona);
    }
    @Override
    public boolean validarViaje() {
        //Solo se puede usar una vez, (tras validarse ya no se puede usar)
        if (this.valido) {
            System.out.println("Viaje válido");
            this.valido = false;
            return true;
        }
        else {
            System.out.println("Viaje NO válido");
            return false;
        }
    }
    @Override
    public String toString() {
        String es_valido;
        if (this.valido) {
            es_valido = "El billete es válido";
        }
        else {
            es_valido = "El billete NO es válido";
        }
        return super.toString() + ", Estado actual: " + es_valido;
    }
}
