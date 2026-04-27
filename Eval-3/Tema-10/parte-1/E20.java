import java.util.ArrayList;
import java.util.Collections;

public class E20 {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        Empleado e1 = new Empleado("Ekaitz", "Ventas", 3400.89);
        Empleado e2 = new Empleado("Mateo", "Ventas", 3300.89);
        Empleado e3 = new Empleado("Gaizka", null, 3400.89);
        Empleado e4 = new Empleado("Brandon", null, 3400.89);
        Empleado e5 = new Empleado("Walid", "Marketing", 3400.89);
        empleados.add(e1);
        empleados.add(e2);
        empleados.add(e3);
        empleados.add(e4);
        empleados.add(e5);
        System.out.println("ANTES DE ORDENAR");
        System.out.println(empleados);
        Collections.sort(empleados, (emp1, emp2) -> {
            return emp1.compareTo(emp2);
        });

        System.out.println("ORDENADO");
        System.out.println(empleados);

    }
    
}
