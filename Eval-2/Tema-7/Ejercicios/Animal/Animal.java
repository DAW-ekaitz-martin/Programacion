package Animal;
public abstract class Animal {//Animal ya lo estabamos usando como una clase abstracta, simplemente que ahora lo pongo al crear la clase, pero el funcionamineto es el mismo, hacer la clase generalizada para poder crear subclases de cualquier tipo de animal sin problemas.
    String nombre;
    int edad = 0;
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public Animal(String nombre) {
        this.nombre = nombre;
    }
    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
    public String mostrarInformacion() {
       return "El animal se llama: " + this.nombre + " y tiene " + this.edad + " años";
    }
    public abstract void desplazarse();
}