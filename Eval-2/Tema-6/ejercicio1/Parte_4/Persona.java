package Parte_4;
public class Persona {
    String nombre, direccion;
    int edad;
    int numero_de_coches = 0;
    Coche[] lista_coches = new Coche[3];

    public Persona(String nombre, int edad,String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
    }
    public void mostrarInformacion() {
        System.out.println(this.nombre);
        System.out.println(this.direccion);
        System.out.println(this.edad);
        System.out.println("Tiene: " + this.numero_de_coches + " coches");
    }
    public void aniadir_Coche(Coche nuevoCoche) {
        this.lista_coches[this.numero_de_coches] = nuevoCoche;
        this.numero_de_coches ++;
    }
    public void listarCoches() {
        for (int i = 0; i < this.numero_de_coches; i++) {
            System.out.println(this.lista_coches[i].marca);
        }
    }
    public boolean tieneCochesAntiguos() {
        for (int i = 0; i < this.numero_de_coches; i++) {
            if(this.lista_coches[i].esAntiguo()) {
                return true;
            }
        }
        return false;
    }
}
