package armario;

public class Armario {
    Ropa[] armario = new Ropa[10];
    int cant_prendas= 0;
    
    public void agregarPrenda(Ropa prenda) {
        this.armario[this.cant_prendas] = prenda;
        this.cant_prendas ++;
    }
    public void mostrarPrendas() {
        for (int i = 0; i < this.cant_prendas; i++) {
            this.armario[i].tipoDePrenda();
            this.armario[i].mostrarInfo();

        }
    }
}
