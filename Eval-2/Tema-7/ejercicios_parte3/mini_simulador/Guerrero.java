package mini_simulador;

public class Guerrero extends Personaje{
    int armadura = 5;
    int bonus = 15;
    public Guerrero(String nombre, int vida, int ataque_base, int armadura) {
        super(nombre, vida, ataque_base);
        this.armadura = armadura;
    }
    @Override
    public int calcularDanio() {
        return this.ataque_base + this.bonus;

    }
    @Override
    public void recibirDanio(int danio) {
        this.vida -= (danio - this.armadura);
        if (this.vida < 0) {
            this.vida = 0;
        }
    }
}
