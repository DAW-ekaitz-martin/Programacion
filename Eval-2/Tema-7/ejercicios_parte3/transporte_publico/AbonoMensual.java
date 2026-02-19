package transporte_publico;

public class AbonoMensual extends TituloTransporte{
    int mes_valido = 2;
    final int mes_actual = 2;
    public AbonoMensual(int numero, double precio, String zona, int mes_valido) {
        super(numero, precio, zona);
        this.mes_valido = mes_valido;
    }
    @Override
    public boolean validarViaje() {
        if (this.mes_valido == this.mes_actual) {
            System.out.println("Viaje válido");
            return true;
        }
        System.out.println("Viaje NO válido");
        return false;
    }
    @Override
    public String toString() {
        return super.toString() + ", Mes valido: " + this.mes_valido;
    }
}
