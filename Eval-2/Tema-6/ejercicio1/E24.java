import Departamento.Departamento;
import Empresa.Empleado;
public class E24 {
    public static void main(String[] args) {
        Departamento depto = new Departamento("Ventas");
        Empleado yo = new Empleado("Ekaitz", 10000);
        Empleado JosebaJartangas = new Empleado("Joseba", 400);
        Empleado AinhoaGaspis = new Empleado("Ainhoa", 1200);
        depto.setEmpleado(yo);
        depto.setEmpleado(JosebaJartangas);
        depto.setEmpleado(AinhoaGaspis);
        depto.MostrarEmpleados();
    }
    
}
