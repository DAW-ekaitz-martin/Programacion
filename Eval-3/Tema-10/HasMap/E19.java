
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class E19 {
    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        Alumno a1 = new Alumno("2233445", "Ekaitz", 9.9);
        Alumno a2 = new Alumno("2233445", "Gaizka", 7.9);
        Alumno a3 = new Alumno("2233445", "Mateo", 6.3);
        Alumno a4 = new Alumno("2233445", "Walid", 8.4);
        Alumno a5 = new Alumno("22330445", "Marcos", 7.4);
        Alumno a6 = new Alumno("2233445", "Ekaitz", 2.9);
        Alumno a7 = new Alumno("2233445", "Gaizka", 7.9);
        Alumno a8 = new Alumno("22339445", "Nacho", 6.3);
        Alumno a9 = new Alumno("2233445", "Walid", 7.4);
        Alumno a10 = new Alumno("22133445", "Felipe", 6.4);
        
        alumnos.add(a1);
        alumnos.add(a2);
        alumnos.add(a3);
        alumnos.add(a4);
        alumnos.add(a5);
        alumnos.add(a6);
        alumnos.add(a7);
        alumnos.add(a8);
        alumnos.add(a9);
        alumnos.add(a10);

        Map<String, Alumno> alumnosHash = new HashMap<>();
        for (int i = 0; i < alumnos.size(); i++) {
            if(alumnosHash.containsKey(alumnos.get(i).getDni())) {
                //Si la nota del alumno almacenado en el Hash(que he accedido por su key es menor la cambio)
                if(alumnosHash.get(alumnos.get(i).getDni()).getNota() <= alumnos.get(i).getNota()) {
                    alumnosHash.put(alumnos.get(i).getDni(), alumnos.get(i));
                }
            }
            else {
                alumnosHash.put(alumnos.get(i).getDni(), alumnos.get(i));
            }
        }
        System.out.println("HashMap:");
        for(Map.Entry<String, Alumno> en : alumnosHash.entrySet()) {
            System.out.println(en);
            
        }

    }
}
