public class Persona {
    String nombre, direccion;
    int edad;
    int numero_de_coches = 0;
    Coche[] lista_coches = new Coche[3];

    Persona(String nombre, int edad,String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
    }
    void aniadir_Coche(Coche nuevoCoche) {
        this.lista_coches[this.numero_de_coches] = nuevoCoche;
        this.numero_de_coches ++;
    }
}
