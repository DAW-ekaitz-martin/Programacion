package mini_simulador;

public class Arquero extends Personaje{
    public Arquero(String nombre, int vida, int ataque_base) {
        super(nombre, vida, ataque_base);
    }
    @Override
    public int calcularDanio() {
        int precision = 1 +(int)(Math.random() * 100);
        if (precision <= 10) {//Se considera como fallo
            return  0;
        }
        //Si es mayor a 10 le sumo la precisión al daño como bonus.
        return this.ataque_base + precision;
    }
}
