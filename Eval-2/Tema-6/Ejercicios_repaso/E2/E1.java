import Instituto.Alumno;
import Instituto.Asignatura;
import Instituto.Matricula;
public class E1 {
    public static void main(String[] args) {
        Alumno yo = new Alumno("Ekaitz", 1);
        Asignatura programacion = new Asignatura("Programación", 324, 8);
        Asignatura bases_de_datos = new Asignatura("Bases de datos", 732, 6);
        Asignatura lenguaje_de_marcas = new Asignatura("Lenguaje de Marcas", 962, 6);
        Matricula mi_matricula = new Matricula(programacion, 9);
        Matricula mi_matricula_2 = new Matricula(bases_de_datos, -1);
        Matricula mi_matricula_3 = new Matricula(lenguaje_de_marcas, 6);

        //Matricular a un alumno
        yo.matricularAlumnos(mi_matricula);
        yo.matricularAlumnos(mi_matricula_2);
        yo.matricularAlumnos(mi_matricula_3);
        //Modificar nota de matricula
        mi_matricula.modificarNota(10);
        //mi_matricula_2.modificarNota(7);
        //Mostrar matriculas de un alumno con su nota
        System.out.println("ASIGNATURAS Y NOTAS DEL ALUMNO");
        yo.mostrarMatriculas();
        //Calcular media del Alumno
        System.out.println("MEDIA DEL ALUMNO");
        System.out.println("Media: " + yo.mediaAlumno());
        // Listar alumnos con alguna asignatura sin evaluar
        yo.alumnosNoEvaluados();
    }
}
