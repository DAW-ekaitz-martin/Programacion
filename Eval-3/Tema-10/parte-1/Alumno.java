public class Alumno implements Comparable<Alumno>{
    String nombre;
    int edad;
    double nota;
    public Alumno(String nombre, int edad, double nota) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
    }
    public int getEdad() {
        return edad;
    }
    public String getNombre() {
        return nombre;
    }
    public double getNota() {
        return nota;
    }
    @Override
    public String toString() {
        return this.nombre + ", Edad: " + this.edad + ", Nota: " + this.nota;
    }
    //E12 y E14
    @Override
    public int compareTo(Alumno alumno) {
        return this.nombre.compareTo(alumno.getNombre());
    }
   //E13
    /*@Override
    public int compareTo(Alumno alumno) {
        if(this.nota != alumno.getNota()) {
            if(this.nota - alumno.getNota() < 0) {
                return 1;
            }
            else {
                return -1;
            }
        }
        else {
            return this.edad - alumno.getEdad();
        }
    }*/
}
