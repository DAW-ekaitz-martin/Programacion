package Instituto;

public class Matricula {
    Asignatura asignatura = new Asignatura(null, 0, 0);
    int nota = 1;
    public Matricula(Asignatura asignatura, int nota) {
        this.asignatura = asignatura;
        this.nota = nota;
    }
    public void modificarNota(int nota) {
        this.nota = nota;
    }
    public String getNombre() {
        return this.asignatura.nombre;
    }
    @Override
    public String toString() {
        return "Asignatura: " + this.asignatura + ", nota: " + this.nota;
    }
}
