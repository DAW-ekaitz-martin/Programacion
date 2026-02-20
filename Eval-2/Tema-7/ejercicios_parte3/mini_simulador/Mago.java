package mini_simulador;

public class Mago extends Personaje{
    int mana;
    public Mago(String nombre, int vida, int ataque_base, int mana) {
        super(nombre, vida, ataque_base);
        this.mana = mana;
    }
    @Override
    public int calcularDanio() {
        if (this.mana > 5) {
            this.mana-=5;
            return this.ataque_base + (this.mana / 5);
        }
        System.out.println("No hay mana suficiente, no se ha podido ejecutar el ataque");
        return 0;
    }
}
