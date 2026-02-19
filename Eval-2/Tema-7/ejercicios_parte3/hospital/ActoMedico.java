package hospital;

public abstract class ActoMedico {
    int id;
    String nombrePaciente;
    double costeBase;
    public ActoMedico(int id, String nombre, double costeBase) {
        this.id = id;
        this.nombrePaciente = nombre;
        this.costeBase= costeBase;
    }
    public abstract double calcularCoste();
    @Override
    public String toString() {
        return "Id: " + this.id + ", Nombre: " + this.nombrePaciente + ", Coste base: " + this.costeBase;
    }
}
