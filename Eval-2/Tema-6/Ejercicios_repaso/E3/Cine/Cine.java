package Cine;

public class Cine {
    String nombre;
    Pelicula[] peliculas = new Pelicula[20];//Mi cine tendrá 20 pelis
    Sala[] salas = new Sala[10];// Y 10 salas
    Sesion[] sesiones = new Sesion[30]; //Vamos a poner un máximo de 30 sesiones
    int cant_pelis, cant_salas, cant_sesiones = 0;
    public Cine(String nombre) {
        this.nombre = nombre;
    }

    //Añadir peliculas
    public void aniadirPeli(Pelicula pelicula) {
        if(!comprobarPelisRepetidas(pelicula)) {
            this.peliculas[this.cant_pelis] = pelicula;
            cant_pelis ++;
        }
        else {
           System.out.println("Esta pelicula ya se añadió"); 
        } 
    }
    //Añadir salas
    public void aniadirSala(Sala sala) {
        this.salas[this.cant_salas] = sala;
        cant_salas ++;
    }
    //Añadir Sesiones
    public void aniadirSesion(Sesion sesion) {
        if(!comprobarSesionesRepetidas(sesion)) {
            this.sesiones[this.cant_sesiones] = sesion;
            cant_sesiones ++;
        }
        else {
           System.out.println("Esta pelicula ya se añadió"); 
        } 
    }
    //Mostrar las peliculas del cine
    public void getPeliculas() {
       for (int i = 0; i < this.cant_pelis; i++) {
            System.out.println(this.peliculas[i]); 
        } 
    }
    //Mostrar las sesiones del cine
    public void getSesiones() {
       for (int i = 0; i < this.cant_sesiones; i++) {
            System.out.println(this.sesiones[i]); 
        } 
    }
    //Saber la sesión más libre(la que más entradas disponibles tiene)
    public Sesion getsesionMasLibre() {
        Sesion sesion_mas_libre = this.sesiones[cant_sesiones-1];//Tiene que ser la posición -1, ya que "cant_sesiones" en la longitud, y debo acceder a la posicion, que siempre es 1 menos.
        for (int i = 0; i < this.cant_sesiones; i++) {
            if (this.sesiones[i].sala.getEntradasDisponibles() > sesion_mas_libre.sala.getEntradasDisponibles()) {
                sesion_mas_libre = sesiones[i];
            }
        }
        return sesion_mas_libre;
    }
    public boolean comprobarPelisRepetidas(Pelicula pelicula) {
        boolean repetida = false;
        for (int i = 0; i < cant_pelis; i++) {
            if (this.peliculas[i].codigo == pelicula.codigo) {
                repetida = true;
            }
        }
        return repetida;
    }
    public boolean comprobarSesionesRepetidas(Sesion sesion) {
        boolean repetida = false;
        for (int i = 0; i < cant_sesiones; i++) {
            if (this.sesiones[i].codigo_sesion == sesion.codigo_sesion) {
                repetida = true;
            }
        }
        return repetida;
    }
}
