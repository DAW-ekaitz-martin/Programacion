package fabrica;

public class SensorHumo extends Sensor{
    final int limite = 43;
    public SensorHumo(int id, String ubicacion, double[] lecturas, String tipo) {
        super(id, ubicacion, lecturas, tipo);
    }
    @Override
    public String obtenerAlarma() {
        String respuesta = "OK";
        int cont_lecturas_sobre_limite = 0;
        for (int i = 0; i <= this.lecturas.length-1; i++) {
            if(this.lecturas[i] > limite) {
                cont_lecturas_sobre_limite ++;
            }
        }
        if(cont_lecturas_sobre_limite >= 2)
            respuesta = "PELIGRO";
        return respuesta;
    }
}
