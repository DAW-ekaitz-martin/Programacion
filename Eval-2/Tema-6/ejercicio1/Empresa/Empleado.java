package Empresa;

public class Empleado {
    private String nombre;
    private double salario;
    public Empleado (String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
    public String getNombre() {
        return this.nombre;
    }
    public double getSalario() {
        return this.salario;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void getSalario(double salario) {
        this.salario = salario;
    }
    @Override
    public String toString() {
        return "Nombre: " + this.nombre + ", Salario: " + this.salario; 
    }
}
