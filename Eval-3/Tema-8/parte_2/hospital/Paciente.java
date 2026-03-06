package hospital;

public class Paciente {
    private int id, edad, minutosEspera, triaje;
    private String nombre;
    public Paciente(String nombre, int id, int edad, int minutosEspera, int triaje) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.minutosEspera = minutosEspera;
        this.triaje = triaje;
    }

    public int getTriaje() {
        return this.triaje;
    }
    public int getMinutosEspera() {
        return this.minutosEspera;
    }
    public int getEdad() {
        return this.edad;
    }
    public int getId() {
        return this.id;
    }
    @Override
    public String toString() {
        return "Nombre: " + this.nombre + ", id: " + this.id + ", Edad: " + this.edad + ", Minutos de Espera: " + this.minutosEspera + ", Triaje: " + this.triaje;
    }
}
