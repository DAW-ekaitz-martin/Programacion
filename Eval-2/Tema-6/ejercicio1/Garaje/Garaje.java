package Garaje;
import Vehiculos.Coche;
public class Garaje {
    int numero_de_coches = 0;
    Coche[] coches = new Coche[4];//De momento no lo meto en el constructor paa que no me lo exija al crear el objeto.
    public Garaje(int numero_de_coches) {
        this.numero_de_coches = numero_de_coches;
    }
    public void aniadirCoches(Coche coche) {
        this.coches[this.numero_de_coches] = coche;
        this.numero_de_coches ++;
    }
    public void mostrarCoches() {
        for (int i = 0; i < this.numero_de_coches; i++) {
           System.out.println(this.coches[i].getMarca());
           System.out.println(this.coches[i].getModelo());
           System.out.println("");
        }
    }
}
