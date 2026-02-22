package fabrica;

public class SensorPresion extends Sensor{
    final double rango_inferior = 5.3;
    final double rango_superior = 55.7;
    public SensorPresion(int id, String ubicacion, double[] lecturas, String tipo) {
        super(id, ubicacion, lecturas, tipo);
    }
    @Override
    public String obtenerAlarma() {
        for (int i = 0; i <= this.lecturas.length-1; i++) {
            if(this.lecturas[i] < this.rango_inferior || this.lecturas[i] > this.rango_superior) {
                
                return "AVISO";
            }
        }
        return "OK";
    }
}
