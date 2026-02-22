package fabrica;

public class SensorTemperatura extends Sensor{
    final int umbral = 30;
    public SensorTemperatura(int id, String ubicacion, double[] lecturas, String tipo) {
        super(id, ubicacion, lecturas, tipo);
    }
    @Override
    public String obtenerAlarma() {
        if(mediaLecturas(this.lecturas) > umbral) {
            return "PELIGRO";
        }
        return "OK";
    }
}
