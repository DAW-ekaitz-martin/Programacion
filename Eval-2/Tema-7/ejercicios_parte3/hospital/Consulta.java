package hospital;

public class Consulta extends ActoMedico{
    String especialidad;
    public Consulta(int id, String nombrePaciente, double costeBase, String especialidad) {
        super(id,nombrePaciente, costeBase);
        this.especialidad = especialidad;
    }
    @Override
    public double calcularCoste() {
        double coste;
        double recargo;
        if (this.especialidad.equals("Traumatologo")) {
            recargo = 0;
        }
        else if (this.especialidad.equals("Oculista")) {
            recargo = this.costeBase * 0.15;
        }
        else {
            recargo = this.costeBase * 0.30;
        }
        coste = this.costeBase + recargo;
        return coste;
    }
    @Override
    public String toString() {
        return super.toString() + ", Espeialidad: " + this.especialidad;
    }
}
