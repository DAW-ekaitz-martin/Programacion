package Departamento;
import Empresa.Empleado;

public class Departamento {
    private String nombre;
    public int numero_empleados = 0;
    Empleado[] empleados = new Empleado[4];
    public Departamento (String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }
    public String getEmpleado(String nombre_empleado) {
        for (int i = 0; i <= this.empleados.length-1; i++) {
            if (this.empleados[i].getNombre().equals(nombre_empleado)) {
                return this.empleados[i].getNombre();
            }
        }
        return "El empleado no se encuentra en este departamento";
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEmpleado(Empleado empleado) {
        this.empleados[this.numero_empleados] = empleado;
        this. numero_empleados ++;
    }
    public void MostrarEmpleados() {
        for (int i = 0; i < this.numero_empleados; i++) {
            System.out.println(this.empleados[i]);
        }
    }
}
