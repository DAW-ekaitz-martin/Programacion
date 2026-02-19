package transporte_publico;

public class TarjetaMonedero extends TituloTransporte{
    double saldo;
    final double coste_z1 = 0.60;
    final double coste_z2 = 0.80;
    final double coste_z3 = 0.75;
    public TarjetaMonedero(int numero, double precio, String zona, double saldo) {
        super(numero, precio, zona);
        this.saldo = saldo;
    }
    @Override
    public boolean validarViaje() {
        //Si tiene dinero suficiente devuelve true, sino false
        if (this.saldo > 0.60) {
            System.out.println("Viaje válido");
            switch(this.zona) {
                case "Z1" -> {
                    this.saldo -= this.coste_z1;
                    System.out.println("Viaje de Zona 1");
                }
                case "Z2" -> {
                    this.saldo -= this.coste_z2;
                    System.out.println("Viaje de Zona 1");
                }
                case "Z3" -> {
                    this.saldo -= this.coste_z3;
                    System.out.println("Viaje de Zona 1");
                }
            }
            return true;
        }
        else {
            System.out.println("Viaje NO válido");
            System.out.println("No hay saldo suficiente para realizar el viaje");
            return false;
        }
    }
    @Override
    public String toString() {
        return super.toString() + ", Saldo: " + this.saldo + "$";
    }
}
