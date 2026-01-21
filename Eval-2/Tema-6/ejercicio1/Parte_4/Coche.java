package Parte_4;
public class Coche {
    
    String marca;
    int anio;
    public Coche (String marca, int anio) {
        this.marca = marca;
        this.anio = anio;
    }
    public void mostrarInformacion() {
        System.out.println(this.marca);
    }
    public boolean esDeMarca(String marcaBuscada) {
        boolean iguales = false;
        if(this.marca.equals(marcaBuscada))
            iguales = true;
        return iguales;
    }
    public boolean esAntiguo() {
        if (2026 - this.anio > 10) {
            return true;
        }
        return false;
    }

}
