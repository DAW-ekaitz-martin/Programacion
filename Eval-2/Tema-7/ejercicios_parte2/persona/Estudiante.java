package persona;

public class Estudiante extends Persona{
    String grado;
    public Estudiante(String grado, String nombre, int edad) {
        super(nombre,edad);
        this.grado = grado;
    }
    @Override
    public String presentarse() {
        return super.presentarse() + " y estoy cursando el grado de " + this.grado; //E1;
    }
}
