package centro_educativo;

public class Alumno {
    String dni, nombre, apellido_1, apellido_2;
    Examen[] examenes = new Examen[5];
    int cant_examenes = 0;
    public Alumno(String dni, String nombre, String apellido_1, String apellido_2) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido_1 = apellido_1;
        this.apellido_2 = apellido_2;
    }
    public void addExamen(Examen examen) {
        this.examenes[this.cant_examenes] = examen;
        this.cant_examenes ++;
    }
    public int getCantExamenes() {
        return this.cant_examenes;
    }
    public Examen[] getExamenes() {
        return this.examenes;
    }
}
