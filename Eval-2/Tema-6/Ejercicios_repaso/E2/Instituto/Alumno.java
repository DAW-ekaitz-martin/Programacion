package Instituto;
public class Alumno {
    String nombre;
    int num_expediente;
    int cant_matriculas = 0;
    Matricula[] matriculas = new Matricula[5];
    public Alumno(String nombre, int num_expedinete) {
        this.nombre = nombre;
        this.num_expediente = num_expedinete;
    }
    public void matricularAlumnos(Matricula matricula) {
        for (int i = 0; i < this.cant_matriculas; i++) {
            if (this.matriculas[i].getNombre().equals(matricula.getNombre())) { //Verifico que no se pueda matricular la misma asignatura mas de una vez al mismo alumno
                System.out.println("No se pueden matricular la misma asignatura dos veces al mismo alumno");
                return;
            }
        }
        this.matriculas[this.cant_matriculas] = matricula;
        this.cant_matriculas ++;
    }
    @Override
    public String toString() {
        return this.nombre + ", Numero expediente: " + this.num_expediente;
    }
    public void mostrarMatriculas() {
        for (int i = 0; i < this.cant_matriculas; i++) {
            System.out.println(this.matriculas[i]);
        }
    }
    public double mediaAlumno() {
        int suma_de_notas = 0;
        for (int i = 0; i < this.cant_matriculas; i++) {
            if(this.matriculas[i].nota != 1) {//Porque las que tengan una nota de 1 se consideran no evaluadas
                suma_de_notas += this.matriculas[i].nota;
            }
        }
        return (double) suma_de_notas / this.cant_matriculas;
    }
    public void alumnosNoEvaluados() {
        boolean sin_evaluar = false;
        for (int i = 0; i < this.cant_matriculas; i++) {
            if(this.matriculas[i].nota == 1) {//Porque las que tengan una nota de 1 se consideran no evaluadas
                sin_evaluar = true;
            }
        }
        if (sin_evaluar) {
            System.out.println("Alumnos con alguna asignatura sin evaluar:");
            System.out.println(this.nombre);
        }
        else {
            System.out.println("El alumno " + this.nombre + " tiene todas las asignaturas evaluadas");
        }
    }

}
