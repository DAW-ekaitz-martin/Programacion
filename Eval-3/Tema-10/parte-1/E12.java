import java.util.ArrayList;
import java.util.Collections;

public class E12 {
    public static void main(String[] args) {
        Alumno mateo = new Alumno("Mateo Vargas", 19, 7);
        Alumno ekaitz = new Alumno("Ekaitz Martin", 22, 10);
        Alumno walid = new Alumno("Walid Zarouk", 20, 8);
        Alumno gaizka = new Alumno("Gaizka Acosta", 22, 7.75);
        Alumno brandon = new Alumno("Brandon Palacios", 20, 7.75);
        ArrayList<Alumno> alumnos = new ArrayList<>();
        alumnos.add(mateo);
        alumnos.add(ekaitz);
        alumnos.add(walid);
        alumnos.add(brandon);
        alumnos.add(gaizka);
        System.out.println("ANTES DE ORDENAR");
        System.out.println(alumnos);
        Collections.sort(alumnos, (a1, a2) -> {
            return a1.compareTo(a2);
        });
        System.out.println("DESPUÉS DE ORDENAR");
        System.out.println(alumnos);
    }
}
