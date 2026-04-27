public class Empleado implements Comparable<Empleado>{
    String nombre, departamento;
    double sueldo;
    public Empleado(String nombre, String departamento, double sueldo) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.sueldo = sueldo;
    }
    public String getDepartamento() {
        return departamento;
    }
    public String getNombre() {
        return nombre;
    }
    public double getSueldo() {
        return sueldo;
    }
    @Override
    public String toString() {
        return this.nombre + ", Departamento: " + this.departamento + ", Sueldo: " + this.sueldo;
    }
    @Override
    public int compareTo(Empleado empleado) {
        if (this.departamento == null || empleado.getDepartamento() == null) {
            if(this.departamento != null || empleado.getDepartamento() == null) {
                return -1;
            }
            else{
                return 1;
            }
                
        }
        else if(!this.departamento.equals(empleado.getDepartamento())) {
            return this.departamento.compareTo(empleado.getDepartamento());
        }
        else {
            if(this.sueldo - empleado.getSueldo() > 0) {
                return -1;
            }
            else {
                return 1;
            }
        }
    }
}
