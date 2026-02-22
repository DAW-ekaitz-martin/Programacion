package mini_simulador;

public abstract class Personaje{
    String nombre;
    int vida, ataque_base;
    public Personaje(String nombre, int vida, int ataque_base) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque_base = ataque_base;
    }
    public abstract int calcularDanio();
    public void recibirDanio(int danio) {
        this.vida -= danio;
        if (this.vida < 0) {
            this.vida = 0;
        }
    }
    public boolean estaVivo() {
        if (this.vida >= 1) {
            //System.out.println("Está vivo");
            return true;
        }
        //System.out.println("Está muerto");
        return false;
    }
    @Override
    public String toString() {
        return "Nombre: " + this.nombre + ", Vida: " + this.vida + ", Ataque base:" + this.ataque_base;
    }
}
