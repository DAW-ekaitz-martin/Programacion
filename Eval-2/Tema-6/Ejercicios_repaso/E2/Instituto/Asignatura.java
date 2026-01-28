package Instituto;
public class Asignatura {
    String nombre;
    int codigo, horas_semanales;
    public Asignatura(String nombre, int codigo, int horas_semanales) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.horas_semanales = horas_semanales;
    }
    @Override
    public String toString() {
        return this.nombre + ", Código Asignatura: " + this.codigo + ", Horas semanales: " + this.horas_semanales;
    }
}
