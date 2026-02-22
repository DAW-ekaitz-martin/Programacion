package fabrica;

public abstract class Sensor {
    int id;
    String ubicacion;
    double[] lecturas = new double[7];
    String tipo;
    int cant_lecturas = 0;
    public Sensor(int id, String ubicacion, double[] lecturas, String tipo) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.lecturas = lecturas;
        this.tipo = tipo;
    }

    public abstract String obtenerAlarma();
    public double mediaLecturas(double[] lecturas) {
        double total_lecturas = 0;
        for (int i = 0; i<= lecturas.length-1; i++) {
            total_lecturas += lecturas[i];
        }
        return total_lecturas / lecturas.length;
    }
    @Override
    public String toString() {
        return "Id: " + this.id + ", Tipo: " + this.tipo + ", Media: " + mediaLecturas(this.lecturas) + ", Alarma: " + obtenerAlarma();
    }

    public int getId() {
        return this.id;
    }
}
